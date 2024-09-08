/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package vista;

import javax.swing.DefaultComboBoxModel;
import modelo.Cliente;
import modelo.Conexion;


/**
 *
 * @author emanu
 */
public class frm_inicio extends javax.swing.JFrame {
    Cliente cliente;
    
    
    
    /**
     * Creates new form frm_inicio
     */
    public frm_inicio() {
        initComponents();
        cliente = new Cliente();
        this.tbl_clientes.setModel(cliente.leer());
        cb_puestos.setModel(cliente.id());
    }
    
    
    public void selec_datos(){
    int fila = tbl_clientes.getSelectedRow();
    lbl_id.setText(tbl_clientes.getValueAt(fila, 0).toString());
    txt_nit.setText(tbl_clientes.getValueAt(fila, 1).toString());
    txt_nombre.setText(tbl_clientes.getValueAt(fila, 2).toString());
    txt_apellido.setText(tbl_clientes.getValueAt(fila, 3).toString());
    txt_direccion.setText(tbl_clientes.getValueAt(fila, 4).toString());
    txt_telefono.setText(tbl_clientes.getValueAt(fila, 5).toString());
    txt_fn.setText(tbl_clientes.getValueAt(fila, 6).toString());
    cb_puestos.setSelectedItem(tbl_clientes.getValueAt(fila, 7).toString());
    }
    public void limpiar_datos(){
    
    lbl_id.setText("");
    txt_nit.setText("");
    txt_nombre.setText("");
    txt_apellido.setText("");
    txt_direccion.setText("");
    txt_telefono.setText("");
    txt_fn.setText("");
    cb_puestos.setSelectedItem("0) Elija Puesto");
   }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tab_principal = new javax.swing.JTabbedPane();
        panel_clientes = new javax.swing.JPanel();
        lbl_nit = new javax.swing.JLabel();
        txt_nit = new javax.swing.JTextField();
        lbl_nombres = new javax.swing.JLabel();
        txt_nombre = new javax.swing.JTextField();
        txt_apellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        txt_direccion = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        lbl_telefono = new javax.swing.JLabel();
        lbl_fn = new javax.swing.JLabel();
        txt_fn = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        jspanel_tabla = new javax.swing.JScrollPane();
        tbl_clientes = new javax.swing.JTable();
        lbl_mensaje_general = new javax.swing.JLabel();
        lbl_etiquetaid = new javax.swing.JLabel();
        lbl_id = new javax.swing.JLabel();
        btn_actualizar = new javax.swing.JButton();
        btn_borrar = new javax.swing.JButton();
        cb_puestos = new javax.swing.JComboBox<>();
        panel_empleados = new javax.swing.JPanel();
        lbl_mensaje_general2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_nit.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nit.setText("Nit");

        txt_nit.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lbl_nombres.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_nombres.setText("Nombre");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Apellido");

        lbl_direccion.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_direccion.setText("Direccion");

        lbl_telefono.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_telefono.setText("Telefono");

        lbl_fn.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_fn.setText("Fecha Nacimiento");

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });

        jspanel_tabla.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tbl_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tbl_clientes.setGridColor(new java.awt.Color(51, 0, 51));
        tbl_clientes.setShowGrid(true);
        tbl_clientes.setSurrendersFocusOnKeystroke(true);
        tbl_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_clientesMouseClicked(evt);
            }
        });
        tbl_clientes.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tbl_clientesKeyReleased(evt);
            }
        });
        jspanel_tabla.setViewportView(tbl_clientes);

        lbl_mensaje_general.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_mensaje_general.setText("Formulario Clientes");

        lbl_etiquetaid.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lbl_etiquetaid.setText("Id");

        lbl_id.setText("0");

        btn_actualizar.setText("Actualizar");
        btn_actualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_actualizarActionPerformed(evt);
            }
        });

        btn_borrar.setText("Borrar");
        btn_borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_borrarActionPerformed(evt);
            }
        });

        cb_puestos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cb_puestos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cb_puestosMouseClicked(evt);
            }
        });
        cb_puestos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cb_puestosActionPerformed(evt);
            }
        });
        cb_puestos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                cb_puestosKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout panel_clientesLayout = new javax.swing.GroupLayout(panel_clientes);
        panel_clientes.setLayout(panel_clientesLayout);
        panel_clientesLayout.setHorizontalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jspanel_tabla))
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_etiquetaid, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(lbl_mensaje_general))
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_fn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cb_puestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_guardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_actualizar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_borrar))
                            .addGroup(panel_clientesLayout.createSequentialGroup()
                                .addComponent(lbl_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(panel_clientesLayout.createSequentialGroup()
                                    .addComponent(lbl_nombres, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(txt_nombre))
                                .addGroup(panel_clientesLayout.createSequentialGroup()
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_apellido))
                                .addGroup(panel_clientesLayout.createSequentialGroup()
                                    .addComponent(lbl_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 293, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panel_clientesLayout.setVerticalGroup(
            panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_clientesLayout.createSequentialGroup()
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_clientesLayout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(lbl_mensaje_general)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_clientesLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbl_etiquetaid)
                            .addComponent(lbl_id))
                        .addGap(9, 9, 9)))
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nit)
                    .addComponent(txt_nit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_nombres)
                    .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_direccion)
                    .addComponent(txt_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_telefono)
                    .addComponent(txt_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_clientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_fn)
                    .addComponent(txt_fn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_guardar)
                    .addComponent(btn_actualizar)
                    .addComponent(btn_borrar)
                    .addComponent(cb_puestos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jspanel_tabla, javax.swing.GroupLayout.DEFAULT_SIZE, 289, Short.MAX_VALUE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        tab_principal.addTab("Clientes", panel_clientes);

        lbl_mensaje_general2.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        lbl_mensaje_general2.setText("Formulario Empleados");

        javax.swing.GroupLayout panel_empleadosLayout = new javax.swing.GroupLayout(panel_empleados);
        panel_empleados.setLayout(panel_empleadosLayout);
        panel_empleadosLayout.setHorizontalGroup(
            panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_empleadosLayout.createSequentialGroup()
                .addContainerGap(253, Short.MAX_VALUE)
                .addComponent(lbl_mensaje_general2, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(148, 148, 148))
        );
        panel_empleadosLayout.setVerticalGroup(
            panel_empleadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_empleadosLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(lbl_mensaje_general2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(594, Short.MAX_VALUE))
        );

        tab_principal.addTab("Empleados", panel_empleados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tab_principal)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tab_principal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        // TODO add your handling code here:.
        String id_puesto= cb_puestos.getSelectedItem().toString();
            int posc=id_puesto.indexOf(')');
           
        cliente = new Cliente(txt_nit.getText(),0,Integer.parseInt(id_puesto.substring(0, posc)),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_fn.getText());
        cliente.crear();
        tbl_clientes.setModel(cliente.leer());
        limpiar_datos();
        
        this.txt_nit.setText("");
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_fn.setText("");
        
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void select_datos() {
    int fila = tbl_clientes.getSelectedRow();
        lbl_id.setText(tbl_clientes.getValueAt(fila, 0).toString());
        txt_nit.setText(tbl_clientes.getValueAt(fila, 1).toString());
        txt_nombre.setText(tbl_clientes.getValueAt(fila, 2).toString());
        txt_apellido.setText(tbl_clientes.getValueAt(fila, 3).toString());
        txt_telefono.setText(tbl_clientes.getValueAt(fila, 4).toString());
        txt_fn.setText(tbl_clientes.getValueAt(fila, 5).toString());
        txt_direccion.setText(tbl_clientes.getValueAt(fila, 6).toString());

    
    }
    private void tbl_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_clientesMouseClicked
        // TODO add your handling code here:
        select_datos();      
    }//GEN-LAST:event_tbl_clientesMouseClicked

    private void tbl_clientesKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tbl_clientesKeyReleased
        // TODO add your handling code here:
       select_datos();
    }//GEN-LAST:event_tbl_clientesKeyReleased

    private void btn_actualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_actualizarActionPerformed
        // TODO add your handling code here:
        String id_puesto= cb_puestos.getSelectedItem().toString();
            int posc=id_puesto.indexOf(')');
           
        cliente = new Cliente(txt_nit.getText(),Integer.parseInt(lbl_id.getText()),Integer.parseInt(id_puesto.substring(0, posc)),txt_nombre.getText(),txt_apellido.getText(),txt_direccion.getText(),txt_telefono.getText(),txt_fn.getText());
        cliente.actualizar();
        this.tbl_clientes.setModel(cliente.leer());
        limpiar_datos();
        
        this.txt_nit.setText("");
        this.txt_nombre.setText("");
        this.txt_apellido.setText("");
        this.txt_direccion.setText("");
        this.txt_telefono.setText("");
        this.txt_fn.setText("");
    }//GEN-LAST:event_btn_actualizarActionPerformed

    private void btn_borrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_borrarActionPerformed
        // TODO add your handling code here:
        cliente = new Cliente();
        cliente.setId(Integer.valueOf(this.lbl_id.getText()));
        cliente.eliminar();
        tbl_clientes.setModel(cliente.leer());
       
    }//GEN-LAST:event_btn_borrarActionPerformed

    private void cb_puestosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cb_puestosActionPerformed

    }//GEN-LAST:event_cb_puestosActionPerformed

    private void cb_puestosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_puestosMouseClicked
    selec_datos();        // TODO add your handling code here:
    }//GEN-LAST:event_cb_puestosMouseClicked

    private void cb_puestosKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cb_puestosKeyReleased
    selec_datos();        // TODO add your handling code here:
    }//GEN-LAST:event_cb_puestosKeyReleased

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
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frm_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frm_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_actualizar;
    private javax.swing.JButton btn_borrar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JComboBox<String> cb_puestos;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jspanel_tabla;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_etiquetaid;
    private javax.swing.JLabel lbl_fn;
    private javax.swing.JLabel lbl_id;
    private javax.swing.JLabel lbl_mensaje_general;
    private javax.swing.JLabel lbl_mensaje_general2;
    private javax.swing.JLabel lbl_nit;
    private javax.swing.JLabel lbl_nombres;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JPanel panel_clientes;
    private javax.swing.JPanel panel_empleados;
    private javax.swing.JTabbedPane tab_principal;
    private javax.swing.JTable tbl_clientes;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_fn;
    private javax.swing.JTextField txt_nit;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables

    private void txt_apellidosetText(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void txt_fn(String toString) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
