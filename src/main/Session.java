/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Faruk
 */
public class Session {

    public static boolean isLoggedIn = false;
    public static String name;
    public static String username;
    public static int type;

    public static String getUsername() {
        return username;
    }

    public static int getType() {
        return type;
    }

    public static void setSession(String nameString, String user, int userType) {
        name = nameString;
        isLoggedIn = true;
        username = user;
        type = userType;
    }

    public static void logout() {
        name = null;
        isLoggedIn = false;
    }

    public static boolean loggedIn() {
        return isLoggedIn;
    }

    public static String getName() {
        return name;
    }
}
