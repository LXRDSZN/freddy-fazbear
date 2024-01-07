/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.login;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PantallaCarga extends JFrame {
    private JProgressBar progressBar;
    private Timer timer;

    public PantallaCarga() {
        setTitle("Pantalla de Carga");
        setSize(840, 500);
        setResizable(false); // Evitar que el usuario redimensione la ventana
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar la ventana en la pantalla

        progressBar = new JProgressBar(0, 100);
        progressBar.setStringPainted(true);

        add(progressBar, BorderLayout.CENTER);

        timer = new Timer(50, new ActionListener() {
            int progress = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                progressBar.setValue(progress);
                if (progress == 100) {
                    timer.stop();
                    abrirMenu();
                }
                progress++;
            }
        });

        timer.start();
    }

    private void abrirMenu() {
        SwingUtilities.invokeLater(() -> {
            Menu menu = new Menu();
            menu.setVisible(true);
            dispose(); // Cierra la pantalla de carga después de abrir el menú
        });
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            PantallaCarga pantallaCarga = new PantallaCarga();
            pantallaCarga.setVisible(true);
        });
    }
}
