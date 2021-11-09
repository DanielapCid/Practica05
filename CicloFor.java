/** 
 * 
 * Clase CicloFor donde aprendimos el For
 * Practica 01
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

public class CicloFor {
    /**
     * Método principal donde ejecutamos el ciclo for
     * para poder calcular los números primos
     * 
     * @param args Los argumentos
     * */
    public static void main(String[] args) {
	
	// Imprimimos un pequeño titulo asignado por el creador
	System.out.println("***Números Primos***");
	// Imprimimos una breve explicación de lo que es el programa
	// para el usuario 
	System.out.println("Este es un programa que indicara los números primos que se encuentran entre 0 y 1000");
	// Imprimimos un breve enunciado donde indica que posterior
	// se dara el resultado de lo que hara el programa
	// Un número primo solo es divisible entre si mismo y entre uno mismo
	System.out.println("Por lo cual, los números primos que se encuentran en dicho intervalo son: ");
	
	// Condición boolean que se ejecutara de acuerdo al bloque de instrucciones
	boolean esPrimo = true; 
	for(int i = 2; i < 1000; i++){ // "i" inicia en 2, y la condición es que i sea menor o igual a 1000, su actualización es i = i + 1 
	    esPrimo = true; //La condición sera verdadera y se ejecutara si está se cumple
	    
	    for(int j = 2; j < i/2; j++){ // "i" inicia en 2, y la condición es que j sea menor o igual a i/2, su actualización es j = j + 1 
		if(i % j == 0){ // Si al ejecutar la operación y el residuo es cero 
		    esPrimo = false; //Entonces es falso que sea un número primo (ejemplo. 4/2 = 2, su residuo es cero, es falso)
		}
	    }
	    // Si el residuo no es cero, entonces es verdadero que sea un número primo (ejemplo. 7/3 = 2.3, el residuo no es cero)
	    if(esPrimo){
		// Imprimimos los valores de i que son primos del 0 al 1000
		System.out.println(" " + i + " es primo");
	    }
	}
    }
}
