/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.awt.Font;

/**
 *
 * @author Guanabara
 */
public class telaSorteio extends javax.swing.JFrame {

    /**
     * Creates new form telaSorteio
     */
    public telaSorteio() {
        initComponents();
        lblFrase.setText("<html>Estou pensando em um número entre <b>1 e 5</b>. Tente adivinhar que valor é esse.</html>");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblFrase = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        panPalpite = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        txtValor = new javax.swing.JSpinner();
        btnPalpite = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("acerte o numero");
        setPreferredSize(new java.awt.Dimension(315, 370));
        setResizable(false);
        getContentPane().setLayout(null);

        lblFrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFrase.setText("Frase do Gênio");
        lblFrase.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFrase.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        lblFrase.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        getContentPane().add(lblFrase);
        lblFrase.setBounds(30, 50, 160, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/balao.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 200, 169);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/genio.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(170, 120, 138, 200);

        jLabel3.setText("Valor");

        btnPalpite.setText("Palpite");
        btnPalpite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPalpiteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panPalpiteLayout = new javax.swing.GroupLayout(panPalpite);
        panPalpite.setLayout(panPalpiteLayout);
        panPalpiteLayout.setHorizontalGroup(
            panPalpiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPalpiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPalpiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panPalpiteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnPalpite))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        panPalpiteLayout.setVerticalGroup(
            panPalpiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panPalpiteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panPalpiteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnPalpite)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(panPalpite);
        panPalpite.setBounds(30, 200, 140, 80);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPalpiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPalpiteActionPerformed
        // TODO add your handling code here:
        double rand = 1 + Math.random() * (6-1);
        int pensamento = (int) rand; // Também pode usar Math.floor
        int num = Integer.parseInt(txtValor.getValue().toString());
        String frase = (num == pensamento)?"<html>ACERTOU!</html>":"<html>ERROU! Pensei em " + pensamento + "</html>";
        lblFrase.setFont(new Font("Arial Black", Font.BOLD, 18));
        lblFrase.setText(frase);
    }//GEN-LAST:event_btnPalpiteActionPerformed

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
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaSorteio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaSorteio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPalpite;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblFrase;
    private javax.swing.JPanel panPalpite;
    private javax.swing.JSpinner txtValor;
    // End of variables declaration//GEN-END:variables
}
