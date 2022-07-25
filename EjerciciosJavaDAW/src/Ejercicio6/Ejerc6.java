package Ejercicio6;

import java.util.Scanner;

public class Ejerc6 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		System.out.println("Nombre del equipo: ");
		String nomEquipo = ent.nextLine();
		System.out.println("Nombre del estadio: ");
		String nomEstadio = ent.nextLine();
		System.out.println("Anio de fundacion del equipo: ");
		int AnioFundacion = ent.nextInt();
		ent.nextLine();
		System.out.println("Nombre del capitan: ");
		String nomCapitan = ent.nextLine();
		
		System.out.println(nomEquipo);
		System.out.println(nomEstadio);
		System.out.println(AnioFundacion);
		System.out.println(nomCapitan);
		
		ent.close();
	}
}
