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
import java.util.HashMap;
import java.util.Map;
import javax.swing.table.DefaultTableModel;
import main.MaterialsPanel;
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class Material extends DB {

    public static void getAll() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Nama Bahan");
        base.addColumn("Stok");
        base.addColumn("Unit");
        base.addColumn("Tipe");
        base.addColumn("Keterangan");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT * FROM materials");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("id"),
                    result.getString("name"),
                    result.getString("total"),
                    result.getString("unit"),
                    result.getString("type"),
                    result.getString("info")
                });
            }
            MaterialsPanel.materialsTable.setModel(base);
            MaterialsPanel.materialsTable.removeColumn(MaterialsPanel.materialsTable.getColumnModel().getColumn(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void update(String id, String info, String total, String unit) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("UPDATE materials SET info=?, total=?, unit=? WHERE ID=?");
            statement.setString(1, info);
            statement.setString(2, total);
            statement.setString(3, unit);
            statement.setString(4, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Map getStock() {
        Map<Integer, String> materials = new HashMap<>();
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT id,total FROM materials");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                materials.put(result.getInt("id"), result.getString("total"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return materials;
    }
    
    public static void updateStock(int id, int total) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("UPDATE materials SET total=? WHERE ID=?");
            statement.setInt(1, total);
            statement.setInt(2, id);
            statement.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
