package Gestion;

import Conexion.Producto;
import Conexion.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ProductoGestion {

    private static final String SQL_DELETE_ARTICULOS = "delete from articulos where codigoArticulo=?";

    public void eliminar(String id) {

        try {
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_DELETE_ARTICULOS);
            consulta.setString(1, id);

            if (consulta.executeUpdate() > 0) {
                System.out.println("Producto eliminado correctamente de la base de datos");
            } else {
                System.out.println("No fue encontrada el id del producto en la base de datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static final String SQL_UPDATE_ARTICULOS= "update articulos set id=?,codigoArticulo=?,"
            + "precioArticulo=?,nombreArticulo=?,descripcionArticulo=?,Cantidad=? where codigoArticulo=?";

    public void actualiza(Producto producto) {

        try {

            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_UPDATE_ARTICULOS);
            sentencia.setString(1, producto.getCodigoArticulo());
            sentencia.setInt(2, producto.getPrecioArticulo());
            sentencia.setString(3, producto.getNomArticulo());
            sentencia.setString(4, producto.getDescripcionArticulo());
            sentencia.setString(5, "" + producto.getCantidad());
            if (sentencia.executeUpdate() > 0) {
                System.out.println("Producto Modificado Correctamente en la Base de Datos");
            } else {
                System.out.println("No fue encontrada el id del producto en la base de datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static final String SQL_SELECT_ARTICULOS = "select * from articulos where codigoArticulo=?";

    public void buscaProductos(String id) {

        try {

            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_ARTICULOS);
            consulta.setString(1, id);

            ResultSet rs = consulta.executeQuery();

            if (rs.next()) {
                System.out.println("A continuación se muestran los datos de los productos:\n");
                System.out.println("Codigo del producto: " + rs.getString(1));
                System.out.println("Precio del producto: " + rs.getInt(2));
                System.out.println("Nombre del producto: " + rs.getString(3));
                System.out.println("Descripcion del producto: " + rs.getString(4));
                System.out.println("Cantidad del producto: " + rs.getInt(5));
                
            } else {
                System.out.println("No fue encontrado el product dentro de la base de datos");
            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static final String SQL_INSERT_ARTICULOS= "insert into articulos (codigoArticulo,precioArticulo,"
            + "nombreArticulo,descripcionArticulo,Cantidad,) values (?,?,?,?,?)";

    public void insertar(Producto producto) {

        try {

            PreparedStatement sentencia = Conexion.getConexion().prepareCall(SQL_INSERT_ARTICULOS);
            //Va a sustituir los signos de pregunta en el query por un valor
            sentencia.setString(1, producto.getCodigoArticulo());
            sentencia.setInt(2, producto.getPrecioArticulo());
            sentencia.setString(3, producto.getNomArticulo());
            sentencia.setString(4, producto.getDescripcionArticulo());
            sentencia.setInt(5, producto.getCantidad());

            if (sentencia.executeUpdate() > 0) { // Retorna más de 0 si pudo ingresar el registro en la base de datos
                System.out.println("Producto ingresado correctamente en la base de datos");
            } else {
                System.out.println("No se pudo ingresar el producto en la base de datos, vuelva a intentarlo");

            }

        } catch (SQLException ex) {
            Logger.getLogger(ProductoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    //Atributo definido para la consulta del listado de estudiantes en base de datos 
    private static final String SQL_SELECT_ARTICULOSS = "Select * from articulos";

    //Método para la consulta de los estudiantes en la base de datos 
    public void mostrar_reporte_de_productos() {

        try {
            //Crea un objeto para indicar cual consulta SQL se va a ejecutar y en cual base de datos
            PreparedStatement consulta = Conexion.getConexion().prepareStatement(SQL_SELECT_ARTICULOSS);

            //Set de resultados con la información traída desde la base de datos
            ResultSet rs = consulta.executeQuery();

            System.out.println("A continuación se muestra el listado de productos de la base de datos: \n");

            while (rs != null && rs.next()) {

                System.out.print("Codigo del Articulo: " + rs.getString(2) + ", ");
                System.out.print("Precio del Articulo: " + rs.getInt(3) + ", ");
                System.out.print("Nombre del Articulo: " + rs.getString(4) + ", ");
                System.out.print("Descripcion del Articulo: " + rs.getString(5) + ", ");
                System.out.print("Cantidad de Articulos: " + rs.getInt(6) + ", ");
                System.out.println("");
            }

            System.out.println("\n*************Fin del Reporte de Productos*************");

        } catch (SQLException ex) {
            Logger.getLogger(ProductoGestion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
