/**
 * Clase que muestra los BYTES en los 
 * diferentes tipos de datos primitivos
 * Practica 00
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

public class Primitivo{
    /**
     * Método principal para obtener los tamaños 
     * de valores de los datos primitivos
     *
     * @param args Los argumentos
     * */
    public static void main (String[] args){

	//Imprimimos un pequeño título proporcionado por el creador
	System.out.println("***Tipo de primitivos***");	
	// Con ayuda del lenguaje de programación sabremos cuanto espacio ocupa cada dato primitivo
	// Imprimimos los valores primitivos y los tamaños de estos
	System.out.println("byte: "+Byte.BYTES+" bytes");
	System.out.println("short: "+Short.BYTES+" bytes");
	System.out.println("int: "+Integer.BYTES+" bytes");
	System.out.println("long: "+Long.BYTES+" bytes");
	System.out.println("float: "+Float.BYTES+" bytes");
	System.out.println("double: "+Double.BYTES+" bytes");
	System.out.println("boolean: 1 bytes");
	System.out.println("char: "+Character.BYTES+" bytes");
	}
 }
	
	    
