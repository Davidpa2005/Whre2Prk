package Modelo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Plaza {
    protected Coche cocheAsignado;
    public String id;
    private LocalDate horaEntrada;
    private LocalDate horaSalida;
    protected long duracion;

    public Plaza(String id) {
        super();
        this.id = id;
    }

    public void asignarCoche(Coche coche) {
        this.cocheAsignado = coche;
        this.horaEntrada = LocalDate.now();

    }

    public long eliminarCoche() {
		this.cocheAsignado=null;
		this.horaSalida=LocalDate.now();
		this.duracion = ChronoUnit.HOURS.between(horaEntrada, horaSalida);
		return duracion;
	}
}
