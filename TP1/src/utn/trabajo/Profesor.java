package utn.trabajo;



public class Profesor extends Persona {

	Integer legajo = null;
	String titulo;

	public Integer getLegajo() {
		return legajo;
	}
	public void setLegajo(Integer legajo) {
		this.legajo = legajo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public Profesor(String apellido, String nombre, String sexo, Integer edad, Integer dni, Integer id,Integer legajo,String titulo) {
	
		this.legajo=legajo;
		this.titulo= titulo;
	}
	
	public int compare(Profesor a ,Profesor b)
	{
		return super.edad.compareTo(b.edad);
	}
	
	
	
}
