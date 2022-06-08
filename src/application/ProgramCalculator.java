package application;

import java.util.Locale;
import java.util.Scanner;

import util.Calculator;

/*Fazer um programa para ler um valor num�rico qualquer, e da� mostrar
quanto seria o valor de uma circunfer�ncia e do volume de uma esfera
para um raio daquele valor. Informar tamb�m o valor de PI com duas
casas decimais. */

public class ProgramCalculator {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter radius: ");
		double radius = sc.nextDouble();

		double c = Calculator.circumferece(radius);

		double v = Calculator.volume(radius);

		System.out.printf("Circumference: %.2f%n", c);
		System.out.printf("Volume: %.2f%n", v);
		System.out.printf("PI value: %.2f%n", Calculator.PI);

		sc.close();

	}

}
