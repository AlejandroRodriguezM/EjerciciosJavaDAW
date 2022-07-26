package Ejercicio11;

/**
 * Ejercicio 11
 * Realizar un programa en Java que solicite al usuario los siguientes datos:
 - Edad
El usuario quiere acceder a unos estudios para los que se requiere ser mayor de edad.
Comprobaremos la edad y en caso de ser menor de 18 años mostraremos el siguiente
mensaje: No tiene la edad requerida para realizar estos estudios.
En caso de cumplir el requisito de edad se le solicitarán los siguientes datos:
 - Nombre
 - Apellidos
 - Fecha de Nacimiento
Una vez recopilados se le mostrará el siguiente mensaje:
Nombre: Juan
Apellidos: López Pérez
Edad: 25
Usted ha sido admitido

Por @silverAlox
 */

import java.util.Scanner;

public class Ejerc11 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		int edad;
		String nombre,apellido,fechaNacimiento;
		
		System.out.println("Dime tu edad: ");
		edad = ent.nextInt();
		ent.nextLine();
		
		if(edad > 17)
		{
			System.out.println("Dime tu nombre: ");
			nombre = ent.nextLine();
			
			System.out.println("Dime tu apellido: ");
			apellido = ent.nextLine();
			
			System.out.println("Fecha de nacimiento: ");
			fechaNacimiento = ent.nextLine();
			
			System.out.println("\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\nFecha de nacimiento: " + fechaNacimiento);
		}
		else
		{
			System.out.println("Eres menor de edad, no puedes continuar");
		}
		ent.close();
		
	}

}
