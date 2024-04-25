package Control;
import Vista.VentanaParking;
import Vista.VentanaQR;
import Vista.VentanaRegistroCoche;
import Vista.VentanaRegistroTarj;

public class Sistema_Conductor {
    public static void main(String[] args) {

        Sistema_Conductor sistema = new Sistema_Conductor();

        VentanaQR mainView = new VentanaQR();
        VentanaParking ventanaParking = new VentanaParking();
        VentanaRegistroCoche ventanaRegistroCoche = new VentanaRegistroCoche();
        VentanaRegistroTarj ventanaRegistroTarj = new VentanaRegistroTarj();

        Controlador mc = new Controlador(sistema, mainView, ventanaParking, ventanaRegistroCoche, ventanaRegistroTarj);
        Controlador_parking contr_parking = new Controlador_parking(sistema, ventanaParking);
        Controlador_RegCoche contr_coche = new Controlador_RegCoche(sistema, ventanaRegistroCoche);
        Controlador_RegTarj contr_tarj = new Controlador_RegTarj(sistema, ventanaRegistroTarj);

        mainView.controlador = mc;
        ventanaParking.controlador = contr_parking;
        ventanaRegistroCoche.controlador = contr_coche;
        ventanaRegistroTarj.controlador = contr_tarj;
        
        mainView.crearVista();

    }
}
