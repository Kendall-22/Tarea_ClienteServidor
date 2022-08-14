package Conexion;

import java.lang.reflect.InvocationTargetException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Conexion {

//Atributo de tipo de la misma clase
    private static Conexion conexion;

    //URL de la conexión a la base de datos creado previamente
    private static final String DBURL = "jdbc:mysql://127.0.0.1:3306/?user=root";

    private static Connection conn = null;

    //Constructor
    private Conexion() {
//root@127.0.0.1:3306
        try {
            //Importamos el uso del conector para MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            //Definiendo los parámetros de la conexión a la base de datos, con usuario, contraseña y la URL del servidor MYSQL
            conn = DriverManager.getConnection(DBURL, "root", "127.0.0.1:3306");

        } catch (ClassNotFoundException | SQLException | NoSuchMethodException | SecurityException
                | InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static synchronized Connection getConexion() {

        if (conexion == null) {

            conexion = new Conexion();
        }

        return conn;

    }
}
