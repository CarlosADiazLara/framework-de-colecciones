package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class App {
    public static void main(String[] args) {
    	
    	
    	// Una de las colecciones mas utilizadas es List, que permite elementos duplicados
    	// y esta coleccion al igual que todos los elementos de la biblioteca, es decir, 
        // de la API de Java, es GENERICA
    	// Los corchetes rectangulare se le denomina el diamante
    	// La Genericidad va de especificar el tipo de datos que almacenar cada elemento 
    	// de la coleccion y la ventaja que tiene es que los errores se pueden detectar
    	// en tiempo de compilacion en lugar de tener que esperar a la ejecucion del programa
    	
    	// Declaracion de una coleccion de numeros enteros
    	List<Integer> numerosEnteros;
    	
    	// Para poder agregar elementos a la coleccion hay que instanciarla, es decir,
    	// utilizar una de las clases que implementan los metodos de la coleccion
    	numerosEnteros = new ArrayList<>();
    	
    	// Agregar elementos a la coleccion de numerosEnteros
    	numerosEnteros.add(10);
    	numerosEnteros.add(20);
    	
    	// Declarar una coleccion de nombres
    	List<String> nombres = new ArrayList<>();
    	
    	nombres.add("Carlos");
    	nombres.add("Mauricio");
    	
    	/* Las colecciones anteriores permiten agregar a la coleccion cualquier cantidad de elementos.
    	 * 
    	 * Si queremos crear una coleccion que sea de tamaño fijo, lo podemos hacer a partir de un array*/
    	
    	String[] arrayNombres = {
    			"Ramon", "Belepo", "Edwin", "Tahiel", "Ramon", "Belepo", "Edwin"
    	};
    	    	
    	// Crear a partir del array anterior una coleccion que no permita elementos duplicados
    	
    	// VARIANTE #1 segun le ha sugerido la IA a Mauricio
    	Set<String> nombresSinDuplicados1 = new HashSet<String>();
    	
    	for (String nombre : arrayNombres) {
    		nombresSinDuplicados1.add(nombre);
    	}
    	
    	System.out.println("Nombres No Repetidos, segun la variante #1");  	
    	System.out.println(nombresSinDuplicados1); 
    	
    	// VARIANTE #2
    	List<String> nombresConDuplicados = Arrays.asList(arrayNombres);
    	
    	Set<String> nombresSinDuplicados2 = new HashSet<String>();
    	
    	nombresSinDuplicados2.addAll(nombresConDuplicados);
    	
    	System.out.println("Nombres No Repetidos, segun la variante #2");  	
    	System.out.println(nombresSinDuplicados2);
    	
    	// Desde la terminal:
    	// git status --> indica si queda algo por hacer commit
    	// git add . --> agregalo todo a la zona
    	// git status --> de nuevo para comprobar
    	// git log --> Aparecen los repositorios
    	// git commit -m "antes de crear rama creando colecciones"
    	
    
    }
}
