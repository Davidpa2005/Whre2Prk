package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VentanaRegistroTarj;

public class Controlador_RegTarj implements ActionListener {

    public Sistema_Conductor sistema_Conductor;
    public VentanaRegistroTarj ventanaRegistroTarj;
    
    public Controlador_RegTarj(Sistema_Conductor sistema_Conductor, VentanaRegistroTarj ventanaRegistroTarj) {
        this.sistema_Conductor = sistema_Conductor;
        this.ventanaRegistroTarj = ventanaRegistroTarj;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaRegistroTarj.registarButton) {
            
        }
    }
    
}
