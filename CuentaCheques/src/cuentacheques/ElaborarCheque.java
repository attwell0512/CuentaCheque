/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacheques;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.print.PageFormat;
import java.awt.print.Printable;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author axel
 */
public class ElaborarCheque extends javax.swing.JFrame{
    private Connection conn = null;
    PreparedStatement ps;
    ResultSet rs;    
    
    public Connection conexion(){
     try{
         Class.forName("com.mysql.jdbc.Driver");
         conn =(Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/Abuelita","root","Rossitta"); 
         //System.out.print("Conexion establecida...");
     }catch(ClassNotFoundException |SQLException e){
         System.out.print("no se puedo establecer conexion..");
     }
     return conn;     
    }
    
    public ElaborarCheque() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JpaCheques = new javax.swing.JPanel();
        Lblfolio = new javax.swing.JLabel();
        TxtFolio = new javax.swing.JTextField();
        BtnConsulC = new javax.swing.JButton();
        LblNombrec = new javax.swing.JLabel();
        TxtNombreC = new javax.swing.JTextField();
        lblCodCliente = new javax.swing.JLabel();
        txtCodCli = new javax.swing.JTextField();
        LblDircc = new javax.swing.JLabel();
        TxtDireccion = new javax.swing.JTextField();
        LblColonia = new javax.swing.JLabel();
        TxtColonia = new javax.swing.JTextField();
        lblExt = new javax.swing.JLabel();
        TxtNex = new javax.swing.JTextField();
        lblNint = new javax.swing.JLabel();
        TxtInt = new javax.swing.JTextField();
        LblTel1 = new javax.swing.JLabel();
        TxtTel1 = new javax.swing.JTextField();
        lblTel2 = new javax.swing.JLabel();
        TxtTel2 = new javax.swing.JTextField();
        lblStat = new javax.swing.JLabel();
        TxtStat = new javax.swing.JTextField();
        JpDscri = new javax.swing.JPanel();
        lblPresta = new javax.swing.JLabel();
        TxtPrsta = new javax.swing.JTextField();
        LblImport = new javax.swing.JLabel();
        TxtImport = new javax.swing.JTextField();
        LblSaldo = new javax.swing.JLabel();
        TxtSaldo = new javax.swing.JTextField();
        Btnguardar = new javax.swing.JButton();
        BtnGenCheq = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JpaCheques.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Buscar cheque", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14))); // NOI18N

        Lblfolio.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        Lblfolio.setText("Folio:");

        BtnConsulC.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        BtnConsulC.setText("Consultar");
        BtnConsulC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConsulCActionPerformed(evt);
            }
        });

        LblNombrec.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        LblNombrec.setText("Nombre:");

        TxtNombreC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtNombreC.setEnabled(false);

        lblCodCliente.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblCodCliente.setText("Codigo cliente:");

        txtCodCli.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        txtCodCli.setEnabled(false);

        LblDircc.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        LblDircc.setText("Direccion:");

        TxtDireccion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtDireccion.setEnabled(false);

        LblColonia.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        LblColonia.setText("Colonia:");

        TxtColonia.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtColonia.setEnabled(false);

        lblExt.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblExt.setText("No.Exterior:");

        TxtNex.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtNex.setEnabled(false);

        lblNint.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblNint.setText("No.Interior:");

        TxtInt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtInt.setEnabled(false);

        LblTel1.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        LblTel1.setText("Telefono 1:");

        TxtTel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtTel1.setEnabled(false);

        lblTel2.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblTel2.setText("Telefono 2:");

        TxtTel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtTel2.setEnabled(false);

        lblStat.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblStat.setText("Status:");

        TxtStat.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtStat.setEnabled(false);

        javax.swing.GroupLayout JpaChequesLayout = new javax.swing.GroupLayout(JpaCheques);
        JpaCheques.setLayout(JpaChequesLayout);
        JpaChequesLayout.setHorizontalGroup(
            JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpaChequesLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpaChequesLayout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(Lblfolio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BtnConsulC, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpaChequesLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JpaChequesLayout.createSequentialGroup()
                                .addComponent(lblCodCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpaChequesLayout.createSequentialGroup()
                                    .addComponent(LblNombrec)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(TxtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, 449, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(261, 261, 261))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpaChequesLayout.createSequentialGroup()
                                    .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(JpaChequesLayout.createSequentialGroup()
                                            .addComponent(LblDircc)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(LblColonia)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(JpaChequesLayout.createSequentialGroup()
                                            .addComponent(lblExt)
                                            .addGap(18, 18, 18)
                                            .addComponent(TxtNex, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(lblNint)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtInt, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(37, 37, 37)
                                            .addComponent(LblTel1)
                                            .addGap(18, 18, 18)
                                            .addComponent(TxtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JpaChequesLayout.createSequentialGroup()
                                            .addComponent(lblTel2)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(39, 39, 39)
                                            .addComponent(lblStat)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(TxtStat, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGap(185, 185, 185)))))))
        );
        JpaChequesLayout.setVerticalGroup(
            JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpaChequesLayout.createSequentialGroup()
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtFolio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnConsulC)
                    .addComponent(Lblfolio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodCliente)
                    .addComponent(txtCodCli, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblNombrec))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblColonia)
                    .addComponent(TxtColonia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TxtDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblDircc))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblExt)
                    .addComponent(TxtNex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblNint)
                    .addComponent(TxtInt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LblTel1)
                    .addComponent(TxtTel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(JpaChequesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTel2)
                    .addComponent(TxtTel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblStat)
                    .addComponent(TxtStat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        JpDscri.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalles clientes", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 3, 14))); // NOI18N

        lblPresta.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        lblPresta.setText("Prestamo:");

        TxtPrsta.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtPrsta.setEnabled(false);

        LblImport.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        LblImport.setText("Importe:");

        TxtImport.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtImport.setEnabled(false);

        LblSaldo.setFont(new java.awt.Font("Ubuntu", 3, 15)); // NOI18N
        LblSaldo.setText("Saldo:");

        TxtSaldo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TxtSaldo.setEnabled(false);

        javax.swing.GroupLayout JpDscriLayout = new javax.swing.GroupLayout(JpDscri);
        JpDscri.setLayout(JpDscriLayout);
        JpDscriLayout.setHorizontalGroup(
            JpDscriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JpDscriLayout.createSequentialGroup()
                .addGroup(JpDscriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JpDscriLayout.createSequentialGroup()
                        .addComponent(lblPresta)
                        .addGap(7, 7, 7)
                        .addComponent(TxtPrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(LblSaldo)
                        .addGap(3, 3, 3)
                        .addComponent(TxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JpDscriLayout.createSequentialGroup()
                        .addComponent(LblImport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtImport, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 14, Short.MAX_VALUE))
        );
        JpDscriLayout.setVerticalGroup(
            JpDscriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JpDscriLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(JpDscriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtPrsta, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPresta)
                    .addComponent(LblSaldo)
                    .addComponent(TxtSaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(JpDscriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LblImport)
                    .addComponent(TxtImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        Btnguardar.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        Btnguardar.setText("Limpiar");
        Btnguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnguardarActionPerformed(evt);
            }
        });

        BtnGenCheq.setFont(new java.awt.Font("Ubuntu", 3, 16)); // NOI18N
        BtnGenCheq.setText("Generar Cheque");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(JpDscri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Btnguardar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BtnGenCheq, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(JpaCheques, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(JpaCheques, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JpDscri, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnGenCheq)
                    .addComponent(Btnguardar))
                .addGap(3, 3, 3))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnguardarActionPerformed
       /*Boton para limpiar los campos de los textos*/
       TxtFolio.setText("");
       TxtImport.setText("");
       TxtNombreC.setText("");
       TxtPrsta.setText("");
       TxtSaldo.setText("");
       txtCodCli.setText("");
       TxtDireccion.setText("");
       TxtColonia.setText("");
       TxtStat.setText("");
       TxtTel1.setText("");
       TxtInt.setText("");
       TxtNex.setText("");
       TxtTel2.setText("");
       
       
    }//GEN-LAST:event_BtnguardarActionPerformed

    private void BtnConsulCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConsulCActionPerformed
        /*evento donde se hace la consulta para la base de datos, buscando al cliente
        por su numero de folio*/
        Connection con=null;
        try{
            con = conexion();
            /*ps = con.prepareStatement("SELECT v.folio, c.nombre, v.codcliente, c.calle, c.numexterior," 
                            +"c.numinterior, col.colonia, v.saldo, v.importe,sut.nombre, c.telefono1, c.telefono2" 
                            +"FROM Abuelita.ven_nombre v" 
                            +"inner join Abuelita.catclientes c on v.codcliente=c.codigo" 
                            +"inner join Abuelita.catcolonias col on c.codcolonia=col.codigo" 
                            +"inner join Abuelita.catsituaciones sut on v.status=sut.numsistema where folio!=0");*/
            ps=con.prepareStatement("select nombre,codcliente,ven_nombre.saldo,importe,costo"
                    + "from Abuelita.ven_nombre"
                    + "inner join catclientes on codcliente=catclientes.codigo"
                    + "where folio = ?");
            ps.setString(1,TxtFolio.getText());
            /*Evento que se utiliza para ejecutar el quesry*/
            rs = ps.executeQuery();

            if(rs.next()){
                /*Rellenar campos del cliente
                
                TxtDireccion.setText(rs.getNString("calle"));
                TxtColonia.setText(rs.getNString("colonia")); 
                TxtInt.setText(rs.getNString("numerointerior"));
                TxtNex.setText(rs.getNString("numeroexterior"));
                TxtTel1.setText(rs.getNString("telefono1"));
                TxtTel2.setText(rs.getNString("telefono2"));
                TxtStat.setText(rs.getNString("nombre"));
                /*Rellenar campos de descipcion del cliente en su prestamo*/
                TxtNombreC.setText(rs.getNString("nombre"));
                txtCodCli.setText(rs.getString("codcliente"));
                TxtSaldo.setText(rs.getString("saldo")); 
                TxtImport.setText(rs.getString("importe"));
                TxtPrsta.setText(rs.getString("costo"));
            }

        }catch(Exception e){
            /*Error en la pantalla cuando no se encuentra al cliente*/
            System.out.print("no se encontro al cliente");
        }

    }//GEN-LAST:event_BtnConsulCActionPerformed

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
            java.util.logging.Logger.getLogger(ElaborarCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ElaborarCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ElaborarCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ElaborarCheque.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ElaborarCheque().setVisible(true);
            }
        });
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConsulC;
    private javax.swing.JButton BtnGenCheq;
    private javax.swing.JButton Btnguardar;
    private javax.swing.JPanel JpDscri;
    private javax.swing.JPanel JpaCheques;
    private javax.swing.JLabel LblColonia;
    private javax.swing.JLabel LblDircc;
    private javax.swing.JLabel LblImport;
    private javax.swing.JLabel LblNombrec;
    private javax.swing.JLabel LblSaldo;
    private javax.swing.JLabel LblTel1;
    private javax.swing.JLabel Lblfolio;
    private javax.swing.JTextField TxtColonia;
    private javax.swing.JTextField TxtDireccion;
    private javax.swing.JTextField TxtFolio;
    private javax.swing.JTextField TxtImport;
    private javax.swing.JTextField TxtInt;
    private javax.swing.JTextField TxtNex;
    private javax.swing.JTextField TxtNombreC;
    private javax.swing.JTextField TxtPrsta;
    private javax.swing.JTextField TxtSaldo;
    private javax.swing.JTextField TxtStat;
    private javax.swing.JTextField TxtTel1;
    private javax.swing.JTextField TxtTel2;
    private javax.swing.JLabel lblCodCliente;
    private javax.swing.JLabel lblExt;
    private javax.swing.JLabel lblNint;
    private javax.swing.JLabel lblPresta;
    private javax.swing.JLabel lblStat;
    private javax.swing.JLabel lblTel2;
    private javax.swing.JTextField txtCodCli;
    // End of variables declaration//GEN-END:variables
    
}
