package colecciones.coleccion1;

//librería que necesitamos importar para abrir una conexión/flujo con el teclado
import java.util.Scanner;

 /** Clase Hoja1_Ej12 que calcula el interés que rinde un capital al cabo de unos meses
 *  el valor del capital, tasa de interés y duración de la inversión se introducen por teclado
 *@author   Carlos Herrero
 *@version 1.0
 */

public class Col1_Ej12{
	
	public static void main (String[] args){
		
		// programa para calcular los intereses en una cuenta bancaria, introduciendo los valores por teclado
		
		//empezamos por declarar las variables necesarias
		double  capital;
		int meses; 
		double tipo_interes;
		double tipo_retencion=18.0;   //único valor que consideramos fijo
		Scanner entrada= new Scanner(System.in);
		
		//pedimos el valor de las variables desconocidas
		System.out.print(" Dime el capital que vas a invertir, con decimales  :");
		capital=entrada.nextDouble();
		
		System.out.print(" Dime la duración de la inversión en meses, sin decimales  :");
		meses =entrada.nextInt();
		
		System.out.print(" Para finalizar, dime la tasa de interés anual, con decimales  :");
		tipo_interes=entrada.nextDouble();
		
		//calculamos ahora el interes a percibir
		
		double años_inversion= meses/12.0 ;
		// dividimos entre 12.0 y no entre 12 para que "meses" se convierta a decimal y la división también sea con decimales

		//calculamos el interés que percibiremos en dos pasos 
		double interes_antes_retencion =  capital*(tipo_interes/100) * años_inversion; 
		double interes_final =  interes_antes_retencion*(1-tipo_retencion/100); 
		
		//mostramos por último la información
		
		System.out.format ("%n El interés percibido será de   %.2f  euros", interes_final);
		System.out.format ("%n El capital total al cabo de  %d  meses ascenderá a  %.2f euros %n", meses, (capital+interes_final));

		//cerramos la conexión con teclado
		entrada.close();
		
	
			
	} //fin del main
	
}

