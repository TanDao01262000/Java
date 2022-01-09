package com.AdvancedJava.Jdbc;

// This requires a jar file from postgresql, it locates at
import java.sql.*;

public class Jdbc {
    public static void main(String[] args) throws SQLException {

        // create a connection
        String url = "jdbc:postgresql://localhost/classmates";
        Connection connection = null;

        int id = 1;
        String name = "music";
        String writer = "Mr.Siro";
        String type = "Ballad";
        String correctName = "Buc Tranh Tu Nuoc Mat";

        String sqlExecute = "INSERT INTO music(id, name, writer, type) "+"VALUES(" + id +",'" + name+ "', '" + writer + "', '" +type +"');";
        String sql = "UPDATE music SET name = " + "'" + correctName +"'" +"WHERE id = " + id +";";

        try {
            connection = DriverManager.getConnection(url, "postgres", "Whatever123:)");

            Statement statement = connection.createStatement();
            int status = statement.executeUpdate(sql);

            if (status == 1){
                System.out.println("Update successfully: " + sql);
            } else{
                System.out.println("Failed");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally{
            connection.close();
        }
    }
}
