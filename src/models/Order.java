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
import main.OrdersPanel;

/**
 *
 * @author Faruk
 */
public class Order extends DB {
    public static void getAll() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Tanggal");
        base.addColumn("Nama");
        base.addColumn("Kontak");
        base.addColumn("Berat Pupuk (kg)");
        try {
            Statement query = connect().createStatement();
            ResultSet result = query.executeQuery("SELECT * FROM orders");
            while (result.next()) {                
                base.addRow(new Object[] {
                    result.getString("id"),
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
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO orders (name,date,contact,weight) VALUES(?,?,?,?)");
            statement.setString(1, name);
            statement.setString(2, date);
            statement.setString(3, contact);
            statement.setString(4, weight);
            statement.executeUpdate();
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
}
