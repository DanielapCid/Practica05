/** 
 * MainRect de la Clase Rectangulo para obtener el área 
 * y el perimetro de un rectangulo
 * Practica 04
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

import java.util.Scanner;

public class MainRect{
    public static void main(String[] args){

	// Instancia del objeto
	/**
	 * Creación de un objeto rectangulo1
	 * Creación de un objeto rectangulo2
	 * */
	Rectangulo rectangulo1 = new Rectangulo();
	Rectangulo rectangulo2 = new Rectangulo();

	// Imprimimos un título proporcionado por el creador
	System.out.println("\n***Calcular el área y perimetro de un rectangulo***");

	// Imprimimos un breve enunciado indicando que estarán a continuación los datos del rectangulo
	System.out.println("\n*Datos del Rectangulo*");

	// Uso del método set para otorgar un nuevo valor a la base
	rectangulo1.setBase(12.3);
	// Uso del método get para devolver la base del rectangulo
	// Imprimimos un breve enunciado donde ira el valor de la base
	System.out.println("La base del rectangulo es: " +rectangulo1.getBase());
	// Uso del método set para cambiar el valor de la altura
	rectangulo1.setAltura(5);
	// Uso del método get para devolver la altura del rectangulo
	// Imprimimos un breve enunciado donde ira el valor de la altura
	System.out.println("La altura del rectangulo es: " +rectangulo1.getAltura());
	// Imprimimos un breve enunciado indicando que el resultado para el área y el perimetro estaran a continuación
	System.out.println("\n*Resultados*");
	// Uso del método get en el objeto rectangulo1 e imprimimos el resultado obtenido de la fórmula para obtener el  perimetro del rectangulo
	System.out.println("El perimetro del rectangulo es: "+rectangulo1.getPerimetro());
	// Uso del método get en el objeto rectangulo1 e imprimimos el resultado obtenido de la fórmula para obtener el área del rectangulo
	System.out.println("El área del rectangulo es: "+rectangulo1.getArea());

	// Imprimimos el método toString
	// Se imprimira un mensaje para el usuario con un saludo, los resultados del área y del perimetro del rectangulo, y los valores otorgados para la obtención del área y perimetro, y una despedida
	System.out.println(rectangulo1.toString());

	

	System.out.println("\n------------------------------------------------------------------------------------------------------------------------------------");

	//Utilizamos un Scanner para obtener datos del usuario
	Scanner sc = new Scanner(System.in);
	double base,altura;
	double perimetro,area;

	// Imprimimos indicaciones para el usuario
	System.out.println("\n*Ingrese los valores del que desee saber su área y perimetro del rectangulo*");

	// Imprimimos un breve enunciado indicando que estarán a continuación los datos del rectangulo
	System.out.println("\n*Datos del Rectangulo*");
	// Imprimimos un breve enunciado en donde el usuario proporcionara los datos 
	System.out.println("Introduzca el valor de la base: ");
	base = sc.nextDouble();
	// Uso del método set para cambiar el valor de la base en el objeto rectangulo2
	rectangulo2.setBase( +base);
	// Imprimimos un breve enunciado en donde el usuario proporcionara los datos 
	System.out.println("Introduzca el valor de la altura: ");
	altura = sc.nextDouble();
	// Uso del método set para cambiar el valor de la altura en el objeto rectangulo2
	rectangulo2.setAltura( +altura);

	// Imprimimos un breve enunciado indicando que el resultado para el área y el perimetro estaran a continuación
	System.out.println("\n*Resultados*");
	// Uso del método get en el objeto rectangulo2 e imprimimos el resultado obtenido de la fórmula para obtener el  perimetro del rectangulo
	System.out.println("El perimetro del rectangulo es: "+rectangulo2.getPerimetro());
	// Uso del método get en el objeto rectangulo2 e imprimimos el resultado obtenido de la fórmula para obtener el área del rectangulo
	System.out.println("El área del rectangulo es: "+rectangulo2.getArea());

	// Imprimimos el método toString
	// Se imprimira un mensaje para el usuario con un saludo, los resultados del área y del perimetro del rectangulo, y los valores otorgados para la obtención del área y perimetro, y una despedida
	System.out.println(rectangulo2.toString());

	
    }
}
	
 
