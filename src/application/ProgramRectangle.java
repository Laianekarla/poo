package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

/*Fazer um programa para ler os valores da largura e altura
de um ret�ngulo. Em seguida, mostrar na tela o valor de
sua �rea, per�metro e diagonal. */

public class ProgramRectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle(); // declaracao da minha variavel /instanciando
		
		System.out.println("Enter the value of the width and height of the rectangle: ");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();

		System.out.printf("AREA: %.2f%n", rectangle.area());
		System.out.printf("PERIMETER: %.2f%n", rectangle.perimeter());
		System.out.printf("DIAGONAL: %.2f%n", rectangle.diagonal());

		sc.close();
	}

}
