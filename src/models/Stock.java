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
import javax.swing.table.DefaultTableModel;
import main.StockPanel;
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class Stock extends DB {

    public static void getSales() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("Tanggal");
        base.addColumn("Pendapatan");
        base.addColumn("Berat");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT sales.date AS date, sales.total_payment AS total, orders.weight AS weight FROM stock_history INNER JOIN sales ON(stock_history.sales_id = sales.order_id) INNER JOIN orders ON(sales.order_id = orders.id)");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("date"),
                    result.getString("total"),
                    result.getString("weight"),});
            }
            StockPanel.penjualanPupukTable.setModel(base);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getProductions() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("Tanggal");
        base.addColumn("Biaya");
        base.addColumn("Berat");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT productions.date_end AS date, productions.total_cost AS total, productions.output AS weight FROM stock_history INNER JOIN productions ON (stock_history.production_id = productions.id)");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("date"),
                    result.getString("total"),
                    result.getString("weight") + " karung"
                });
            }
            StockPanel.produksiPupukTable.setModel(base);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getStock() {
        String total = "";
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT total FROM stock");
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
