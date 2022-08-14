package com.sc403.asignacionprogra.newpackage;
import Conexion.Producto;
import Conexion.Conexion;
import Gestion.ProductoGestion;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Inicio {

    public static void main(String[] args) {
        //Creamos un objeto de la clase POJO 
        Producto obj_Producto = new Producto();
        ProductoGestion obj_gestion = new ProductoGestion();
        String cedula; 
        
        String opcion, cont="s";
        
        while (cont.equalsIgnoreCase("s")){
            opcion = JOptionPane.showInputDialog(null,"Sistema de información de Productos:\n\n"+
                    "1 ====> Agregar un nuevo registro de un producto en la base de datos:\n"
                    + "2 ====> Ver reporte completo de productos:\n"
                    + "3 ====> Borrar un registro de productos:\n"
                    + "4 ====> Buscar un producto en específico:\n"
                    + "5 ====> Actualizar un registro de un producto:\n"
                    + "Ingrese la opción que desea: ");
            
            if (opcion.equals("1")){
                //Pedimos los datos del estudiante
                obj_Producto.pedir_datos();
                //Mandamos a insertar los datos del nuevo estudiante
                obj_gestion.insertar(obj_Producto);
            }else if (opcion.equals("2")){
                //Mostramos la información completa desde la base de datos
                obj_gestion.mostrar_reporte_de_productos();
            }else if (opcion.equals("3")){
                cedula=JOptionPane.showInputDialog(null, "Digite el codigo del producto a eliminar:");
                obj_gestion.eliminar(cedula);
            }else if (opcion.equals("4")){
                cedula=JOptionPane.showInputDialog(null, "Digite el codigo del producto a consultar:");
                obj_gestion.buscaProductos(cedula);
            }else if (opcion.equals("5")){
                cedula=JOptionPane.showInputDialog(null, "Digite el codigo del producto a modificar");
                obj_Producto.setId(cedula);
                obj_Producto.pedir_datos_actualizar();
                obj_gestion.actualiza(obj_Producto);
            }
            cont = JOptionPane.showInputDialog(null,"¿Desea continuar utilizando el sistema? s/n");
        }
        
    }
    
}
