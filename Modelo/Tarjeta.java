package Modelo;

public class Tarjeta {
	protected int numeroTarjeta;
	private int ccv;
	private int fechaCaducidadAño;
	private int fechaCaducidadMes;

	public Tarjeta(int ccv, int numeroTarjeta,  int fechaCaducidadAño, int fechaCaducidadMes) {
		this.numeroTarjeta = numeroTarjeta;
		this.ccv = ccv;
		this.fechaCaducidadAño = fechaCaducidadAño;
		this.fechaCaducidadMes = fechaCaducidadMes;
	}

	public int getnumeroTarjeta() {
		return numeroTarjeta;
	}

	public int getccv() {
		return ccv;
	}

	public int[] getfechaCaducidad() {
		int[] fechaCaducidad = {fechaCaducidadAño, fechaCaducidadMes};
		return fechaCaducidad;
	}
}
