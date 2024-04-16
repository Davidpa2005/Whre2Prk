package model;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Plaza {
	public Coche cocheAsignado;
	public String id;
	private LocalDate horaEntrada;
	private LocalDate horaSalida;

	public Plaza(String id) {
		super();

		this.id = id;
	}

	public void asignarCoche(Coche coche) {
		this.cocheAsignado = coche;
		this.horaEntrada = LocalDate.now();

	}

	public long eliminarCoche(Coche coche){
		
		this.cocheAsignado=null;
		this.horaSalida=LocalDate.now();
		return ChronoUnit.HOURS.between(horaEntrada, horaSalida);
		
		
	}

//	public long calcularDuracionEstacionamientoEnHoras() {
	// if (horaEntrada == null || horaSalida == null) {
	// throw new IllegalStateException("No se han establecido las marcas de tiempo
	// de entrada y salida");
	// }

	// return ChronoUnit.HOURS.between(horaEntrada, horaSalida);
	   //  }

}
