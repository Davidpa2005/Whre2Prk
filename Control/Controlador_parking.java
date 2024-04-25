package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VentanaParking;

public class Controlador_parking implements ActionListener {
    public VentanaParking ventanaParking;
    public Sistema_Conductor sistema_Conductor;
    
    public Controlador_parking(Sistema_Conductor sistema_Conductor, VentanaParking ventanaParking) {
        this.ventanaParking = ventanaParking;
        this.sistema_Conductor = sistema_Conductor;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
    }
    
}
