package Modelo;
public class Coche {
	protected String matricula;
	protected Plaza plaza;

	public Coche(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setPlaza(Plaza plaza) {
		this.plaza = plaza;
	}

	public Plaza getPlaza() {
		return this.plaza;
	}

}