package Control;
import Vista.VentanaParking;
import Vista.VentanaQR;

public class Sistema_Conductor {
    public static void main(String[] args) {

        VentanaQR mainFrame = new VentanaQR();
        VentanaParking ventanaParking = new VentanaParking();
        Controlador mc = new Controlador(mainFrame, ventanaParking);
        mainFrame.controlador = mc;
        mainFrame.crearVista();

    }
}
