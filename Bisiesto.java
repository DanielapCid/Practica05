/**
 * 
 * Clase Bisiesto en donde se calcula si un año
 * es bisiesto o no
 * Practica 01
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

import java.util.Scanner;

public class Bisiesto{
    /**
     * Método principal donde ejecutamos un condicional if
     * para calcular si un año es bisiesto
     *
     * @param args Los argumentos 
     * */
    public static void main(String[] args){

	//Imprimimos un pequeño titulo asignado por el creador 
	System.out.println("***Bisiesto***");
	// Utilizamos un Scanner para obtener los datos que nos entregue el usuario
	Scanner in = new Scanner(System.in);

	// Imprimimos unas breves indicaciones para el usuario
	System.out.println("Ingresa el año del que deseas saber si es bisiesto o no: ");
	int anio = in.nextInt();

	// Es un año bisiesto
	if(anio % 4 == 0){ // Si el resultado del residuo de dividir anio entre 4 es igual a cero 
	    if(anio % 100 == 0){ // Si el resultado del residuo de dividir anio entre 100 es igual a cero
		if(anio % 400 == 0){ // Si el resultado del residuo de dividir anio entre 400 es igual a cero 
		    System.out.println("El año "+anio+" es un año bisiesto"); // Imprimimos anio
		}
		else { // En caso contrario entonces no es un año bisiesto 
		    System.out.println("El año "+anio+" no es un año bisiesto");
		}
	    } else {// En caso contrario entonces no es un año bisiesto
		System.out.println("El año "+anio+" es un año bisiesto");
	    }
	} else {// En caso contrario entonces no es un año bisiesto
	    System.out.println("El año "+anio+" no es un año bisiesto");
	}
    }
 }
	     
        
		    
		    
        
        


	    
