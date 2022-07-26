package Ejercicio10;

/**
 * Ejercicio10
 * 
 * Realizar un programa en Java que solicite al usuario los siguientes datos:
 - Edad
 - Nota académica
  El usuario quiere acceder a unos estudios para los que se requieren dos condiciones, por un
  lado ser mayor de 18 años y además haber obtenido una nota académica mayor de 7.
  Comprobar si los datos introducidos cumplen ambas condiciones. De ser así mostrar un
  mensaje por pantalla: "Usted ha sido admitido en el curso, cumple las condiciones
  requeridas". En caso contrario mostrar el siguiente mensaje "Lo sentimos, no ha sido
  admitido en el curso ya que no cumple los requisitos mínimos"
 * Por @silverAlox
 */

import java.util.Scanner;

public class Ejerc10 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int edad;
		double notaAcademica;
		
		System.out.println("Dime tu edad: ");
		edad = ent.nextInt();
		
		System.out.println("Dime tu nota academica: ");
		notaAcademica = ent.nextDouble();
		
		if(edad > 17 && notaAcademica > 7)
		{
			System.out.println("Felicidades, has entrado en el curso");
		}
		else
		{
			System.out.println("No cumples algunos de los requisitos minimos");
		}
		
		ent.close();
		
	}

}
