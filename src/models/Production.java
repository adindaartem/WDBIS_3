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
import main.OrdersPanel;
import main.ProductionsPanel;
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class Production extends DB {
    
    public static void getAll() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Tanggal");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT id,date_start FROM productions");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("id"),
                    result.getString("date_start")
                });
            }
            ProductionsPanel.productionDateTable.setModel(base);
            ProductionsPanel.productionDateTable.removeColumn(ProductionsPanel.productionDateTable.getColumnModel().getColumn(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
    public static Map getDate(String id) {
        Map<String,String> dates = new HashMap<>();
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT date_start,date_end FROM productions WHERE id = ?");
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                dates.put(result.getString("date_start"), result.getString("date_end"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return dates;
    }
    
       public static String getTotal(String id) {
        String total = "";
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT total_cost FROM productions WHERE id = ?");
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                total = result.getString("total_cost");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return total;
    }
    
    
    
    public static void getDetails(String id) {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("Nama");
        base.addColumn("Jumlah");
        base.addColumn("Ukuran");
        base.addColumn("Biaya");
        base.addColumn("Pemasok");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT materials.name, amount, unit, cost, suppliers.name AS supplierName FROM purchases INNER JOIN materials ON material_id = materials.id LEFT JOIN suppliers ON supplier_id = suppliers.id WHERE production_id = ?");
            statement.setString(1, id);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("name"),
                    result.getString("amount"),
                    result.getString("unit"),
                    result.getString("cost"),
                    result.getString("supplierName")
                });
            }
            ProductionsPanel.productionDetailsTable.setModel(base);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static int create(String date_start, String date_end, String total_cost, String output) {
        int id = 0;
        try {
            String generatedColumns[] = {"ID"};
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO productions (date_start,date_end,total_cost,output) VALUES(?,?,?,?)", generatedColumns);
            statement.setString(1, date_start);
            statement.setString(2, date_end);
            statement.setString(3, total_cost);
            statement.setString(4, output);
            statement.executeUpdate();

            ResultSet rs = statement.getGeneratedKeys();

            if (rs.next()) {
                id = rs.getInt(1);
            }
            
            PreparedStatement statementUp = query.prepareStatement("UPDATE stock SET total = total + ?");
            statementUp.setString(1, output);
            statementUp.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        return id;
    }
    
    public static void createPurchases(int productionId, int materialId, int supplierId, int amount, int cost) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO purchases(production_id, material_id, supplier_id, amount, cost) VALUES (?,?,?,?,?)");
            statement.setInt(1, productionId);
            statement.setInt(2, materialId);
            statement.setInt(3, supplierId);
            statement.setInt(4, amount);
            statement.setInt(5, cost);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
