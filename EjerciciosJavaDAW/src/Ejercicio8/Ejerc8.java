package Ejercicio8;

/**
 * Ejercicio 8
 * Por @silverAlox
 */

import java.util.Scanner;

public class Ejerc8 {
	
	public static void main(String[] args) {
		
		Scanner ent = new Scanner(System.in);
		
		String nombre,apellido;
		double salarioBruto,salarioNeto,aumento,salarioTotal;
		int aniosTrabajados;
		
		System.out.println("Dime tu nombre: ");
		nombre = ent.nextLine(); //Guarda una cadena de texto
		System.out.println("Dime tu apellido: ");
		apellido = ent.nextLine(); //Guarda una cadena de texto
		System.out.println("Salario bruto: ");
		salarioBruto = ent.nextDouble(); //Guarda un numero double
		System.out.println("Anios en la empresa: ");
		aniosTrabajados = ent.nextInt(); //Guarda un numero entero
		
		salarioNeto = salarioBruto - salarioBruto * 0.15; //Calcula el salario neto aplicando un 15% al salario bruto
		aumento = (salarioNeto * 0.1) * aniosTrabajados; //Calcula el aumento, haciendo que cada año aumento un 1% en salario del trabajador
		salarioTotal = salarioNeto + aumento; //Calcula el salario total final
		
		System.out.println("Estimad@ " + nombre + apellido +  " , su salario bruto es: " + salarioBruto + ", teniendo en"
				+ "\ncuenta un IRPF del 15% su salario neto es: " + salarioNeto
				+ "\nDebido a sus " + aniosTrabajados +  " anios trabajando en la"
				+ "\nempresa su salario se incrementará en un 1% por cada anio. El aumento es de"
				+ aumento + " y el salario total es: " + salarioTotal  + ".");
		
		ent.close();
		
	}

}
