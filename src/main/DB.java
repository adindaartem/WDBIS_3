/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Faruk
 */
public class DB {
    public static Connection connect() {
        Connection db = null;
        try {
            String url = "jdbc:mysql://localhost:3306/sinagro";
            String user = "root";
            String password = "";
            
            db = DriverManager.getConnection(url,user,password);
        } catch (Exception e) {
            System.out.println("Dead");
        }
        
        return db;
    }
}
