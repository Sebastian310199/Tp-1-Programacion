package utn.trabajo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public Main() {
		
	}

	public static void main(String[] args) {
	
		List<Alumno> listaalumnos = new ArrayList<Alumno>();
		List<Profesor>listaprofesores = new ArrayList<Profesor>();
		listaalumnos.add(new Alumno("Alvarez","Edgardo","masculino",25,37878451,105,15474,8.4));
		listaalumnos.add(new Alumno("Martinez","Martin","masculino",25,37878451,105,15474,7.4));
		listaalumnos.add(new Alumno("Alvarez","Carl","masculino",25,37878451,105,15474,4.4));
		listaalumnos.add(new Alumno("Alvarez","Ciro","masculino",25,37878451,105,15474,6.2));
		listaalumnos.add(new Alumno("Alvarez","Alejandro","masculino",25,37878451,105,15474,8.4));
		listaalumnos.add(new Alumno("Alvarez","eso","masculino",25,37878451,105,15474,9.2));
		listaprofesores.add(new Profesor("Sosa","Mariano","masculino",45,2587478,1478,14,"Ing Sistemas"));
		listaprofesores.add(new Profesor("as","sss","aaaa",41,158974,1479,20,"Ing"));
		Collections.sort(listaalumnos);
		Collections.sort(listaprofesores);
		MayorPromedio(listaalumnos);
		for(Alumno a :listaalumnos)
			System.out.print(a.getApellido() + ":" + a.getNombre()+ ":" + a.getPromedio());
	}

	private static void MayorPromedio(List<Alumno> listaalumnos) {
		double aux;
		for (int i = 0; i < listaalumnos.size(); i++) {
			for (int j = 0; j <listaalumnos.size()-1; j++) {
				if(listaalumnos.get(i).getPromedio()>listaalumnos.get(j).getPromedio() && listaalumnos.get(i).getPromedio() >= 7)
				{
					double menor;
					aux = listaalumnos.get(i).getPromedio();
					//listaalumnos.get(i).getPromedio() = listaalumnos.get(j)
					menor = aux;
				}
			}
		}
		
	}

}
