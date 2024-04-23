package Control;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VentanaParking;
import Vista.VentanaQR;
public class Controlador implements ActionListener{
    
    VentanaQR ventanaQR;
    VentanaParking ventanaParking;

    public Controlador(VentanaQR win, VentanaParking vent) {
        ventanaQR = win;
        ventanaParking = vent;
    }


    // metodo al que se llamara al hacer click
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaQR.miBoton) {
            ventanaParking.crearVista();
            ventanaParking.setVisible(true);
        } else {
            System.out.println("Ocurrio un Evento en el otro boton");
        }
    }

}

