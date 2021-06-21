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
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

/**
 *
 * @author Faruk
 */
public class Supplier extends DB{

    public static void getAll(JTable table) {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Nama");
        base.addColumn("Alamat");
        base.addColumn("Kontak");
        try {
            Statement query = connect().createStatement();
            ResultSet result = query.executeQuery("SELECT * FROM suppliers");
            while (result.next()) {                
                base.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("name"),
                    result.getString("address"),
                    result.getString("contact")
                });
            }
            
            table.setModel(base);
            table.removeColumn(table.getColumnModel().getColumn(0));
        } catch (SQLException e) {
        }
    }
    
    public static void update(String id, String name, String address, String contact) {
        try {
            Connection query = connect();
            
            PreparedStatement statement = query.prepareStatement("UPDATE suppliers SET name=?, address=?, contact=? WHERE ID=?");
            statement.setString(1, name);
            statement.setString(2, address);
            statement.setString(3, contact);
            statement.setString(4, id);
            statement.executeUpdate();
            
        } catch (SQLException e) {
        }
    }
    
    public static void delete(String id) {
        try {
            Connection query = connect();
            
            PreparedStatement statement = query.prepareStatement("DELETE FROM suppliers WHERE ID=? LIMIT 1");
            statement.setString(1, id);
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
