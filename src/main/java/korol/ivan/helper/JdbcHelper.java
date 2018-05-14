package korol.ivan.helper;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author by Ivan Korol on 11/8/2017.
 */
public class JdbcHelper {
    //todo connection

    private static String pathToDB = "ClientDB\\sql\\";
    //private static final String DB_CONNECTION = "jdbc:sqlite:" + pathToDB + "sql\\client.db";
    private static final String DB_CONNECTION = "jdbc:sqlite:C:\\documents\\client db\\ClientDB\\sql\\client.db";

    static Connection connection;
    static PreparedStatement preparedStatement;

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

    public static void closeConnection() {
        try{
            if (connection != null){
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static PreparedStatement getPreparedStatement(String querySQL) throws SQLException{
        connection = getConnection();

        preparedStatement = connection.prepareStatement(querySQL);

        return preparedStatement;
    }



}
