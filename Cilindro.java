/** 
 * Clase Cilindro donde aprendimos a calcular 
 * el área y el volumen de un cilindro
 * Practica 00
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

public class Cilindro{
    /**
     * Método principal donde por ayudade variables 
     * sacaremos el área y el volumen de un cilindro 
     *
     * @param args Los argumentos
     * */
    public static void main (String[] args){

	// Variable del valor de la radio
	int radio = 10;
	// Variable del valor de la altura
	int altura = 20;
	// Variable con el valor de pi
	double pi = 3.1416;
	// Variable para obtener el área con su fórmula
	double area = 2*(pi*(radio*altura))+2 *(pi*(radio*radio));
	// Variable para obtener el volumen con su fórmula
	double volumen = (pi*(radio*radio))*altura;

	// Imprimimos un título proporcionado por el creador
	System.out.println("***Área y volumen de un cilindro***");
	// Imprimimos un enunciado breve donde ira el valor asignado a la variable radio
	System.out.println("Tiene un radio de: "+radio+" cm");
	// Imprimimos un enunciado breve donde ira el valor asignado a la variable altura
	System.out.println("Tiene una altura de: "+altura+" cm");
	// Imprimimos un enunciado breve donde ira el resultado de la variable área obtenido através de la fórmula
	System.out.println("El area del cilindro es: "+area+" cm^2");
	// Imprimimos un enunciado breve donde ira el resultado de la variable volumen obtenido através de la fórmula
	System.out.println("El volumen del cilindro es: "+volumen+" cm^3");
}
}



   
