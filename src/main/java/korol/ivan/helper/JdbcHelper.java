package korol.ivan.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class JdbcHelper {
    //todo connection

    private static final String DB_CONNECTION = "jdbc:sqlite:sql/client.db";
    private static Connection connection;

    public static Connection getConnection() {
        try{
            connection = DriverManager.getConnection(DB_CONNECTION);
            connection.setAutoCommit(true);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    public void closeConnection() {
        try{
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



}
