package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class App {
	public static void main(String[] args) {

		// Crear una coleccion de Persona, es decir, una coleccion, una List en este caso,
		// donde cada elemento de la coleccion sea de tipo Persona
		
		List<Persona> personas = new ArrayList<>();
		
		// Agregar personas a la coleccion
		
		Persona persona1, persona2, persona3;
		
		// Instanciar los objetos Persona
		
		persona1 = Persona.builder()
				.nombre("Belepo")
				.primerApellido("Boriba")
				.segundoApellido("Bokesa")
				.fechaNacimiento(LocalDate.of(2000, Month.JANUARY, 1))
				.genero(Genero.HOMBRE)
				.build();
		
		persona2 = Persona.builder()
				.nombre("Carlos")
				.build();

		personas.add(persona1);
		personas.add(persona2);
		
		
		
		
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