package proyectoIngenieria;

import java.util.ArrayList;

public class Usuario {

	public String nombre;

	public Usuario(String nombre) {

		this.nombre = nombre;
	}

	public static ArrayList<Coche> ListaCoches;
	public static ArrayList<Tarjeta> ListaTarjetas;
	public int precio;

	public void PAGO(ArrayList ListaCoches, ArrayList ListaTarjetas, int precio) {

		this.ListaCoches = ListaCoches;
		this.ListaTarjetas = ListaTarjetas;
		this.precio = precio;

	}

	public Coche coche;
	public String matricula;

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
