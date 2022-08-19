/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package JavaSwing;

import Conexion.Producto;
import Gestion.ProductoGestion;
import javax.swing.JOptionPane;

/**
 *
 * @author jchav
 */
public class PrincipalMenu extends javax.swing.JFrame {

    //Creamos un objeto de la clase POJO 
    Producto obj_Producto = new Producto();
    ProductoGestion obj_gestion = new ProductoGestion();
    String codigo;

    public PrincipalMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btn_agregarProducto = new javax.swing.JButton();
        btn_verReporte = new javax.swing.JButton();
        btn_borrarRegistro = new javax.swing.JButton();
        btn_buscarProducto = new javax.swing.JButton();
        btn_actualizarProducto = new javax.swing.JButton();
        btn_salir = new javax.swing.JButton();
        btn_chat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("OCR A Extended", 1, 24)); // NOI18N
        jLabel1.setText("Sistema de información de Productos");

        btn_agregarProducto.setBackground(new java.awt.Color(153, 153, 255));
        btn_agregarProducto.setText("Agregar nuevo producto");
        btn_agregarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarProductoActionPerformed(evt);
            }
        });

        btn_verReporte.setBackground(new java.awt.Color(153, 153, 255));
        btn_verReporte.setText("Ver reporte completo de productos");
        btn_verReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_verReporteActionPerformed(evt);
            }
        });

        btn_borrarRegistro.setBackground(new java.awt.Color(153, 153, 255));
        btn_borrarRegistro.setText("Borrar un registro de productos");
        btn_borrarRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarRegistroActionPerformed(evt);
            }
        });

        btn_buscarProducto.setBackground(new java.awt.Color(153, 153, 255));
        btn_buscarProducto.setText("Buscar un producto en específico");
        btn_buscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_buscarProductoActionPerformed(evt);
            }
        });

        btn_actualizarProducto.setBackground(new java.awt.Color(153, 153, 255));
        btn_actualizarProducto.setText("Actualizar un registro de producto");
        btn_actualizarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarProductoActionPerformed(evt);
            }
        });

        btn_salir.setBackground(new java.awt.Color(255, 51, 51));
        btn_salir.setText("Cerrar sesión");
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });

        btn_chat.setBackground(new java.awt.Color(102, 255, 102));
        btn_chat.setText("Chat");
        btn_chat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_chatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btn_agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btn_borrarRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(btn_verReporte, javax.swing.GroupLayout.DEFAULT_SIZE, 230, Short.MAX_VALUE)
                                    .addComponent(btn_buscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(323, 323, 323)
                        .addComponent(btn_actualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(43, 43, 43)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_verReporte, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_agregarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn_borrarRegistro, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
                            .addComponent(btn_buscarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(59, 59, 59)
                        .addComponent(btn_actualizarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(468, 508, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_chat, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_agregarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarProductoActionPerformed
        //Pedimos los datos del estudiante
        obj_Producto.pedir_datos();
        //Mandamos a insertar los datos del nuevo estudiante
        obj_gestion.insertar(obj_Producto);
    }//GEN-LAST:event_btn_agregarProductoActionPerformed

    private void btn_verReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_verReporteActionPerformed
        //Mostramos la información completa desde la base de datos
        obj_gestion.mostrar_reporte_de_productos();
    }//GEN-LAST:event_btn_verReporteActionPerformed

    private void btn_borrarRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarRegistroActionPerformed
        codigo = JOptionPane.showInputDialog(null, "Digite el codigo del producto a eliminar:");
        obj_gestion.eliminar(codigo);
    }//GEN-LAST:event_btn_borrarRegistroActionPerformed

    private void btn_buscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_buscarProductoActionPerformed
        codigo = JOptionPane.showInputDialog(null, "Digite el codigo del producto a consultar:");
        obj_gestion.buscaProductos(codigo);
    }//GEN-LAST:event_btn_buscarProductoActionPerformed

    private void btn_actualizarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarProductoActionPerformed
        codigo = JOptionPane.showInputDialog(null, "Digite el codigo del producto a modificar");
        obj_Producto.setId(codigo);
        obj_Producto.pedir_datos_actualizar();
        obj_gestion.actualiza(obj_Producto);
    }//GEN-LAST:event_btn_actualizarProductoActionPerformed

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
        this.setVisible(false);
        Login l = new Login();
        l.setVisible(true);
    }//GEN-LAST:event_btn_salirActionPerformed

    private void btn_chatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_chatActionPerformed
        this.setVisible(false);
        this.dispose();
        //Chat del cliente
        ClienteChat cc = new ClienteChat();
        cc.setVisible(true);
        
    }//GEN-LAST:event_btn_chatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrincipalMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrincipalMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizarProducto;
    private javax.swing.JButton btn_agregarProducto;
    private javax.swing.JButton btn_borrarRegistro;
    private javax.swing.JButton btn_buscarProducto;
    private javax.swing.JButton btn_chat;
    private javax.swing.JButton btn_salir;
    private javax.swing.JButton btn_verReporte;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
