/**
* Clase que presenta las notas en 3 parciales y su nota media
* @version 1.0
*/

package colecciones.coleccion1;

public class Col1_Ej4{
 
	

	
	public static void main (String[] args){

		 double parcial_1 = 6.5;
		 double parcial_2 = 4.5;
		 double parcial_3 = 7.25;

		 double nota_media =  (parcial_1 + parcial_2+ parcial_3)/3;

		 String asignatura="Bases de Datos";
		
		System.out.println ("Asignatura: \t " + asignatura);
		System.out.println ("Nota parcial 1: \t " + parcial_1);
		System.out.println ("Nota parcial 2: \t " + parcial_2);
		System.out.println ("Nota parcial 3: \t " + parcial_3);
		System.out.println ("Nota media: \t " + nota_media);
													  
				
	}
	
}