package application;

import java.util.Locale;
import java.util.Scanner;

import entities.AccountBank;

/*Programa que faz cadastro bancário e movimenta deposito e saque adicionando uma taxa em cima do saque
 * 
 */

public class ProgramAccountBank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountBank account;

		System.out.print("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.print("Enter initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new AccountBank(accountNumber, name, initialDeposit);

		} else {
			account = new AccountBank(accountNumber, name);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.depositValue(depositValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double withdrawValue = sc.nextDouble();
		account.withdrawValue(withdrawValue);
		System.out.println("Updated account data: ");
		System.out.println(account);

		sc.close();

	}

}
