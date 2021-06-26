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
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class Production extends DB {

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
