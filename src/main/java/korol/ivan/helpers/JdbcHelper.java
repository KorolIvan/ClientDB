package korol.ivan.helpers;

import java.sql.*;

/**
 * @author by Ivan Korol on 6/20/2017.
 */
public class JdbcHelper {

    private static final String DB_CONNECTION = "jdbc:sqlite:sql/clients.sqlite";

    static Connection dbConnection;
    static Statement statement;
    static PreparedStatement preparedStatement;
    static ResultSet rs;
    
    

    private static Connection getDBConnection() {
        Connection dbConnection = null;

        try {
            Class.forName("org.sqlite.JDBC");
            dbConnection = DriverManager.getConnection(DB_CONNECTION);
            dbConnection.setAutoCommit(true);
            return dbConnection;
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return dbConnection;
    }




    public static void closeContection() {
        try {
            if (statement != null) {
                statement.close();
            }

            if (dbConnection != null) {
                dbConnection.close();
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }

}
