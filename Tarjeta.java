package proyectoIngenieria;

public class Tarjeta {
	private int numeroTarjeta;
	private int ccv;
	private int fechaCaducidadAño;
	private int fechaCaducidadMes;

	public Tarjeta(int numeroTarjeta, int ccv, int fechaCaducidadAño, int fechaCaducidadMes) {
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

	public int getfechaCaducidadAño() {
		return fechaCaducidadAño;
	}

	public int getfechaCaducidadMes() {
		return fechaCaducidadMes;
	}
}
