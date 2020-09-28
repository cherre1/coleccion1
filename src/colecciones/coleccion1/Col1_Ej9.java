// si la clase va a formar parte de un paquete, indicar la ruta canónica del mismo en formato de URI invertida
 package  colecciones.coleccion1;

// en caso de tener que importar otros paquetes java, descomentar la siguiente línea indicando la ruta al paquetes

 import   java.lang.Math;    //importamos en este caso el paquete donde se encuentra  la constante PI
 

 
 //comentario Javadoc de la clase
 
 /** Clase Col1_Ej9 cuya finalidad es calcular y mostrar en pantalla la superficie y volumen de un cilindro 
 *@author   Carlos Herrero
 *@version 1.0
 */


public class Col1_Ej9 {
	
	
	
	// en caso de que la clase deba tener parte ejecutable, descomentar el método main siguiente y desarrollarlo
	
	 public static void main ( String [] args) {

		
		  // variables que vamos a utilizar
		  double altura= 10.0;
		  double radio= 5.0;
		  double superficie, volumen;
		  
		  //calculamos sus valores
		  // Pi aparece como una constante  en el paquete Math, por lo que la llamamos como Math.PI
		  volumen= Math.PI* radio*radio*altura;
		  superficie= 2* Math.PI*radio*radio +  2*Math.PI*radio*altura;
		  
		  // salida de resultados:
		  System.out.println ("Las dimensiones del cilindro son las siguientes");
		  System. out.println(" *Radio : " + radio + "  centímetros");
		  System. out.println(" *Altura : " + altura + "  centímetros");
		  System.out.println ("Superficie total del cilindro:  "+ superficie+ "  centímetros cuadrados");
		  System.out.println ("Volumen total del cilindro:  "+ volumen+ "  centímetros cúbicos");
	  
	} // fin del método main
	
	
	
	
	
}  // fin de la clase principal





