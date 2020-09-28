package colecciones.coleccion1;

import java.util.Scanner;

/**
* Clase que recoge el nombre y la fecha de nacimiento de una persona de teclado
* y los muestra por pantalla
* @author Carlos Herrero
* @version 1.0
*/

public class Col1_Ej10{
	
	public static void main (String[] args){
		
		// programa de saludo
		
		//empezamos por declarar las variables necesarias
		Scanner entrada = new Scanner(System.in);
		String nombre;
		String fechaNacimiento;
		
		//pedimos los valores de las variables
		System.out.print ("Escribe tu nombre   :");
		nombre= entrada.nextLine();
	
		System.out.print ("\nEscribe tu fecha de nacimiento en formato dd/mm/aaaa  :");
		fechaNacimiento= entrada.nextLine();
		
				
		System.out.print ("\n Te llamas  "+ nombre);
		System.out.println ("\n Y naciste el día  :"+ fechaNacimiento);

		//aunque no es estrictamente necesario, liberaremos el dispositivo de entrada una vez que no lo necesitamos
		entrada.close();
		
		/* Nota: Fijarse en el uso del retorno de carro \n con print para forzar a empezar a escribir en una nueva línea*/
													  
		
			
	} //fin del main
	
}