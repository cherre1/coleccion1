package colecciones.coleccion1;

import javax.swing.JOptionPane;

/**
* Clase que calcula las dimensiones y área de un rectángulo
* los datos se recogen de cuadros de diálogo de la libreria JOptionPane y se convierten a numéricos
* Se trata la posible excepción cuando se introduce un valor numérico no válido
* @author Carlos Herrero
* @version 1.0
*/

public class Col1_Ej17{
	
	public static void main (String[] args){
		
		// Cálculo del perímetro y área de un rectángulo a partir de sus dimensiones
		
		//empezamos por declarar las variables necesarias
	
		double anchura, altura;
		String strAncho, strAlto;
		
		//pedimos los valores de las variables mediante cuadros de diálogo
		strAncho = JOptionPane.showInputDialog("Dame la anchura  del rectángulo, separando la parte decimal con punto :");
		strAlto = JOptionPane.showInputDialog("Dame ahora su altura, separando la parte decimal con punto :");
		
		// tratamos de convertir los valores introducidos a decimales
		// como esta parte puede provocar una excepción, la encerramos en un bloque try-catch()
		try{
			anchura= Double.parseDouble(strAncho);
			altura= Double.parseDouble(strAlto);
			
			//Efectuamos los cálculos, muy sencillos
			double perimetro= 2.0* (anchura+altura);
			double area= anchura* altura;
			
					
			System.out.print ("\n El perímetro del rectángulo es de   "+ perimetro +" unidades.");
			System.out.println ("\n Su superficie es de  "+ area + " unidades cuadradas.");
		}  catch (NumberFormatException e) {
			System.out.println( "Ha introducido un valor numérico no válido");
		}
		
		/* Nota: Deben introducirse los valores con el separador decimal que esté configurado para la región del dispositivo*/
													  
		
			
	} //fin del main
	
}