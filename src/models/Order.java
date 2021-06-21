/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Faruk
 */
public class Order extends DB {
    public static void getAll(JTable table) {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Nama");
        base.addColumn("Kontak");
        base.addColumn("Berat Pupuk");
        try {
            Statement query = connect().createStatement();
            ResultSet result = query.executeQuery("SELECT * FROM orders");
            while (result.next()) {                
                base.addRow(new Object[] {
                    result.getString("id"),
                    result.getString("name"),
                    result.getString("contact"),
                    result.getString("weight") + " kg"
                });
            }
            table.setModel(base);
            table.removeColumn(table.getColumnModel().getColumn(0));
        } catch (SQLException e) {
        }
    }
}
