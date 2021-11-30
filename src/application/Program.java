package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);

		
		Employee x = new Employee();
		
		System.out.print("Name: ");
		x.Name = sc.nextLine();
		
		System.out.print("Gross salary: ");
		x.grossSalary = sc.nextDouble();
		
		System.out.print("Tax: ");
		x.Tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + x);
				
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double grossSalary = sc.nextInt();
		x.increaseSalary(grossSalary);
		
		System.out.println();
		System.out.println("Updated data: " + x);
		
		
		sc.close();
	}

}
