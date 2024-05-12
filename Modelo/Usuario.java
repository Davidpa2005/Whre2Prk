package Modelo;

public class Usuario {

	public String nombre;
	public Tarjeta tarjeta;
	public Coche coche;
	public String matricula;
	public Coche[] listaCoches ;
	public Tarjeta[] listaTarjetas;
	private int i = 0;
	private int j = 0;
	

	public Usuario(String nombre) {

		this.nombre = nombre;
	}

	public long pago(Coche coche, Tarjeta tarjeta) {
		float precio = (float) 0.15;
		long coste = (long) (coche.plaza.duracion * precio);
		return coste;
	}

	public void registrarCoche(String matricula) {
		Coche nuevoCoche = new Coche(matricula);
		listaCoches[i] = nuevoCoche;
		i++;
	}

	public int cvv;
	public int numero;
	public int fecha;

	public void registrarTarjeta(int cvv, int numero, int añoCaducidad, int mesCaducidad) {

		Tarjeta nuevaTarjeta = new Tarjeta(cvv, numero, añoCaducidad, mesCaducidad);
		listaTarjetas[j] = nuevaTarjeta;
		j++;
	}
}
