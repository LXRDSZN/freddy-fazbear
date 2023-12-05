package com.login;
import java.awt.Color;;
import javax.swing.JOptionPane;
public class ventana_04 extends javax.swing.JFrame {
    
    int xMouse, yMouse;
    private int dato;
    public ventana_04() {
        initComponents(); 
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logo = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        pego_efectivo = new javax.swing.JPanel();
        efectivo = new javax.swing.JLabel();
        pego_tarjeta = new javax.swing.JPanel();
        tarjeta = new javax.swing.JLabel();
        cantidad_label = new javax.swing.JLabel();
        cantidad_combo = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        totalapagar = new javax.swing.JLabel();
        total_a_pagar = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/pizza-fotor.png"))); // NOI18N
        bg.add(logo, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 40, 290, 280));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
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

        jLabel2.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Selecciona Un Combo");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 331, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        jLabel1.setFont(new java.awt.Font("Hack Nerd Font Mono", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MÈTODO DE PAGO");
        bg.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 270, 40));

        pego_efectivo.setBackground(new java.awt.Color(0, 0, 0));

        efectivo.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        efectivo.setForeground(new java.awt.Color(255, 255, 255));
        efectivo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        efectivo.setText("Siguente");
        efectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        efectivo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                efectivoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                efectivoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                efectivoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pego_efectivoLayout = new javax.swing.GroupLayout(pego_efectivo);
        pego_efectivo.setLayout(pego_efectivoLayout);
        pego_efectivoLayout.setHorizontalGroup(
            pego_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
        );
        pego_efectivoLayout.setVerticalGroup(
            pego_efectivoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(efectivo, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(pego_efectivo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 444, 131, 40));

        pego_tarjeta.setBackground(new java.awt.Color(0, 0, 0));

        tarjeta.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        tarjeta.setForeground(new java.awt.Color(255, 255, 255));
        tarjeta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        tarjeta.setText("TARJETA");
        tarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tarjeta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tarjetaMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tarjetaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tarjetaMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pego_tarjetaLayout = new javax.swing.GroupLayout(pego_tarjeta);
        pego_tarjeta.setLayout(pego_tarjetaLayout);
        pego_tarjetaLayout.setHorizontalGroup(
            pego_tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tarjeta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pego_tarjetaLayout.setVerticalGroup(
            pego_tarjetaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tarjeta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(pego_tarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 444, 131, 40));

        cantidad_label.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        cantidad_label.setText(" cANTIDAD DE COMBOS");
        bg.add(cantidad_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        cantidad_combo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        cantidad_combo.setForeground(new java.awt.Color(204, 204, 204));
        cantidad_combo.setText("Ingrese la contidad de combos");
        cantidad_combo.setBorder(null);
        cantidad_combo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cantidad_comboMousePressed(evt);
            }
        });
        cantidad_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidad_comboActionPerformed(evt);
            }
        });
        bg.add(cantidad_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, 210, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PEPPERONI", "MUSHROOM", "MARGHERITA", "SEAFOOD", "MEXICAN", "HAWAIIAN" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        bg.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 490, 40));

        totalapagar.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        totalapagar.setText("Total a pagar");
        bg.add(totalapagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 240, -1, -1));

        total_a_pagar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        total_a_pagar.setForeground(new java.awt.Color(51, 51, 51));
        total_a_pagar.setBorder(null);
        total_a_pagar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                total_a_pagarMousePressed(evt);
            }
        });
        total_a_pagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                total_a_pagarActionPerformed(evt);
            }
        });
        bg.add(total_a_pagar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 270, 140, 30));

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

    private void efectivoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivoMouseClicked
        ventana_05 openventana = new ventana_05();
       // openventana.setdato(total_a_pagar.getText());
        openventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_efectivoMouseClicked

    private void efectivoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivoMouseEntered
        
    }//GEN-LAST:event_efectivoMouseEntered

    private void efectivoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_efectivoMouseExited
       
    }//GEN-LAST:event_efectivoMouseExited

    private void tarjetaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaMouseClicked
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "funcion en desarrollo.", "Tarjeta", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_tarjetaMouseClicked

    private void tarjetaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaMouseEntered

    private void tarjetaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tarjetaMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_tarjetaMouseExited

    private void cantidad_comboMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidad_comboMousePressed
        if (cantidad_combo.getText().equals("Ingrese la contidad de combos")) {
            cantidad_combo.setText("");
            cantidad_combo.setForeground(Color.black);
        }
    }//GEN-LAST:event_cantidad_comboMousePressed

    private void cantidad_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidad_comboActionPerformed
//cantidad
 actualizarPrecioTotal();
    }//GEN-LAST:event_cantidad_comboActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
//seleccion de pizza
// Obtener la pizza seleccionada del ComboBox
    String pizzaSeleccionada = (String) jComboBox1.getSelectedItem();

    // Verificar si la pizza seleccionada es válida
    if (pizzaSeleccionada != null && !pizzaSeleccionada.isEmpty()) {
        // Obtener el precio de la pizza seleccionada
        double precioPizza = obtenerPrecioPizza(pizzaSeleccionada);

        // Imprimir para depurar
        System.out.println("Pizza seleccionada: " + pizzaSeleccionada + ", Precio: " + precioPizza);

        // Actualizar el precio cuando se selecciona una pizza
        actualizarPrecioTotal();
    } else {
        // Mostrar un mensaje de error o manejar la pizza no seleccionada de alguna manera
        System.out.println("Error: Seleccione una pizza válida");
    }
    }//GEN-LAST:event_jComboBox1ActionPerformed

    
private void actualizarPrecioTotal() {
    // Obtener la cantidad ingresada por el usuario desde el TextField
    String cantidadTexto = cantidad_combo.getText();

    // Validar si la cadena es un número
    if (esNumero(cantidadTexto)) {
        int cantidad = Integer.parseInt(cantidadTexto);

        // Obtener el precio de la pizza seleccionada
        double precioPizza = obtenerPrecioPizza((String) jComboBox1.getSelectedItem());

        // Calcular el precio total
        double precioTotal = cantidad * precioPizza;

        // Mostrar el precio total en el campo de texto (TextField)
        total_a_pagar.setText(""+precioTotal);
    } else {
        // Mostrar un mensaje de error o manejar la entrada incorrecta de alguna manera
        System.out.println("Error: Ingrese un valor numérico válido");
    }
}

// Método para validar si una cadena es un número
private boolean esNumero(String str) {
    try {
        Integer.parseInt(str);
        return true;
    } catch (NumberFormatException e) {
        return false;
    }
}
    private void total_a_pagarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_total_a_pagarMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_total_a_pagarMousePressed

    private void total_a_pagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_total_a_pagarActionPerformed
//obtener precio 
    }//GEN-LAST:event_total_a_pagarActionPerformed



   // Método para obtener el precio de una pizza específica
private double obtenerPrecioPizza(String pizza) {
    switch (pizza) {
        case "PEPPERONI":
            return 35.00;
        case "MUSHROOM":
            return 30.00;
        case "MARGHERITA":
            return 28.00;
        case "SEAFOOD":
            return 40.00;
        case "MEXICAN":
            return 28.00;
        case "HAWAIIAN":
            return 35.00;
        default:
            return 0.0;
    }
} 
// Método para obtener el precio del combo seleccionado


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
            java.util.logging.Logger.getLogger(ventana_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ventana_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ventana_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ventana_04.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ventana_04().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JTextField cantidad_combo;
    private javax.swing.JLabel cantidad_label;
    private javax.swing.JLabel efectivo;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel logo;
    private javax.swing.JPanel pego_efectivo;
    private javax.swing.JPanel pego_tarjeta;
    private javax.swing.JLabel tarjeta;
    private javax.swing.JTextField total_a_pagar;
    private javax.swing.JLabel totalapagar;
    // End of variables declaration//GEN-END:variables
}
