/**
 * 
 * Clase CicloWhile donde aprendimos el While
 * Practica 02
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

public class CicloWhile{
    /**
     * Metodo principal donde ejecutamos los ciclos while
     * para poder calcular los números primos
     *
     * @param args Los argumentos
     * */
    public static void main (String[] args) {

	// Imprimimos un pequeño titulo asignado por el creador
	System.out.println("***Números Primos***");
	// Imprimimos una breve explicación de lo que es el programa
	// para el usuario
	System.out.println("Este es un programa que indicara los números primos");
	// Imprimimos un breve enunciado donde indica que posterior
	// se dara el resultado de lo que hara el programa
	// Un número primo solo es divisible entre si mismo y entre uno mismo
	System.out.println("Por lo cual, los números primos que se encuentran  entre el intervalo de 0 a 1000 son: ");

	// Valores iniciales de i y j
	int i = 2;
	int j = 2;
	// Condición boolean verdadero o falso
	boolean esPrimo = true;


	/**
	 * En el Ciclo While, permite ejecutar un bloque de
	 * código siempre y cuando una condición sea verdadera
	 * */
	while(i <= 1000){ // Probamos que i sea menor o igual a 1000
	    // y lo guardamos en un arreglo
	     esPrimo = true; // esPrimo es verdadero    
	    j = 2;
	    while( j <= i/2){ // Mientras que j sea menor o igual a i entre 2  
		if(i % j == 0){ // Condición en donde si el resultado de i entre j ==0
		    esPrimo = false; // Entonces esPrimo es falso
		    break; // Se rompe el ciclo
		}
		j++; // Se le suma 1 a j
	    }
	    // Si es un número primo
	    if(esPrimo){
		// Imprimime i 
		System.out.println(" " + i + " es primo");
	       
	    }
	    i++; // Se le suma 1 a i
	}
    }
}


        
