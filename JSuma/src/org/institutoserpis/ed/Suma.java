package org.institutoserpis.ed;

import java.math.BigDecimal;
import java.util.Scanner;

public class Suma {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Introduce un número: ");
		BigDecimal numero1 = new BigDecimal(scanner.nextLine());
		System.out.print("Introduce el segundo: ");
		BigDecimal numero2 = new BigDecimal(scanner.nextLine());
		
		
		BigDecimal suma = numero1.add(numero2);
		BigDecimal resta = numero1.subtract(numero2);
		BigDecimal producto = numero1.multiply(numero2);
		BigDecimal division = numero1.divide(numero2);
		System.out.println("Primer Número = " + numero1);
		System.out.println("Segundo Número = " + numero2);
		System.out.println("Suma = " + suma);
		System.out.println("Resta = " + resta);
		System.out.println("Producto = " + producto);
		System.out.println("División = " + division);
	}

}
