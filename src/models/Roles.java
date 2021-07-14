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
import java.util.ArrayList;

/**
 *
 * @author Faruk
 */
public class Roles extends DB {

    public static ArrayList getRoles() {

        ArrayList<String> roles = new ArrayList<String>();

        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT id, name FROM user_types");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                roles.add(result.getString("id") + ") " + result.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return roles;
    }
}
