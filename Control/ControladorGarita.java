package Control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import Vista.VentanaEspaciosOcupados;
import Vista.VentanaPagosRealizados;
import Vista.VentanaPrincipalGarita;

public class ControladorGarita implements ActionListener {

    public Sistema_Garita sistema_Garita;
    public VentanaEspaciosOcupados ventanaEspaciosOcupados;
    public VentanaPagosRealizados ventanaPagosRealizados;
    public VentanaPrincipalGarita ventanaPrincipalGarita;
    
    public ControladorGarita(Sistema_Garita sistema_Garita, VentanaEspaciosOcupados ventanaEspaciosOcupados,
            VentanaPagosRealizados ventanaPagosRealizados, VentanaPrincipalGarita ventanaPrincipalGarita) {
        this.sistema_Garita = sistema_Garita;
        this.ventanaEspaciosOcupados = ventanaEspaciosOcupados;
        this.ventanaPagosRealizados = ventanaPagosRealizados;
        this.ventanaPrincipalGarita = ventanaPrincipalGarita; 
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == ventanaPrincipalGarita.verEspaciosOcupados) {
            ventanaEspaciosOcupados.crearVista();
        } else if (e.getSource() == ventanaPrincipalGarita.verPagosButton) {
            ventanaPagosRealizados.crearVista();
        }
        
    }
    
}
