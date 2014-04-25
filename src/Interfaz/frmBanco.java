/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

/**
 *
 * @author admin
 */
import javax.swing.JOptionPane;
import Clases.Banco;
import Clases.Cliente;
import Conexion.Conexion;
public class frmBanco extends javax.swing.JFrame {

    /**
     * Creates new form frmBanco
     */
    public frmBanco() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigo1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre1 = new javax.swing.JTextField();
        txtSucursal1 = new javax.swing.JTextField();
        txtComuna1 = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnLimpiar1 = new javax.swing.JButton();
        btnVolver1 = new javax.swing.JButton();
        txtDireccion1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        txtCodigo2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtNombre2 = new javax.swing.JTextField();
        txtSucursal2 = new javax.swing.JTextField();
        txtComuna2 = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        btnLimpiar2 = new javax.swing.JButton();
        btnVolver2 = new javax.swing.JButton();
        btnBuscar2 = new javax.swing.JButton();
        txtDireccion2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        txtCodigo3 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtNombre3 = new javax.swing.JTextField();
        txtSucursal3 = new javax.swing.JTextField();
        txtComuna3 = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        btnVolver3 = new javax.swing.JButton();
        btnBuscar3 = new javax.swing.JButton();
        txtDireccion3 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Codigo:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Sucursal:");

        jLabel5.setText("Dirección:");

        jLabel6.setText("Comuna:");

        txtComuna1.setText(" ");

        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });

        btnLimpiar1.setText("Limpiar");
        btnLimpiar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar1ActionPerformed(evt);
            }
        });

        btnVolver1.setText("Volver");
        btnVolver1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnIngresar)
                        .addGap(48, 48, 48)
                        .addComponent(btnLimpiar1)
                        .addGap(45, 45, 45)
                        .addComponent(btnVolver1)
                        .addGap(0, 60, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3)
                            .addComponent(jLabel6)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtComuna1)
                                    .addComponent(txtSucursal1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre1, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCodigo1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtSucursal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDireccion1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtComuna1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresar)
                    .addComponent(btnLimpiar1)
                    .addComponent(btnVolver1))
                .addContainerGap())
        );

        jTabbedPane1.addTab("Ingresar Banco", jPanel1);

        jLabel7.setText("Codigo:");

        jLabel8.setText("Nombre:");

        jLabel9.setText("Sucursal:");

        jLabel10.setText("Dirección:");

        jLabel11.setText("Comuna:");

        txtNombre2.setEnabled(false);

        txtSucursal2.setEnabled(false);

        txtComuna2.setText(" ");
        txtComuna2.setEnabled(false);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnLimpiar2.setText("Limpiar");
        btnLimpiar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiar2ActionPerformed(evt);
            }
        });

        btnVolver2.setText("Volver");
        btnVolver2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver2ActionPerformed(evt);
            }
        });

        btnBuscar2.setText("Buscar");
        btnBuscar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar2ActionPerformed(evt);
            }
        });

        txtDireccion2.setEnabled(false);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(btnModificar)
                        .addGap(48, 48, 48)
                        .addComponent(btnLimpiar2)
                        .addGap(45, 45, 45)
                        .addComponent(btnVolver2)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jLabel11)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtComuna2)
                                    .addComponent(txtSucursal2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar2)
                                .addGap(58, 58, 58))))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtCodigo2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar2))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtNombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtSucursal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(txtDireccion2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(txtComuna2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnModificar)
                    .addComponent(btnLimpiar2)
                    .addComponent(btnVolver2))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Modificar Banco", jPanel2);

        jLabel12.setText("Codigo:");

        jLabel13.setText("Nombre:");

        jLabel14.setText("Sucursal:");

        jLabel15.setText("Dirección:");

        jLabel16.setText("Comuna:");

        txtNombre3.setEnabled(false);

        txtSucursal3.setEnabled(false);

        txtComuna3.setText(" ");
        txtComuna3.setEnabled(false);

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnVolver3.setText("Volver");
        btnVolver3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolver3ActionPerformed(evt);
            }
        });

        btnBuscar3.setText("Buscar");
        btnBuscar3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscar3ActionPerformed(evt);
            }
        });

        txtDireccion3.setEnabled(false);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(158, 158, 158)
                        .addComponent(btnVolver3)
                        .addGap(0, 58, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15))
                        .addGap(22, 22, 22)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtComuna3)
                                    .addComponent(txtSucursal3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNombre3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDireccion3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBuscar3)
                                .addGap(58, 58, 58))))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCodigo3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar3))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(txtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(txtSucursal3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDireccion3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(txtComuna3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnVolver3))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 364, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 3, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 3, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 258, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Eliminar Banco", jPanel3);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel2.setText("Administrar Bancos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(105, 105, 105))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTabbedPane1)
                .addGap(7, 7, 7))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        Banco ban = new Banco();
        ban.agregarBanco(Integer.parseInt(txtCodigo1.getText()),
            txtNombre1.getText(),
            txtSucursal1.getText(),
            txtDireccion1.getText(),
            txtComuna1.getText());     
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void btnBuscar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar2ActionPerformed
    try{
            Banco objBan = new Banco(Integer.parseInt(txtCodigo2.getText()),"Nombre","Sucursal","Direccion","Comuna");
            objBan.buscarBanco();
            if(Conexion.buscarBanco){
                txtNombre2.setText(objBan.Nombre);
                txtSucursal2.setText(objBan.Sucursal);
                txtDireccion2.setText(objBan.Direccion);
                txtComuna2.setText(objBan.Comuna);
                habilitarCampos();
                
            }else{
                JOptionPane.showMessageDialog(this,"No existe", "BUSCAR",2);
            }
            objBan=null;
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnBuscar2ActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
     try{
            Banco objBan = new Banco(Integer.parseInt(txtCodigo2.getText()),"Nombre","Sucursal","Direccion","Comuna");
            objBan.buscarBanco();
            if(Conexion.buscarBanco){
                objBan.Codigo = Integer.parseInt(txtCodigo2.getText());
                objBan.Nombre = txtNombre2.getText();
                objBan.Sucursal = txtNombre2.getText();
                objBan.Direccion = txtDireccion2.getText();
                objBan.Comuna = txtComuna2.getText();
                objBan.modificarBanco();
                JOptionPane.showMessageDialog(this,"Banco Actualizado","Actualizar",2);
            }else{
                JOptionPane.showMessageDialog(this,"Banco no existe","Actualizar",2);
            }
            objBan=null;
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
     try{
            Banco objBan = new Banco(Integer.parseInt(txtCodigo3.getText()),"Nombre","Sucursal","Direccion","Comuna");
            objBan.buscarBanco();
            if (Conexion.buscarBanco){
                objBan.borrarBanco();
                JOptionPane.showMessageDialog(this,"Banco eliminado","Borrar",2);
            }
            objBan=null;
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscar3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscar3ActionPerformed
     try{
            Banco objBan = new Banco(Integer.parseInt(txtCodigo3.getText()),"Nombre","Sucursal","Direccion","Comuna");
            objBan.buscarBanco();
            if(Conexion.buscarBanco){
                txtNombre3.setText(objBan.Nombre);
                txtSucursal3.setText(objBan.Sucursal);
                txtDireccion3.setText(objBan.Direccion);
                txtComuna3.setText(objBan.Comuna);
                
            }else{
                JOptionPane.showMessageDialog(this,"No existe", "BUSCAR",2);
            }
            objBan=null;
        }catch(Exception e){
        }
    }//GEN-LAST:event_btnBuscar3ActionPerformed

    private void btnVolver1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver1ActionPerformed
    frmRedBanc RedBanc = new frmRedBanc();
         RedBanc.RedBanc();
         this.setVisible(false);
    }//GEN-LAST:event_btnVolver1ActionPerformed

    private void btnVolver2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver2ActionPerformed
        frmRedBanc RedBanc = new frmRedBanc();
         RedBanc.RedBanc();
         this.setVisible(false);
    }//GEN-LAST:event_btnVolver2ActionPerformed

    private void btnVolver3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolver3ActionPerformed
     frmRedBanc RedBanc = new frmRedBanc();
         RedBanc.RedBanc();
         this.setVisible(false);
    }//GEN-LAST:event_btnVolver3ActionPerformed

    private void btnLimpiar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar1ActionPerformed
      limpiarCampos();
    }//GEN-LAST:event_btnLimpiar1ActionPerformed

    private void btnLimpiar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiar2ActionPerformed
     limpiarCampos();
    }//GEN-LAST:event_btnLimpiar2ActionPerformed
public void habilitarCampos(){
    txtNombre2.setEnabled(true);
    txtSucursal2.setEnabled(true);
    txtDireccion2.setEnabled(true);
    txtComuna2.setEnabled(true);
    btnModificar.setEnabled(true);
    btnLimpiar2.setEnabled(true);
}

public void limpiarCampos(){
    txtCodigo1.setText(null);
    txtNombre1.setText(null);
    txtSucursal1.setText(null);
    txtDireccion1.setText(null);
    txtComuna1.setText(null);
    txtNombre2.setText(null);
    txtSucursal2.setText(null);
    txtDireccion2.setText(null);
    txtComuna2.setText(null);
}
    public void gestionBanco() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBanco().setVisible(true);
            }
        });
    }
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
            java.util.logging.Logger.getLogger(frmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmBanco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmBanco().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar2;
    private javax.swing.JButton btnBuscar3;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnLimpiar1;
    private javax.swing.JButton btnLimpiar2;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnVolver1;
    private javax.swing.JButton btnVolver2;
    private javax.swing.JButton btnVolver3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtCodigo1;
    private javax.swing.JTextField txtCodigo2;
    private javax.swing.JTextField txtCodigo3;
    private javax.swing.JTextField txtComuna1;
    private javax.swing.JTextField txtComuna2;
    private javax.swing.JTextField txtComuna3;
    private javax.swing.JTextField txtDireccion1;
    private javax.swing.JTextField txtDireccion2;
    private javax.swing.JTextField txtDireccion3;
    private javax.swing.JTextField txtNombre1;
    private javax.swing.JTextField txtNombre2;
    private javax.swing.JTextField txtNombre3;
    private javax.swing.JTextField txtSucursal1;
    private javax.swing.JTextField txtSucursal2;
    private javax.swing.JTextField txtSucursal3;
    // End of variables declaration//GEN-END:variables
}
