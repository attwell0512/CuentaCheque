/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentacheques;

/**
 *
 * @author axel
 */
public class MenuCheques extends javax.swing.JFrame{

    /**
     * Creates new form MenuCheques
     */
    public MenuCheques() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar1 = new javax.swing.JMenuBar();
        MnCheques = new javax.swing.JMenu();
        MitCheque = new javax.swing.JMenuItem();
        MnBsqC = new javax.swing.JMenuItem();
        MnBsq = new javax.swing.JMenu();
        MnClf = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MnCheques.setText("Cheques ");

        MitCheque.setText("Elaborar cheque");
        MitCheque.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MitChequeActionPerformed(evt);
            }
        });
        MnCheques.add(MitCheque);

        MnBsqC.setText("Busqueda Cheques");
        MnBsqC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MnBsqCActionPerformed(evt);
            }
        });
        MnCheques.add(MnBsqC);

        jMenuBar1.add(MnCheques);

        MnBsq.setText("Busqueda");

        MnClf.setText("Cliente por folio");
        MnBsq.add(MnClf);

        jMenuBar1.add(MnBsq);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 428, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 154, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MitChequeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MitChequeActionPerformed
        // TODO add your handling code here:
        ElaborarCheque Elc = new ElaborarCheque();
        Elc.setVisible(true);
    }//GEN-LAST:event_MitChequeActionPerformed

    private void MnBsqCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MnBsqCActionPerformed
        // TODO add your handling code here:
        BusquedaCheques Bsqc= new BusquedaCheques();
        Bsqc.setVisible(true);
    }//GEN-LAST:event_MnBsqCActionPerformed

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
            java.util.logging.Logger.getLogger(MenuCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuCheques.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuCheques().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MitCheque;
    private javax.swing.JMenu MnBsq;
    private javax.swing.JMenuItem MnBsqC;
    private javax.swing.JMenu MnCheques;
    private javax.swing.JMenuItem MnClf;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}
