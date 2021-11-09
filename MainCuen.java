/** 
 * MainCuen de la clase Cuenta
 * que representan una cuenta de "banco"
 * Practica 04
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

import java.util.Scanner;

public class MainCuen{
    public static void main(String[] arg){
	
	// Instancia del objeto
	/**
	 * Creación de un objeto cuenta1
	 * Creación de un objeto cuenta2
	 * */
	Cuenta cuenta1 = new Cuenta();
	Cuenta cuenta2 = new Cuenta();

	//Imprimimos una breve bienvenida para el usuario
	System.out.println("\n***Bienvenido a su cuenta***");
	// Uso del método set para otorgar un nuevo valor al titular
	cuenta1.setTitular("C.Favio");
	// Uso del método get para devolver el titular de la cuenta
	// Imprimimos un breve enunciado donde ira el valor del titular
	System.out.println("\nUsuario de la cuenta: " +cuenta1.getTitular());
	// Uso del método set para otorgar un nuevo valor al dineroDisponible
	cuenta1.setDineroDisponible(45);
	// Uso del método get para devolver el dinero disponible en la cuenta
	// Imprimimos un breve enunciado donde ira el valor del dinero disponible
	System.out.println("Dinero Disponible:$ " +cuenta1.getDineroDisponible());

	// Imprimimos el método toString con el objeto cuenta1
	// Se imprimira un mensaje para el usuario con un saludo, el nombre del titular, su dinero disponible y una despedida
	System.out.println(cuenta1.toString());

	System.out.println("\n--------------------------------------------------");

	// Utilizamos un Scanner para obtener datos proporcionados por el usuario
	Scanner sc = new Scanner(System.in);
	String titular;

	// Imprimimos una breve bienvenida para el usuario
	System.out.println("\n***Bienvenido a su cuenta***");
	// Imprimimos indicaciones para el usuario donde también iran sus datos proporcionados
	System.out.println("\n*Por favor ingrese los datos solicitados*");
	System.out.println("\nIntroduzca su nombre de usuario: ");
	titular = sc.nextLine();

	// Uso del método set en el objeto cuenta2 para cambiar el valor del titular
	cuenta2.setTitular("" + titular);
	// Imprimimos un breve enunciado con el nombre del titular proporcionado
	System.out.println("Nombre de usuario: C."+titular);
	// Uso del método get en el objeto cuenta2 e impirmimos un breve enunciado con el valor del dineroDisponible 
	System.out.println("El dinero disponible en su cuenta es de:$  "+cuenta2.getDineroDisponible());

	// Imprimimos el método toString en el objeto cuenta2
	// Se imprimira un mensaje para el usuario con un saludo, el nombre del titular, su dinero disponible y una despedida
	System.out.println(cuenta2.toString());

	
    }
}



	
