package Vista;

import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import Control.Controlador;

public class VentanaParking extends JFrame{
    
    public Controlador controlador;
    public JButton miBoton;
    public JButton miOtroBoton;

    public void crearVista() {
        // creamos los botones

        miBoton = new JButton("Click");
        ImageIcon imageIcon = new ImageIcon("./Whre2Prk-main/Qr.jpeg"); // Asegúrate de proporcionar la ruta correcta
        // Crear un JLabel y establecer el ImageIcon como su icono
        JLabel label = new JLabel(imageIcon);
        // los colocamos
        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(label);
        this.getContentPane().add(miBoton);

        // registramos los controladores
        miBoton.addActionListener(controlador);

        // Hacemos todo visible
        this.setVisible(true);
        this.setTitle("Whre2Prk");
        // el tamaño de la ventana
        this.setSize(300, 500);
    }
    
}
