package Vista;

import java.awt.FlowLayout;

import javax.swing.*;
import Control.*;

public class VentanaRegistroTarj extends JFrame {

    public Controlador_RegTarj controlador;
    public JTextField numeroTarj;
    public JLabel labelNumTarj;
    public JTextField cvv;
    public JLabel labelCvv;
    public JTextField mesCaducidad;
    public JLabel labelMesCaducidad;
    public JTextField añoCaducidad;
    public JLabel labelAñoCaducidad;
    public JButton registarButton;

    public void crearVista() {
        numeroTarj = new JTextField(20);
        labelNumTarj = new JLabel("Numero de Tarjeta");
        cvv = new JTextField(4);
        labelCvv = new JLabel("CVV");
        mesCaducidad = new JTextField(4);
        labelMesCaducidad = new JLabel("Mes de caducidad");
        añoCaducidad = new JTextField(4);
        labelAñoCaducidad = new JLabel("Año de caducidad");
        registarButton = new JButton("Registar");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(labelNumTarj);
        this.getContentPane().add(numeroTarj);
        this.getContentPane().add(labelCvv);
        this.getContentPane().add(cvv);
        this.getContentPane().add(labelMesCaducidad);
        this.getContentPane().add(mesCaducidad);
        this.getContentPane().add(labelAñoCaducidad);
        this.getContentPane().add(añoCaducidad);
        this.getContentPane().add(registarButton);

        registarButton.addActionListener(controlador);

        this.setVisible(true);
        this.setTitle("Whre2Prk");
        // el tamaño de la ventana
        this.setSize(300, 500);

    }

    
}