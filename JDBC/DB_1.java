package Java.JDBC;
import java.sql.*;
        /*not working */

//JDBC
public class DB_1 {
    public static void main(String[] args) throws Exception {
        String query = "select * from student";
        Class.forName("com.mysql.jdbc.Driver");  //here .mysql is driver name  
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/my_DB","root","AB32@rmaCd");
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery(query);

        rs.next();
        String sname = rs.getString(1);
        int roll = rs.getInt(2);
        System.out.println(sname + ":" + roll);

        st.close();
        con.close();
       }
}



    /*      basic boiler plate code for JDBC
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


        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
 */





// seven steps to connect to the database in java
// 1. import the package
// 1. Register the driver class or we have to load the driver class
// 2.get the connection