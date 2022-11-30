package cursoJavaAvanzado.expresioneslambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class EjemploComparator {
	
	public static void main(String[] args) {
		
		Persona persona= new Persona("javier", "huaman");
		Persona persona1= new Persona("lucas", "chavez");
		Persona persona3= new Persona("lis", "uscamayta");
		Persona persona4= new Persona("carlos", "quispe");
		
		List<Persona> lista= Arrays.asList(persona,persona1,persona3,persona4);
		lista.sort((p1,p2)->p1.getNombre().compareTo(p2.getNombre()));
		lista.forEach(System.out::println);
		
		System.out.println("OTRA FORMA");
		lista.sort(Comparator.comparing(Persona::getApellido));
		lista.forEach(System.out::println);
	
	}
	

}
