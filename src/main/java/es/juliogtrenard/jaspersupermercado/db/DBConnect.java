package es.juliogtrenard.jaspersupermercado.db;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * Clase que maneja la conexion a la base de datos
 */
public class DBConnect {
    /**
     * La conexion
     */
    private static Connection connection;

    /**
     * Constructor
     *
     * @throws SQLException the SQL exception
     */
    public DBConnect() throws SQLException {
        Properties connConfig =loadProperties() ;
        String url=connConfig.getProperty("dburl");
        connection = DriverManager.getConnection(url, connConfig);
        connection.setAutoCommit(true);
        connection.setAutoCommit(true);
    }

    /**
     * Getter de connection.
     *
     * @return the connection
     */
    public static Connection getConnection() {
        return connection;
    }

    /**
     * Cerrar la conexion.
     *
     * @return the connection
     * @throws SQLException the SQL exception
     */
    public Connection CloseConexion() throws SQLException{
        connection.close();
        return connection;
    }

    /**
     * Carga las propiedades del archivo db.properties.
     *
     * @return the properties
     */
    public static Properties loadProperties() {
        try (FileInputStream fs = new FileInputStream("configuration.properties")) {
            Properties props = new Properties();
            props.load(fs);
            return props;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}