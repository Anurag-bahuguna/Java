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

        try{
            Connection connection = DriverManager.getConnection(URL, username, password);
            Statement statement = connection.createStatement();
            String query = "select * from student";
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                String sname = resultSet.getString("sname");
                int rollno = resultSet.getInt("rollno");
                System.out.println("student name: "+sname);
                System.out.println("student rollno: "+rollno);
            }

        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
