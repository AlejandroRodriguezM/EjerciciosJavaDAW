package Ejercicio5;

/**
 * Ejercicio 5
 * Por @silverAlox
 */

import java.util.Scanner;

public class Ejerc5 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int num;
		String cad;
		double num2;
		char caracter;
		boolean prueba = true;
		
		System.out.println("Dime un numero: ");
		num = ent.nextInt();
		ent.nextLine();
		System.out.println("Dime una palabra: ");
		cad = ent.nextLine();
		System.out.println("Dime un numero con decimales: ");
		num2 = ent.nextDouble();
		System.out.println("Dime un caracter: ");
		caracter = ent.next().charAt(0);
		
		System.out.println(num);
		System.out.println(cad);
		System.out.println(num2);
		System.out.println(caracter);
		System.out.println(prueba);
		
		ent.close();
		
	}

}
