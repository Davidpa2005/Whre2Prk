package Control;

import Vista.VentanaEspaciosOcupados;
import Vista.VentanaPagosRealizados;
import Vista.VentanaPrincipalGarita;

public class Sistema_Garita {
    public static void main(String[] args) {
        Sistema_Garita sistema_Garita = new Sistema_Garita();

        VentanaPrincipalGarita ventanaPrincipalGarita = new VentanaPrincipalGarita();
        VentanaEspaciosOcupados ventanaEspaciosOcupados = new VentanaEspaciosOcupados();
        VentanaPagosRealizados ventanaPagosRealizados = new VentanaPagosRealizados();

        ControladorGarita controladorGarita = new ControladorGarita(sistema_Garita, ventanaEspaciosOcupados,
                ventanaPagosRealizados, ventanaPrincipalGarita);
        
        ventanaPrincipalGarita.controladorGarita = controladorGarita;
        ventanaEspaciosOcupados.controladorGarita = controladorGarita;
        ventanaPagosRealizados.controladorGarita = controladorGarita;

        ventanaPrincipalGarita.crearVista();
    }
    
}
