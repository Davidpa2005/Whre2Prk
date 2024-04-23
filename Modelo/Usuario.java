package Modelo;
import java.util.ArrayList;

public class Usuario {

	public String nombre;
	public Coche coche;
	public String matricula;
	public static ArrayList<Coche> ListaCoches;
	public static ArrayList<Tarjeta> ListaTarjetas;
	

	public Usuario(String nombre) {

		this.nombre = nombre;
	}

	public long pago(Coche coche, Tarjeta tarjeta) {
		float precio = (float) 0.15;
		long coste = (long) (coche.plaza.duracion * precio);
		return coste;
	}

	public static void registrarCoche(String matricula) {
		Coche nuevoCoche = new Coche(matricula);
		ListaCoches.add(nuevoCoche);
	}

	public Tarjeta tarjeta;
	public int cvv;
	public int numero;
	public int fecha;

	public static void registrarTarjeta(int cvv, int numero, int fecha) {

		Tarjeta nuevaTarjeta = new Tarjeta(cvv, numero, fecha, fecha);

		ListaTarjetas.add(nuevaTarjeta);

	}
}
