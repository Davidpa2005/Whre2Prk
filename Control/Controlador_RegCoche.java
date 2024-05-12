package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VentanaRegistroCoche;

public class Controlador_RegCoche implements ActionListener {
    
    public Sistema_Conductor sistema_Conductor;
    public VentanaRegistroCoche ventanaRegistroCoche;

    public Controlador_RegCoche(Sistema_Conductor sistema_Conductor, VentanaRegistroCoche ventanaRegistroCoche) {
        this.sistema_Conductor = sistema_Conductor;
        this.ventanaRegistroCoche = ventanaRegistroCoche;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaRegistroCoche.registrarCocheBoton) {
            String matricula = ventanaRegistroCoche.matricula.getText();
            
            sistema_Conductor.usuario.registrarCoche(matricula);
        }
    }
    
}
