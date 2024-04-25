package Vista;

import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.*;
import Control.*;
import Modelo.*;

public class VentanaParking extends JFrame {
    
    public Controlador_parking controlador;
    public JButton aparcarBoton;
    public JButton registrarCoche;
    public JButton registrarTarj;
    

    public void crearVista() {
        Lectura_Escritura lect_escrt = new Lectura_Escritura();
        String[] plazasLibres = lect_escrt.leerPlazasLibres();
        JComboBox cb = new JComboBox(plazasLibres);
        aparcarBoton = new JButton("Aparcado");
        ImageIcon imagen = new ImageIcon("./WhatsApp Image 2024-04-25 at 12.38.04.jpeg");
        Image imagen1 = imagen.getImage();
        imagen1 = imagen1.getScaledInstance(250, 300,0);
        ImageIcon imagen2 = new ImageIcon(imagen1);
        JLabel imagenParking = new JLabel(imagen2);
        // los colocamos
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(imagenParking);
        this.getContentPane().add(cb);
        this.getContentPane().add(aparcarBoton);

        // registramos los controladores
        aparcarBoton.addActionListener(controlador);

        // Hacemos todo visible
        this.setVisible(true);
        this.setTitle("Whre2Prk");
        // el tamaño de la ventana
        this.setSize(300, 500);
    }
    
}
