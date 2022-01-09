package com.AdvancedJava.Jdbc;

import javax.swing.*;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class test {
    public static void main(String[] args){
        try {
            Enumeration<Driver> drivers = DriverManager.getDrivers();
            while (drivers.hasMoreElements()) {
                Driver nextElement = drivers.nextElement();
                JOptionPane.showMessageDialog(null, nextElement.acceptsURL("jdbc:postgresql://localhost:5432/postgres"));
                JOptionPane.showMessageDialog(null, nextElement.acceptsURL("Jdbc:postgresql://localhost:5432/postgres"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
