// si la clase va a formar parte de un paquete, indicar la ruta canónica del mismo en formato de URI invertida
 package  colecciones.coleccion1;

// en caso de tener que importar otros paquetes java, descomentar la siguiente línea indicando la ruta al paquetes

 //import  ...
 

 
 //comentario Javadoc de la clase
 
 /** Clase Col1_Ej8 cuya finalidad es calcular y mostrar en pantalla el área y superficie de un rectángulo
 *@author   Carlos Herrero
 *@version 1.0
 */


public class Col1_Ej8 {
	
	
	
	// en caso de que la clase deba tener parte ejecutable, descomentar el método main siguiente y desarrollarlo
	
	 public static void main ( String [] args) {

		
		  // variables que vamos a utilizar
		  double altura= 4.0;
		  double anchura= 15.0;
		  double superficie, perimetro;
		  
		  //calculamos sus valores
		  // Pi aparece como una constante  en el paquete Math, por lo que la llamamos como Math.PI
		  perimetro=  2* ( anchura + altura);
		  superficie= anchura * altura;
		  
		  // salida de resultados:
		  System.out.println ("Las dimensiones del rectángulo son las siguientes");
		  System. out.println (" *Altura : " + altura + "  centímetros");
		  System. out.println (" *Anchura : " + anchura + "  centímetros");
		  System.out.println ("Perímetro :  "+ perimetro+ "  centímetros ");
		  System.out.println ("Superficie:  "+ superficie+ "  centímetros cuadrados");
	  
	} // fin del método main
	
	
	
	
	
}  // fin de la clase principal





