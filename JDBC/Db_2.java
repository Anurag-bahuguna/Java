package Java.JDBC;
import java.sql.*;


public class Db_2 {
    private static final String URL = "jdbc:mysql://localhost:3306/my_db";
    private static final String username = "root";
    private static final String password = "AB32@rmaCd";
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");

        }catch (ClassNotFoundException e){
            // e.printStackTrace(); OR
            System.out.println(e.getMessage());
        }
    }
}
