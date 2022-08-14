package Conexion;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Producto {

    private String id;
    private String codigoArticulo;
    private int precioArticulo;
    private String nomArticulo;
    private String descripcionArticulo;
    private int Cantidad;

    public void pedir_datos() {

        try {

            this.id = JOptionPane.showInputDialog(null, "Digite el id del producto: ");
            this.codigoArticulo = JOptionPane.showInputDialog(null, "Digite el codigo del articulo: ");
            this.precioArticulo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del articulo: "));
            this.nomArticulo = JOptionPane.showInputDialog(null, "Digite el nombre del articulo: ");
            this.descripcionArticulo = JOptionPane.showInputDialog(null, "Digite la descripcion del articulo: ");
            this.Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad del producto: "));

        } catch (Exception ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void pedir_datos_actualizar() {

        try {

            this.id = JOptionPane.showInputDialog(null, "Digite el id del producto: ");
            this.codigoArticulo = JOptionPane.showInputDialog(null, "Digite el codigo del articulo: ");
            this.precioArticulo = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el precio del articulo: "));
            this.nomArticulo = JOptionPane.showInputDialog(null, "Digite el nombre del articulo: ");
            this.descripcionArticulo = JOptionPane.showInputDialog(null, "Digite la descripcion del articulo: ");
            this.Cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite la cantidad del producto: "));

        } catch (Exception ex) {
            Logger.getLogger(Producto.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Producto(String id, String codigoArticulo, int precioArticulo, String nomArticulo, String descripcionArticulo, int Cantidad) {
        this.id = id;
        this.codigoArticulo = codigoArticulo;
        this.precioArticulo = precioArticulo;
        this.nomArticulo = nomArticulo;
        this.descripcionArticulo = descripcionArticulo;
        this.Cantidad = Cantidad;
    }

    public Producto() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCodigoArticulo() {
        return codigoArticulo;
    }

    public void setCodigoArticulo(String codigoArticulo) {
        this.codigoArticulo = codigoArticulo;
    }

    public int getPrecioArticulo() {
        return precioArticulo;
    }

    public void setPrecioArticulo(int precioArticulo) {
        this.precioArticulo = precioArticulo;
    }

    public String getNomArticulo() {
        return nomArticulo;
    }

    public void setNomArticulo(String nomArticulo) {
        this.nomArticulo = nomArticulo;
    }

    public String getDescripcionArticulo() {
        return descripcionArticulo;
    }

    public void setDescripcionArticulo(String descripcionArticulo) {
        this.descripcionArticulo = descripcionArticulo;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

}
