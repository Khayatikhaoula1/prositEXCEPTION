package ExceptionChecked;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test {

    public static void main(String[] args) {

        try {
            connect();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }


    public static void connect() throws SQLException {
        Connection con = DriverManager.getConnection("", "", "");
    }
}
