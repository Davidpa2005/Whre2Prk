package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VentanaEspaciosOcupados;
import Vista.VentanaPagosRealizados;

public class ControladorGarita implements ActionListener {

    public Sistema_Garita sistema_Garita;
    public VentanaEspaciosOcupados ventanaEspaciosOcupados;
    public VentanaPagosRealizados ventanaPagosRealizados;
    
    public ControladorGarita(Sistema_Garita sistema_Garita, VentanaEspaciosOcupados ventanaEspaciosOcupados,
            VentanaPagosRealizados ventanaPagosRealizados) {
        this.sistema_Garita = sistema_Garita;
        this.ventanaEspaciosOcupados = ventanaEspaciosOcupados;
        this.ventanaPagosRealizados = ventanaPagosRealizados; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
    }
    
}
