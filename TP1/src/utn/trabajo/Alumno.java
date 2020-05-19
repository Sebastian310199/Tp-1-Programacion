package utn.trabajo;



public class Alumno extends Persona {

	private long nrolegajo;
	private double promedio;
	
	public long getNrolegajo() {
		return nrolegajo;
	}
	public void setNrolegajo(long nrolegajo) {
		this.nrolegajo = nrolegajo;
	}
	public double getPromedio() {
		return promedio;
	}
	
	public void setPromedio(double promedio) {
		this.promedio = promedio;
	}
	public Alumno() {}
	
	public Alumno( String apellido, String nombre, String sexo,Integer edad, Integer dni,Integer id,long nrolegajo,double promedio) {

		this.nrolegajo = nrolegajo;
		this.promedio = promedio;
	}
	
	
	
	
	
}



