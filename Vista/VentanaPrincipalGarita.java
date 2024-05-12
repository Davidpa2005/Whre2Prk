package Vista;

import java.awt.FlowLayout;
import javax.swing.*;

import Control.ControladorGarita;

public class VentanaPrincipalGarita extends JFrame {
    public ControladorGarita controladorGarita;
    public JButton verPagosButton;
    public JButton verEspaciosOcupados;

    public void crearVista() {
        verPagosButton = new JButton("Ver Pagos");
        verEspaciosOcupados = new JButton("Ver Espacios");

        this.getContentPane().setLayout(new FlowLayout());
        this.getContentPane().add(verPagosButton);
        this.getContentPane().add(verEspaciosOcupados);

        verEspaciosOcupados.addActionListener(controladorGarita);
        verPagosButton.addActionListener(controladorGarita);

        this.setVisible(true);
        this.setSize(300,500);
    }
    
}
