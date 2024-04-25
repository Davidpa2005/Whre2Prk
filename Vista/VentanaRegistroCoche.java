package Vista;

import java.awt.FlowLayout;

import javax.swing.*;
import Control.*;

public class VentanaRegistroCoche extends JFrame {
    
    public Controlador_RegCoche controlador;
    public JTextField matricula;
    public JLabel labelMatricula;
    public JButton registrarCocheBoton;

    public void crearVista() {
        
        registrarCocheBoton = new JButton("Registrar");
        matricula = new JTextField(15);
        labelMatricula = new JLabel("Matricula");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(labelMatricula);
        this.getContentPane().add(matricula);
        this.getContentPane().add(registrarCocheBoton);

        registrarCocheBoton.addActionListener(controlador);

        this.setVisible(true);
        this.setTitle("Whre2Prk");
        // el tamaño de la ventana
        this.setSize(300, 500);
    }
    
}
