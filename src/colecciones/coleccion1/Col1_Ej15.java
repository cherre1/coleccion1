package colecciones.coleccion1;

/**
 * Clase/programa que lee una cantidad de segundos de teclado y la convierte sucesivamente a:
 * minutos - horas - días
 * @author Carlos Herrero
 * @version 1.0
*/

import java.util.Scanner;

public class Col1_Ej15 {
	public static void main(String[] args) {
		//conexion con el teclado para leer el número de segundos
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduce un número de segundos: ");
		int segundos = teclado.nextInt();
		
		// a continuación vamos convirtiendo el valor a:
		System.out.format("Segundos: %d%n", segundos);
		double minutos = segundos / 60.;     //convertimos a minutos dividiendo entre 60
		System.out.format("Minuto(s): %.1f%n", minutos);
		double horas = segundos / 3600.;	//convertimos a horas dividiendo entre 3600
		System.out.format("Hora(s): %.2f%n", horas);
		double dias = segundos / 86400.;
		System.out.format("Día(s): %.3f%n", dias); //convertimos a días dividiendo entre 86400
		
		teclado.close();   //cerramos la conexión con el teclado
	}
}