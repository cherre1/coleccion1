package colecciones.coleccion1;

import java.util.Scanner;

 /** Clase Col1_Ej13 que captura un carácter por pantalla y un entero corto
 *  a continuación muestra el carácter desplazado en el alfabeto ASCII la cantidad 
 * indicada por el entero corto
 *@author   Carlos Herrero
 *@version 1.0
 */

public class Col1_Ej13{
	
	public static void main (String[] args){
		
		// programa para desplazar un carácter
		
		//empezamos por declarar las variables necesarias
		char caracter1;
		byte desplazamiento;
		
		Scanner entrada= new Scanner(System.in);    //
		
		//pedimos una cadena por teclado, pero sólo nos quedamos con el primer caracter que escribamos
		System.out.print(" Escribe un carácter, seguido de retorno :");
		caracter1= entrada.next().charAt(0);
		
		System.out.print(" Escribe un número entero corto de desplazamiento :");
		desplazamiento= entrada.nextByte();
		
		//sumamos el carácter al desplazamiento y hacemos el casting para convertir el resultado a char
		
		char caracter2= (char)  (caracter1+ desplazamiento);
		
	
		
		//mostramos por último la información
		
		System.out.println ("Carácter que introdujiste  "+  caracter1);
		System.out.println ("Carácter desplazado  "+  caracter2);

		entrada.close();  //cerramos la conexión con el teclado
		
			
	} //fin del main
	
}

