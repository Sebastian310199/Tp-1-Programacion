package utn.trabajo;

import java.util.Comparator;

public abstract class Persona implements Comparator<Persona>,Comparable<Persona> {

	protected Integer edad;
	protected Integer dni;
	protected String apellido,nombre,sexo;
	protected Integer id;
	
	
	
	public int  getEdad()
	{
		return edad;
	}
	

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Persona() {
		
	}
	
	public Persona( String apellido, String nombre, String sexo,Integer edad, Integer dni, Integer id) {
	
		this.edad = edad;
		this.dni = dni;
		this.apellido = apellido;
		this.nombre = nombre;
		this.sexo = sexo;
		this.id = id;
	}

	public int compare(Persona a, Persona b) {
		
		return this.apellido.compareTo(b.apellido);
	}

	
	@Override
	public String toString() {
		return " [dni=" + dni + ", apellido=" + apellido + ", nombre=" + nombre + "]";
	}

	public int compareTo(Persona o) {
		
		return this.nombre.compareTo(o.nombre);
	}


	


	
}
