package colecciones.coleccion1;


// en caso de tener que importar otros paquetes java, descomentar la siguiente línea indicando la ruta al paquetes

 import   java.util.Scanner;
 

 
 //comentario Javadoc de la clase
 
 /** Clase Hoja1_Ejercicio16 cuya finalidad es calcular a qué precio deben venderse un artículo para obtener 
 * un margen de beneficio determinado, teniendo en cuenta el tipo de IVA que aplica
 *@author   Carlos Herrero
 *@version 1.0
 */


public class Col1_Ej16 {
	
	
	 public static void main ( String [] args) {
		
	
	  // variables que vamos a utilizar
	  double precioInicial;
	  double beneficio;
	  double iva;

	  double precioFinal;

	  //abrimos un flujo de conexión con el teclado
	  Scanner sc= new Scanner (System.in);
	  
	  //pedimos los valores de las variables a introducir
	  System.out.print ("Dime el precio inicial del artículo   ");
	  precioInicial= sc.nextDouble();
	  
	  System.out.print ("Dime el margen de beneficio que deseas obtener en %  ");
	  beneficio= sc.nextDouble();
	  
	  System.out.print ("¿Qué tipo de IVA hay que aplicar al artículo en %  ?");
	  iva= sc.nextDouble();
	  
	  //calculamos el beneficio, con la fórmula del interés simple
	  precioFinal =  precioInicial*100/ (100-beneficio) ;  //precio al que debe venderse el artículo para obtener el margen de beneficio
	  precioFinal= precioFinal * (1+ iva/100); // precio final aumentado con el tipo de IVA
	  
	  // salida de resultados:
	  System.out.print ("Precio inicial del artículo   :");
	  System. out.format ("%,.2f  euros %n", precioInicial);
	  System.out.print ("Precio al que debes venderlo para obtener un beneficio del  "+ beneficio + "%    :");
	  System. out.format ("%,.2f  euros %n", precioFinal);

	  sc.close();  //cerramos la comunicación con el teclado
	  
	  
	} // fin del método main
	

}  // fin de la clase principal