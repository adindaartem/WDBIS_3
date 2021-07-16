/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import main.SalesPanel;
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class Sales extends DB {

    public static void getAll() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Kode");
        base.addColumn("Nama");
        base.addColumn("Kontak");
        base.addColumn("Terjual (Karung)");
        base.addColumn("Total Bayar");
        base.addColumn("Tgl Bayar");
        try {
            Statement query = connect().createStatement();
            ResultSet result = query.executeQuery("SELECT id, code, name, contact, weight, total_payment, sales.date AS payment_date "
                    + "FROM sales INNER JOIN orders ON sales.order_id = orders.id");
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("id"),
                    result.getString("code"),
                    result.getString("name"),
                    result.getString("contact"),
                    result.getString("weight"),
                    String.format("Rp%,.0f", result.getDouble("total_payment")).replaceAll(",", "."),
                    result.getString("payment_date")
                });
            }

            SalesPanel.salesTable.setModel(base);
            SalesPanel.salesTable.removeColumn(SalesPanel.salesTable.getColumnModel().getColumn(0));
        } catch (SQLException e) {
        }
    }

    public static void create(String code, String date, String total_payment) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO sales (order_id, date, total_payment) VALUES((SELECT id FROM orders WHERE code=?), ?, ?)");
            statement.setString(1, code);
            statement.setString(2, date);
            statement.setString(3, total_payment);
            statement.executeUpdate();

            PreparedStatement statementUp = query.prepareStatement("UPDATE stock SET total = total + (SELECT weight FROM orders WHERE code=?)");
            statementUp.setString(1, code);
            statementUp.executeUpdate();

            PreparedStatement statementInsert = query.prepareStatement("INSERT INTO stock_history (stock_id, sales_id) VALUES(1,(SELECT id FROM orders WHERE code=?))");
            statementInsert.setString(1, code);
            statementInsert.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(String id, String date, String totalPayment) {
        try {
            Connection query = connect();

            PreparedStatement statement = query.prepareStatement("UPDATE sales SET date=?, total_payment=? WHERE order_id=?");
            statement.setString(1, date);
            statement.setString(2, totalPayment);
            statement.setString(3, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
