/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.io.File;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import main.OrdersPanel;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Faruk
 */
public class Order extends DB {

    public static void getAll() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Kode");
        base.addColumn("Tanggal");
        base.addColumn("Nama");
        base.addColumn("Kontak");
        base.addColumn("Pesanan (karung)");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT * FROM orders WHERE id NOT IN (SELECT order_id FROM sales)");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("id"),
                    result.getString("code"),
                    result.getString("date"),
                    result.getString("name"),
                    result.getString("contact"),
                    result.getString("weight")
                });
            }
            OrdersPanel.ordersTable.setModel(base);
            OrdersPanel.ordersTable.removeColumn(OrdersPanel.ordersTable.getColumnModel().getColumn(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void create(String name, String date, String contact, String weight) {
        try {
            String generatedColumns[] = {"ID"};
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO orders (name,date,contact,weight) VALUES(?,?,?,?)", generatedColumns);
            statement.setString(1, name);
            statement.setString(2, date);
            statement.setString(3, contact);
            statement.setString(4, weight);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                int id = rs.getInt(1);
                PreparedStatement statementUp = query.prepareStatement("UPDATE orders SET code=CONCAT('OR',LPAD(?, 4, '0')) WHERE ID=?");
                statementUp.setString(1, Integer.toString(id));
                statementUp.setString(2, Integer.toString(id));
                statementUp.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(String id, String name, String date, String contact, String weight) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("UPDATE orders SET name=?, date=?, contact=?, weight=? WHERE ID=?");
            statement.setString(1, name);
            statement.setString(2, date);
            statement.setString(3, contact);
            statement.setString(4, weight);
            statement.setString(5, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void delete(String id) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("DELETE FROM orders WHERE ID=? LIMIT 1");
            statement.setString(1, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static Map getOrderByCode(String code) {
        Map<String, String> orders = new HashMap<>();
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT * FROM orders WHERE code = ?");
            statement.setString(1, code);

            ResultSet rs = statement.executeQuery();

            while (rs.next()) {
                orders.put("id", rs.getString("id"));
                orders.put("name", rs.getString("name"));
                orders.put("weight", rs.getString("weight"));
                orders.put("date", rs.getString("date"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return orders;
    }

    public static ArrayList getCodes() {
        ArrayList<String> codes = new ArrayList<String>();
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT code FROM orders WHERE id NOT IN (SELECT order_id FROM sales) ");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                codes.add(result.getString("code"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return codes;
    }

    public static void print() {
        try {
            Connection connection = connect();
            JasperDesign jasperDesign = JRXmlLoader.load(new File("").getAbsolutePath() + "/src/main/Orders.jrxml");
            JasperReport jr = JasperCompileManager.compileReport(jasperDesign);
            JasperPrint jp = JasperFillManager.fillReport(jr, null, connection);
            JasperViewer.viewReport(jp);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getTotal() {
        String total = "";
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT count(id) AS total FROM orders WHERE id NOT IN (SELECT order_id FROM sales)");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                total = result.getString("total");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return total;
    }
}
