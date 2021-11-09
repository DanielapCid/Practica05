/** 
 * Clase Condicionales donde aprendimos a usar
 * condicionales como if o else
 * Practica 01
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

import java.util.Scanner;

public class Condicionales{
    /**
     * Método principal donde ejecutamos los condicionales 
     * para saber que número es mayor o que número es menor 
     *
     * @param args Los argumentos 
     * */
    public static void main(String[] args){

	// Imprimimos un pequeño título asignado por el creador
	System.out.println("***Condicionales***");
	// Utilizamos el Scanner para obtener datos proporcionados por el usuario
	Scanner in = new Scanner(System.in);
	
	System.out.println("Dame el número 1: "); // Imprimimos un enunciado corto donde se proporcionara el primer dato
	int n1 = in.nextInt();
	System.out.println("Dame el número 2: "); // Imprimimos un enunciado corto donde se proporcionara el segundo dato
	int n2 = in.nextInt();

	// Aplicamos los condicionales 
	if(n1>n2){ // Si n1 es mayor a n2, entonces el valor mayor es n1
	    System.out.println("El número con mayor valor es: " + n1); // Imprimimos n1 
	} else { // En caso contrario el valor mayor sería n2 
	    System.out.println("El número con mayor valor es: " + n2); // Imprimimos n2
	}
    }
}
