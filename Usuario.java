package proyectoIngenieria;

import java.util.ArrayList;

public class Usuario {

	public String nombre;
	public Coche coche;
	public String matricula;
	public static ArrayList<Coche> ListaCoches;
	public static ArrayList<Tarjeta> ListaTarjetas;
	public int precio;

	public Usuario(String nombre) {

		this.nombre = nombre;
	}

	public short pago(Coche coche, Tarjeta tarjeta, int precio) {

		coste = coche.duracion * this.precio;
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