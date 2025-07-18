package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		// Crear una coleccion de Persona, es decir, una coleccion, una List en este
		// caso,
		// donde cada elemento de la coleccion sea de tipo Persona

		List<Persona> personas = new ArrayList<>();

		// Agregar personas a la coleccion

		Persona persona1, persona2, persona3;

		// Instanciar los objetos Persona

		persona1 = Persona.builder().nombre("Belepo").primerApellido("Boriba").segundoApellido("Bokesa")
				.fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 1)).genero(Genero.HOMBRE).build();

		persona2 = Persona.builder().nombre("Carlos").build();

		personas.add(persona1);
		personas.add(persona2);

		/*
		 * GENERICIDAD
		 */

		// Perfectamente podriamos crear una coleccion que admita cualquier tipo de
		// elemento,
		// que seria utilizando el comodin o wildcard (?)

		// La siguiente lista, o coleccion, admitira todo tipo de elemento
		List<?> lista;

		// Pero la lista anterior seria dificil de manejar y recorrer en la practica,
		// por lo que se acostumbra a poner limites, acotar, la genericidad, es decir,
		// lo correcto es crear una coleccion de elementos que tengan relacion entre
		// ellos
		// que este acotada por encima o por debajo

		// Ejemplo:
		// Para tener una coleccion que permita elementos de tipo persona y todos los
		// subtipos
		// o subclases de Persona
		List<? super Persona> listaOK;

		// La declaracion siguiente tiende a hacer los primero que se nos pasa por la
		// cabeza
		// a la hora de crear una coleccion que admita elementos de distintos tipos, es
		// decir,
		// elementos que hereden de persona, porque no admite elementos
		// Esta declaracion la podemos encontrar como parametro de metodos genericos
		// pero no sirve para agregar elementos, porque genera una coleccion inmutable
		List<? extends Persona> listNO_OK;
		
		/* Vamos a crear uan coleccion que permite elemento de tipo Persona y subtipos de Persona 
		 * */
		
		List<? super Persona> personasEmpleadosEstudiantes;
		
		personasEmpleadosEstudiantes = new ArrayList<>();
		
		Empleado empleado = Empleado.builder()
				.nombre("Gilberto Junior")
				.primerApellido("Vega")
				.dpto(Dpto.INFORMATICA)
				.build();
		
		Estudiante estudiante = Estudiante.builder()
				.nombre("Mauricio")
				.totalAsignaturas(8)
				.build();
		
		personasEmpleadosEstudiantes.add(persona1);
		personasEmpleadosEstudiantes.add(empleado);
		personasEmpleadosEstudiantes.add(estudiante);
	}
}

//Ctrl + Shift + O para limpiar (imports no utilizados)

//Commit y ramas desde la terminal:
//git status --> indica si queda algo por hacer commit
//git add . --> agregalo todo a la zona
//git status --> de nuevo para comprobar
//git log --> Aparecen los repositorios
//git commit -m "antes de crear rama creando colecciones" --> crea el commit
//git branch creando_colecciones --> crea la rama
//git switch creando_colecciones --> Cambia a esa rama, puedes usar tabulador para autocompletar