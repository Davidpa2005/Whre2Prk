package model;

public class Plaza{
	public Coche cocheAsignado;
	public String id;
	
	
	public Plaza( int id) {
		super();
	
		this.id = id;
	}
	public void asignarCoche(Coche coche) {
		this.cocheAsignado=coche;
		
	}
	public void eliminarCoche(Coche coche){
		this.cocheAsignado=null;
		
	}
	
	
	

}
