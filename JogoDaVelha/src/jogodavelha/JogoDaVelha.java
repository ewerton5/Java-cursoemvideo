/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogodavelha;

/**
 *
 * @author Ewerton
 */
public class JogoDaVelha extends javax.swing.JFrame {

    /**
     * Creates new form JogoDaVelha
     */
    int c = 1;
    boolean j[] = new boolean[10];

    void FimDeJogo() {
        if ((x1.isVisible() == true && x2.isVisible() == true && x3.isVisible() == true)
                || (x4.isVisible() == true && x5.isVisible() == true && x6.isVisible() == true)
                || (x7.isVisible() == true && x8.isVisible() == true && x9.isVisible() == true)
                || (x1.isVisible() == true && x4.isVisible() == true && x7.isVisible() == true)
                || (x2.isVisible() == true && x5.isVisible() == true && x8.isVisible() == true)
                || (x3.isVisible() == true && x6.isVisible() == true && x9.isVisible() == true)
                || (x1.isVisible() == true && x5.isVisible() == true && x9.isVisible() == true)
                || (x3.isVisible() == true && x5.isVisible() == true && x7.isVisible() == true)) {
            jv.setVisible(true);
            jvtxt.setText("Jogador 1 venceu!");
            for (int i = 0; i < 10; i++) {
                j[i] = true;
            }
        } else if ((o1.isVisible() == true && o2.isVisible() == true && o3.isVisible() == true)
                || (o4.isVisible() == true && o5.isVisible() == true && o6.isVisible() == true)
                || (o7.isVisible() == true && o8.isVisible() == true && o9.isVisible() == true)
                || (o1.isVisible() == true && o4.isVisible() == true && o7.isVisible() == true)
                || (o2.isVisible() == true && o5.isVisible() == true && o8.isVisible() == true)
                || (o3.isVisible() == true && o6.isVisible() == true && o9.isVisible() == true)
                || (o1.isVisible() == true && o5.isVisible() == true && o9.isVisible() == true)
                || (o3.isVisible() == true && o5.isVisible() == true && o7.isVisible() == true)) {
            jv.setVisible(true);
            jvtxt.setText("Jogador 2 venceu!");
            for (int i = 0; i < 10; i++) {
                j[i] = true;
            }
        } else if (c == 10) {
            jv.setVisible(true);
            jvtxt.setText("Xiii, deu velha!");
        }
    }

    public JogoDaVelha() {
        initComponents();
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(false);
        x5.setVisible(false);
        x6.setVisible(false);
        x7.setVisible(false);
        x8.setVisible(false);
        x9.setVisible(false);
        o1.setVisible(false);
        o2.setVisible(false);
        o3.setVisible(false);
        o4.setVisible(false);
        o5.setVisible(false);
        o6.setVisible(false);
        o7.setVisible(false);
        o8.setVisible(false);
        o9.setVisible(false);
        jv.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jv = new javax.swing.JPanel();
        jvtxt = new javax.swing.JLabel();
        jnbutton = new javax.swing.JButton();
        o2 = new javax.swing.JLabel();
        o3 = new javax.swing.JLabel();
        o4 = new javax.swing.JLabel();
        o5 = new javax.swing.JLabel();
        o6 = new javax.swing.JLabel();
        o7 = new javax.swing.JLabel();
        o8 = new javax.swing.JLabel();
        o9 = new javax.swing.JLabel();
        x9 = new javax.swing.JLabel();
        x8 = new javax.swing.JLabel();
        x7 = new javax.swing.JLabel();
        x6 = new javax.swing.JLabel();
        x5 = new javax.swing.JLabel();
        x4 = new javax.swing.JLabel();
        x3 = new javax.swing.JLabel();
        x2 = new javax.swing.JLabel();
        x1 = new javax.swing.JLabel();
        o1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Jogo da Velha");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jv.setBackground(new java.awt.Color(255, 255, 255));
        jv.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jvtxt.setFont(new java.awt.Font("Book Antiqua", 3, 48)); // NOI18N
        jvtxt.setText("Jogador venceu!");
        jv.add(jvtxt);

        jnbutton.setText("Jogar novamente");
        jnbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jnbuttonActionPerformed(evt);
            }
        });
        jv.add(jnbutton);

        getContentPane().add(jv, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, 450, 110));

        o2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        o3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        o4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        o5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        o6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        o7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        o8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        o9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        x9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x9, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        x8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x8, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 340, -1, -1));

        x7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        x6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 190, -1, -1));

        x5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, -1, -1));

        x4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        x3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, -1, -1));

        x2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        getContentPane().add(x2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, -1, -1));

        x1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/x.jpg"))); // NOI18N
        x1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                x1MouseClicked(evt);
            }
        });
        getContentPane().add(x1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        o1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/bola.jpg"))); // NOI18N
        getContentPane().add(o1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/TabuleiroJogoDaVelha.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(3, 3, 150, 150));

        jButton2.setText("jButton1");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 10, 150, 150));

        jButton3.setText("jButton1");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 150, 150));

        jButton4.setText("jButton1");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 150, 150));

        jButton5.setText("jButton1");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, 150, 150));

        jButton6.setText("jButton1");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 170, 150, 150));

        jButton7.setText("jButton1");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 150, 150));

        jButton8.setText("jButton1");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 310, 150, 150));

        jButton9.setText("jButton1");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, 150, 150));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (j[1] == false) {
            if (c % 2 != 0) {
                x1.setVisible(true);
                c++;
            } else {
                o1.setVisible(true);
                c++;
            }
            j[1] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if (j[2] == false) {
            if (c % 2 != 0) {
                x2.setVisible(true);
                c++;
            } else {
                o2.setVisible(true);
                c++;
            }
            j[2] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if (j[3] == false) {
            if (c % 2 != 0) {
                x3.setVisible(true);
                c++;
            } else {
                o3.setVisible(true);
                c++;
            }
            j[3] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if (j[4] == false) {
            if (c % 2 != 0) {
                x4.setVisible(true);
                c++;
            } else {
                o4.setVisible(true);
                c++;
            }
            j[4] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (j[5] == false) {
            if (c % 2 != 0) {
                x5.setVisible(true);
                c++;
            } else {
                o5.setVisible(true);
                c++;
            }
            j[5] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (j[6] == false) {
            if (c % 2 != 0) {
                x6.setVisible(true);
                c++;
            } else {
                o6.setVisible(true);
                c++;
            }
            j[6] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        if (j[7] == false) {
            if (c % 2 != 0) {
                x7.setVisible(true);
                c++;
            } else {
                o7.setVisible(true);
                c++;
            }
            j[7] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        if (j[8] == false) {
            if (c % 2 != 0) {
                x8.setVisible(true);
                c++;
            } else {
                o8.setVisible(true);
                c++;
            }
            j[8] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (j[9] == false) {
            if (c % 2 != 0) {
                x9.setVisible(true);
                c++;
            } else {
                o9.setVisible(true);
                c++;
            }
            j[9] = true;
            FimDeJogo();
        }
    }//GEN-LAST:event_jButton9ActionPerformed

    private void x1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_x1MouseClicked

    }//GEN-LAST:event_x1MouseClicked

    private void jnbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jnbuttonActionPerformed
        // TODO add your handling code here:
        x1.setVisible(false);
        x2.setVisible(false);
        x3.setVisible(false);
        x4.setVisible(false);
        x5.setVisible(false);
        x6.setVisible(false);
        x7.setVisible(false);
        x8.setVisible(false);
        x9.setVisible(false);
        o1.setVisible(false);
        o2.setVisible(false);
        o3.setVisible(false);
        o4.setVisible(false);
        o5.setVisible(false);
        o6.setVisible(false);
        o7.setVisible(false);
        o8.setVisible(false);
        o9.setVisible(false);
        jv.setVisible(false);
        c = 1;
        for (int i = 0; i < 10; i++) {
            j[i] = false;
        }
    }//GEN-LAST:event_jnbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JogoDaVelha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JogoDaVelha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jnbutton;
    private javax.swing.JPanel jv;
    private javax.swing.JLabel jvtxt;
    private javax.swing.JLabel o1;
    private javax.swing.JLabel o2;
    private javax.swing.JLabel o3;
    private javax.swing.JLabel o4;
    private javax.swing.JLabel o5;
    private javax.swing.JLabel o6;
    private javax.swing.JLabel o7;
    private javax.swing.JLabel o8;
    private javax.swing.JLabel o9;
    private javax.swing.JLabel x1;
    private javax.swing.JLabel x2;
    private javax.swing.JLabel x3;
    private javax.swing.JLabel x4;
    private javax.swing.JLabel x5;
    private javax.swing.JLabel x6;
    private javax.swing.JLabel x7;
    private javax.swing.JLabel x8;
    private javax.swing.JLabel x9;
    // End of variables declaration//GEN-END:variables
}