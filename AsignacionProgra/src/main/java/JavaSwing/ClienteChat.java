
package JavaSwing;

import static JavaSwing.ProveedorChat.dataInput;
import static JavaSwing.ProveedorChat.dataOutput;
import static JavaSwing.ProveedorChat.serverSocket;
import static JavaSwing.ProveedorChat.socket;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author jchav
 */
public class ClienteChat extends javax.swing.JFrame implements Runnable {

    //Declaración de las variables para hacer la conexión y envío de data
    static Socket socket;
    static DataInputStream dataInput;
    static DataOutputStream dataOutput;
    
    private String hora;
    private String minutos;
    private String segundos;
    private String ampm;
    Calendar calendario;
    Thread h1;
    
    public ClienteChat() {
        initComponents();
        h1 = new Thread(this);
        h1.start();
        setLocationRelativeTo(null);
        setTitle("Reloj");
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        txta_mensajes = new javax.swing.JTextArea();
        lbl_cliente = new javax.swing.JLabel();
        txt_textoAEnviar = new javax.swing.JTextField();
        btn_enviar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txta_mensajes.setColumns(20);
        txta_mensajes.setRows(5);
        jScrollPane1.setViewportView(txta_mensajes);

        lbl_cliente.setFont(new java.awt.Font("Perpetua", 1, 18)); // NOI18N
        lbl_cliente.setText("Chat con el Proveedor");

        btn_enviar.setText("Enviar");
        btn_enviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_enviarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txt_textoAEnviar)
                        .addGap(18, 18, 18)
                        .addComponent(btn_enviar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(232, Short.MAX_VALUE)
                .addComponent(lbl_cliente)
                .addGap(231, 231, 231))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_cliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 305, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_textoAEnviar)
                    .addComponent(btn_enviar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    //Método del botón
    private void btn_enviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_enviarActionPerformed
        try {
            String mensaje = "";
            mensaje = txt_textoAEnviar.getText();
            dataOutput.writeUTF(mensaje);
            txt_textoAEnviar.setText("");
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btn_enviarActionPerformed

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
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClienteChat.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ClienteChat frmPrincipal = new ClienteChat();
                frmPrincipal.setTitle("Bienvenido");
                frmPrincipal.setLocationRelativeTo(null);
                frmPrincipal.setVisible(true);
            }
        });
        
        try {
            String mensajeEntrante = "";
            
            socket = new Socket("127.0.0.1",1201); // 
            dataInput = new DataInputStream(socket.getInputStream());
            dataOutput = new DataOutputStream(socket.getOutputStream());

            while (!mensajeEntrante.equals("exit")) {
                mensajeEntrante = dataInput.readUTF();
                //En vez de cliente definido, lo podemos cambiar por el nombre del usuario logueado
                txta_mensajes.setText(txta_mensajes.getText() + "\n Proveedor : " + mensajeEntrante);
            }

        } catch (Exception e) {

        }
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_enviar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_cliente;
    private javax.swing.JTextField txt_textoAEnviar;
    private static javax.swing.JTextArea txta_mensajes;
    // End of variables declaration//GEN-END:variables
 @Override
    public void run() {
        Thread ct = Thread.currentThread();

        while (ct == h1) {
            calcula();
            Lbl_Reloj.setText(hora + ":" + minutos + ":" + segundos + ":" + ampm);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }

        }
    }

    private void calcula() {
        Calendar calendario = new GregorianCalendar();
        Date fechaHoraActual = new Date();
        calendario.setTime(fechaHoraActual);
        ampm = calendario.get(Calendar.AM_PM) == Calendar.AM ? "AM" : "PM";
        if (ampm.equals("PM")) {
            int h = calendario.get(Calendar.HOUR_OF_DAY) - 12;
            hora = h > 9 ? "" + h : "0" + h;
        } else {
            hora = calendario.get(Calendar.HOUR_OF_DAY) > 9 ? "" + calendario.get(Calendar.HOUR_OF_DAY) : "0" + calendario.get(Calendar.HOUR_OF_DAY);
        }
        minutos = calendario.get(Calendar.MINUTE) > 9 ? "" + calendario.get(Calendar.MINUTE) : "0" + calendario.get(Calendar.MINUTE);
        segundos = calendario.get(Calendar.SECOND) > 9 ? "" + calendario.get(Calendar.SECOND) : "0" + calendario.get(Calendar.SECOND);
    }


}
