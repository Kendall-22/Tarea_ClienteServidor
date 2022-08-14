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
    private static final String DBURL = "jdbc:mysql://localhost:3306/ugeneral?serverTimezone=UTC";

    private static Connection conn = null;

    //Constructor
    private Conexion() {

        try {
            //Importamos el uso del conector para MYSQL
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            //Definiendo los parámetros de la conexión a la base de datos, con usuario, contraseña y la URL del servidor MYSQL
            conn = DriverManager.getConnection(DBURL, "ugeneral_user", "Prueba123_");

        } catch (ClassNotFoundException | SQLException | NoSuchMethodException | SecurityException
                | InstantiationException | IllegalAccessException | IllegalArgumentException
                | InvocationTargetException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    // Pendiente crear el método sincronizado.
}
