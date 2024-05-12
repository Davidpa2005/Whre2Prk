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
            int numTarjeta = Integer.parseInt(ventanaRegistroTarj.numeroTarj.getText());
            int cvv = Integer.parseInt(ventanaRegistroTarj.cvv.getText());
            int mesCaducidad = Integer.parseInt(ventanaRegistroTarj.mesCaducidad.getText());
            int añoCaducidad = Integer.parseInt(ventanaRegistroTarj.añoCaducidad.getText());

            sistema_Conductor.usuario.registrarTarjeta(cvv, numTarjeta, añoCaducidad, mesCaducidad);
            

        }
    }
    
}
