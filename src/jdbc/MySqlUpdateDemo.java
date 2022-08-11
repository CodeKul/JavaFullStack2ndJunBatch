package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySqlUpdateDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String url = "jdbc:mysql://localhost:3306/Java2Jun";
        String username = "root";
        String password = "Codekul@123";
        final String QUERY = "update emp set job = ? where empno = ?";
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection(url,username,password);
        PreparedStatement ps = con.prepareStatement(QUERY);
        ps.setString(1,"SALESMAN");
        ps.setInt(2,121);
        int no = ps.executeUpdate();
        System.out.println(no +"row/s affected");

    }
}
