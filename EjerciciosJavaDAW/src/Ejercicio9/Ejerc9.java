package Ejercicio9;

/**
 * Ejercicio 9
 * Realizar un programa en Java que solicite al usuario dos números, num1 y num2.
 * - Comprobar si num1 es mayor que num2, si es al revés o si son iguales.
 * - Mostrar por pantalla al usuario un mensaje informando del resultado
 * @silverAlox
 */

import java.util.Scanner;

public class Ejerc9 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in); //Permite escribir datos por teclado
		
		int num1,num2; //Numeros enteros
		
		System.out.println("Escribe un numero: ");
		num1 = ent.nextInt();
		
		System.out.println("Escribe otro numero: ");
		num2 = ent.nextInt();
		
		if(num1 > num2) //Si num1 es mayor a num2 se mostrara los siguiente
		{
			System.out.println(num1 + " es mayor que " + num2);
		}
		else if(num2 > num1) //Si num2 es mayor que num1 se mostrara el siguiente mensaje
		{
			System.out.println(num2 + " es mayor que " + num1);
		}
		else //Si es igual, mostrara el siguiente mensaje
		{
			System.out.println(num1 + " es igual a " + num2);
		}
		
		ent.close(); //Se cierra la funcion Scanner
		
	}

}
