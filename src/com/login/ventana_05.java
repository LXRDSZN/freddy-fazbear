package com.login;

import java.awt.Color;
import javax.swing.JOptionPane;
import javax.swing.Timer;

public class ventana_05 extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    private int loginAttempts = 0;
    private Timer timer;
    private boolean timerRunning = false; // Variable para verificar si el temporizador está en ejecución
    public ventana_05() {
        initComponents();
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        favicon = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        recibi_pago = new javax.swing.JLabel();
        recibi_pago_text = new javax.swing.JTextField();
        precio_total_descuento = new javax.swing.JLabel();
        precio_total_descuento_text = new javax.swing.JTextField();
        devolvi_cambio = new javax.swing.JLabel();
        devolvi_cambio_text = new javax.swing.JTextField();
        nombre_de_combo = new javax.swing.JLabel();
        nombre_De_combo_text = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/pizza-fotor.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 290, 280));

        favicon.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        favicon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/headerlogomodificado.png"))); // NOI18N
        bg.add(favicon, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 330, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        bg.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 0, 330, 500));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 800, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        jCheckBox1.setForeground(new java.awt.Color(0, 0, 0));
        jCheckBox1.setText("Usar descuento");
        bg.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 170, -1, -1));

        recibi_pago.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        recibi_pago.setText("Recibì");
        bg.add(recibi_pago, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        recibi_pago_text.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        recibi_pago_text.setForeground(new java.awt.Color(204, 204, 204));
        recibi_pago_text.setText("$");
        recibi_pago_text.setBorder(null);
        recibi_pago_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                recibi_pago_textMousePressed(evt);
            }
        });
        recibi_pago_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recibi_pago_textActionPerformed(evt);
            }
        });
        bg.add(recibi_pago_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 120, 30));

        precio_total_descuento.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        precio_total_descuento.setText("Precio total");
        bg.add(precio_total_descuento, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        precio_total_descuento_text.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        precio_total_descuento_text.setForeground(new java.awt.Color(204, 204, 204));
        precio_total_descuento_text.setText("$");
        precio_total_descuento_text.setToolTipText("");
        precio_total_descuento_text.setBorder(null);
        precio_total_descuento_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                precio_total_descuento_textMousePressed(evt);
            }
        });
        precio_total_descuento_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precio_total_descuento_textActionPerformed(evt);
            }
        });
        bg.add(precio_total_descuento_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 210, 30));

        devolvi_cambio.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        devolvi_cambio.setText("devolvì");
        bg.add(devolvi_cambio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        devolvi_cambio_text.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        devolvi_cambio_text.setForeground(new java.awt.Color(204, 204, 204));
        devolvi_cambio_text.setText("$");
        devolvi_cambio_text.setBorder(null);
        devolvi_cambio_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                devolvi_cambio_textMousePressed(evt);
            }
        });
        devolvi_cambio_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                devolvi_cambio_textActionPerformed(evt);
            }
        });
        bg.add(devolvi_cambio_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 120, 30));

        nombre_de_combo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        nombre_de_combo.setText("Nombre Del Combo");
        bg.add(nombre_de_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        nombre_De_combo_text.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        nombre_De_combo_text.setForeground(new java.awt.Color(51, 51, 51));
        nombre_De_combo_text.setText("$");
        nombre_De_combo_text.setBorder(null);
        nombre_De_combo_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nombre_De_combo_textMousePressed(evt);
            }
        });
        nombre_De_combo_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_De_combo_textActionPerformed(evt);
            }
        });
        bg.add(nombre_De_combo_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 140, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void recibi_pago_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_recibi_pago_textMousePressed
        if (recibi_pago_text.getText().equals("Ingrese la contidad de combos")) {
            recibi_pago_text.setText("");
            recibi_pago_text.setForeground(Color.black);
        }
    }//GEN-LAST:event_recibi_pago_textMousePressed

    private void recibi_pago_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recibi_pago_textActionPerformed

    }//GEN-LAST:event_recibi_pago_textActionPerformed

    private void precio_total_descuento_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precio_total_descuento_textMousePressed
        if (recibi_pago_text.getText().equals("Ingrese la contidad de combos")) {
            recibi_pago_text.setText("");
            recibi_pago_text.setForeground(Color.black);
        }
    }//GEN-LAST:event_precio_total_descuento_textMousePressed

    private void precio_total_descuento_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precio_total_descuento_textActionPerformed

    }//GEN-LAST:event_precio_total_descuento_textActionPerformed

    private void devolvi_cambio_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_devolvi_cambio_textMousePressed
  
    }//GEN-LAST:event_devolvi_cambio_textMousePressed

    private void devolvi_cambio_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_devolvi_cambio_textActionPerformed

    }//GEN-LAST:event_devolvi_cambio_textActionPerformed

    private void nombre_De_combo_textMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombre_De_combo_textMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombre_De_combo_textMousePressed

    private void nombre_De_combo_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_De_combo_textActionPerformed
        //obtener precio
    }//GEN-LAST:event_nombre_De_combo_textActionPerformed

     private boolean isValidLogin(String username, String password) {

        return username.equals("freddy") && password.equals("fazbear");
    }

    private void resetLoginAttempts() {
        loginAttempts = 0;
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
            java.util.logging.Logger.getLogger(ventana_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_05.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_05().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel devolvi_cambio;
    private javax.swing.JTextField devolvi_cambio_text;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JLabel favicon;
    private javax.swing.JPanel header;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JTextField nombre_De_combo_text;
    private javax.swing.JLabel nombre_de_combo;
    private javax.swing.JLabel precio_total_descuento;
    private javax.swing.JTextField precio_total_descuento_text;
    private javax.swing.JLabel recibi_pago;
    private javax.swing.JTextField recibi_pago_text;
    // End of variables declaration//GEN-END:variables
}
