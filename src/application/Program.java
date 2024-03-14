package application;

import java.util.Locale;
import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainExceptions;

public class Program {

	public static void main(String[] args) {
	
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("---------------------------------------");
		System.out.println("  EXERCICIO DE FIXAÇÃO SOBRE EXCEÇÕES  ");
		System.out.println("---------------------------------------");
		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.next();
			String Holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double initialbalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double limit = sc.nextDouble();
			Account acc = new Account(number, Holder, initialbalance, limit);
			
			System.out.println();
			
			System.out.print("Enter amount for withdraw: ");
			acc.withdraw(sc.nextDouble());
			
			System.out.println("New balance: "+acc);
		}
		catch(RuntimeException p) {
			System.out.println("Unexpected error");
		}
		catch(DomainExceptions u){
			System.out.println(u.getMessage());
		}
		sc.close();
	}

}
