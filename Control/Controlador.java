package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.*;

public class Controlador implements ActionListener{
    
    VentanaQR ventanaQR;
    VentanaParking ventanaParking;
    VentanaRegistroCoche ventanaRegistroCoche;
    VentanaRegistroTarj ventanaRegistroTarj;
    Sistema_Conductor sistema_Conductor;


    public Controlador(Sistema_Conductor sistemaConductor, VentanaQR ventQr, VentanaParking ventanaParking, VentanaRegistroCoche ventanaRegistroCoche, VentanaRegistroTarj ventanaRegistroTarj) {
        this.ventanaQR = ventQr;
        this.ventanaParking = ventanaParking;
        this.ventanaRegistroCoche = ventanaRegistroCoche;
        this.ventanaRegistroTarj = ventanaRegistroTarj;
        this.sistema_Conductor = sistemaConductor;
    }

    // metodo al que se llamara al hacer click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaQR.visualizarParking) {
            ventanaParking.crearVista();
            
        } else if(e.getSource() == ventanaQR.registrarCoche){
            ventanaRegistroCoche.crearVista();
            
        } else if (e.getSource() == ventanaQR.registrarTarj) {
            ventanaRegistroTarj.crearVista();
            
        }
    }
}
