package com.example;

import java.util.ArrayList;
import java.util.List;

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
    	
    	
    }
}
