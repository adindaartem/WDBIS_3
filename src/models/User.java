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
import main.Session;
import main.UsersPanel;
import static models.DB.connect;

/**
 *
 * @author Faruk
 */
public class User extends DB {

    public static void create(String name, String username, String password, String type) {
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("INSERT INTO users (name,username,password,user_type_id) VALUES(?,?,?,?)");
            statement.setString(1, name);
            statement.setString(2, username);
            statement.setString(3, password);
            statement.setString(4, type);
            statement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void getAll() {
        DefaultTableModel base = new DefaultTableModel();
        base.addColumn("id");
        base.addColumn("Nama");
        base.addColumn("Username");
        base.addColumn("Password");
        base.addColumn("Role");
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT users.id, users.name, username, password, user_types.name AS role FROM users INNER JOIN user_types ON users.user_type_id = user_types.id");
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                base.addRow(new Object[]{
                    result.getString("id"),
                    result.getString("name"),
                    result.getString("username"),
                    result.getString("password"),
                    result.getString("role")
                });
            }
            UsersPanel.usersTable.setModel(base);
            UsersPanel.usersTable.removeColumn(UsersPanel.usersTable.getColumnModel().getColumn(0));
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static String getPassword(String username) {
        String password = null;
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT password FROM users WHERE username = ?");
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                password = result.getString("password");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return password;
    }

    public static void login(String username) {
        String user = null;
        String name = null;
        int type = 0;
        try {
            Connection query = connect();
            PreparedStatement statement = query.prepareStatement("SELECT * FROM users WHERE username = ?");
            statement.setString(1, username);
            ResultSet result = statement.executeQuery();
            while (result.next()) {
                user = result.getString("username");
                name = result.getString("name");
                type = result.getInt("user_type_id");
            }

            Session.setSession(name, user, type);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
