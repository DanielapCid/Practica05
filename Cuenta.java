/** 
 * Clase Cuenta donde representa una cuenta de "banco"  
 * Practica 04
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */

public class Cuenta{
    //Atributos
    private String titular; // Persona dueña de la cuenta
    private double dineroDisponible; // El dinero que tiene la persona

    /** 
     * Método constructor 
     * Reciben dos valores reales y los representa como 
     * el nombre de un títular y cuanto dinero tiene disponible
     *
     * @param titular El parámetro que representa al títular
     * @param dineroDisponible El parámetro que representa el dinero
     * disponible con el que cuenta el títular de la cuenta
     * */
    // Método constructor sin argumentos 
    public Cuenta(String titular, double dineroDisponible){
	this.titular = titular;
	this.dineroDisponible = dineroDisponible;
    }

    // Método constructor con argumentos
    public Cuenta(){
	this.titular = "";
	this.dineroDisponible = 0;
    }

    //Métodos set y get

    /** 
     * Método que devuelve el títular 
     *
     * @return titular El títular de la cuenta
     * */ 
    public String getTitular(){
	return this.titular;
    }

    /**
     * Método que cambia el valor del títular
     *
     * @param titular El nuevo valor del titular
     * */
    public void setTitular(String titular){
	this.titular = titular;
    }

    /**
     * Método que devuelve el dinerod isponible
     *
     * @return dineroDisponible El dinero disponible en la cuenta
     * */
    public double getDineroDisponible(){
	return this.dineroDisponible;
    }

    /**
     * Método que cambia el valor del 
     * dinero disponible en la cuenta
     *
     * @param dineroDisponible El nuevo valor del dinero disponible 
     * */
    public void setDineroDisponible(double dineroDisponible){
	this.dineroDisponible = dineroDisponible;
    }

    /**
     * Método que hace conexión con el main para imprimir datos
     *
     * @return toString
     * */ 
    public String toString(){
	return "Hola " + this.titular + ", su dinero disponible es de:$  " + this.dineroDisponible + " \nFue un placer atenderlo";
    }
}
