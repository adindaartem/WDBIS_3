/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class User extends DB {

    public static void create(String name, String username, String password, String type) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO users (name,username,password,user_type_id) VALUES(?,?,?)");
            statement.setString(1, name);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setString(4, type);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
