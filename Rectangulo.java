/** 
 * Clase Rectangulo donde se obtendra el área y 
 * perimetro de un rectangulo  
 * Practica 04
 *
 * @author Pereyra Cid Daniela Naomi
 * @version 1.0
 * */
public class Rectangulo{
    //Atributos
    private double base; // La base del rectangulo
    private double altura; // La altura del rectangulo
    
    /**
     * Método constructor 
     * Reciben dos valores reales y los representa como 
     * la base y la altura del rectangulo
     *
     * @param base El parámetro que representa la base
     * @param altura El parámetro que representa la altura
     * */
    // Método constructor sin argumentos
     public Rectangulo(double base, double altura){
	this.base = base;
	this.altura = altura; 
    }
    
    // Método constructor con argumentos
    public Rectangulo(){
	this.base = 1;
	this.altura = 1;
    }

    // Métodos set y get

    /**
     * Método que devuelve la base del rectangulo 
     *
     * @return base La base del rectangulo
     * */
    public double getBase(){
	return this.base;
    }

    /**
     * Método que devuelve la altura del rectangulo
     *
     * @return altura La altura del rectangulo
     * */
    public double getAltura(){
	return this.altura;
    }

    /**
     * Método que cambia el valor la base del rectangulo
     *
     * @param base El nuevo valor de la base del rectangulo
     * */
    public void setBase(double base){
	if (base > 0.0 && altura < 100.0){ // Solo si el valor de la base es mayor a cero y el valor de la altura en menor a 100 
	    this.base = base;
	}
    }

    /** 
     * Método que cambia el valor de altura del rectangulo 
     *
     * @param altura El nuevo valor de la altura del rectangulo
     * */ 
    public void setAltura(double altura){
        if (altura > 0.0 && base <100.0){ // Si el valor de la altura es mayor a cero y el valor de la base menor a 100
	    this.altura = altura;
	} else { // Por lo contrario se imprimira un mensaje indicando el rango en los que pueden ser los valores
	    System.out.println("La altura debe de ser > 0 < 100.0");
	}
    }

    /**
     * Método que hace conexión con el main para imprimir datos 
     *
     * @return toString  
     * */
    public String toString(){
	return "\nHola, ese fue el resultado del área y del perimetro que se obtuvo de acuerdo a los valores proporcionados{" + "base=" + this.base + "cm, altura=" + this.altura + "cm} \nFue un placer ayudarle";
    }

    // Método para obtener el perimetro
    /**
     * Método que devuelve el perimetro del rectangulo
     * Variable perimetro
     * Fórmula para obtener el perimetro de un rectangulo
     *
     * @return perimetro El perimetro del rectangulo
     * */
    public double getPerimetro(){
	double perimetro;
	perimetro = 2 * (base+altura);
	return perimetro;
    }

     //Método para obtener el área
    /**
     * Método que devuelve el área del rectangulo
     * variable área
     * Fórmula para obtener el área del rectangulo
     *
     * @return area El área del rectangulo
     * */
    public double getArea(){
	double area;
	area = base * altura;
	return area;
    }
  
}
