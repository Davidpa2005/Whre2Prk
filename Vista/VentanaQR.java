package Vista;

import java.awt.FlowLayout;

import javax.swing.*;
import Control.*;

public class VentanaQR extends JFrame{

    public Controlador controlador;
    public JButton visualizarParking;
    public JButton registrarCoche;
    public JButton registrarTarj;
    
    public void crearVista() {
        // creamos los botones

        visualizarParking = new JButton("Empezar a Aparcar");
        registrarCoche = new JButton("Registrar Coche");
        registrarTarj = new JButton("Registar Tarjeta");

        ImageIcon imagenQr = new ImageIcon("./Qr.jpeg"); // Asegúrate de proporcionar la ruta correcta
        // Crear un JLabel y establecer el ImageIcon como su icono
        JLabel qr = new JLabel(imagenQr);
        // los colocamos
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(qr);
        this.getContentPane().add(visualizarParking);
        this.getContentPane().add(registrarCoche);
        this.getContentPane().add(registrarTarj);
        
        // registramos los controladores
        visualizarParking.addActionListener(controlador);
        registrarCoche.addActionListener(controlador);
        registrarTarj.addActionListener(controlador);

        // Hacemos todo visible
        this.setVisible(true);
        this.setTitle("Whre2Prk");
        // el tamaño de la ventana
        this.setSize(300, 500);
    }
}
