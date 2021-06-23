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
            Statement query = connect().createStatement();
            ResultSet result = query.executeQuery("SELECT * FROM materials");
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
}
