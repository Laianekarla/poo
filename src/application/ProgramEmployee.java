package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em
seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
salário do funcionário com base em uma porcentagem dada (somente o salário bruto é
afetado pela porcentagem) e mostrar novamente os dados do funcionário. */

public class ProgramEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Employee employee = new Employee();

		System.out.println("Type your name: ");
		employee.name = sc.next();
		System.out.println("Enter your salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.println("Enter the tax amount:  ");
		employee.tax = sc.nextDouble();

		System.out.println("Employee: " + employee);

		System.out.println("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		System.out.println("Update date: " + employee);

		sc.close();
	}

}
