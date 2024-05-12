package Vista;

import java.awt.FlowLayout;

import javax.swing.*;
import Control.ControladorGarita;

public class VentanaEspaciosOcupados extends JFrame {
    public ControladorGarita controladorGarita;


    public void crearVista() {
        this.getContentPane().setLayout(new FlowLayout());

        this.setVisible(true);
        this.setSize(300, 500);
    }
    
    
}
