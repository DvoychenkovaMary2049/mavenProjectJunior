package lesson27;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students_26?user", "root", "Popovamasha1995@" );
            System.out.println("qwerty");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
