package entities;

public class Employee {

	public String Name;
	public double grossSalary;
	public double Tax;
	
	public double NetSalary() {
		return grossSalary - Tax;
	}
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100;
	}
	public String toString() {
		return Name + ", $ " + String.format("%.2f", NetSalary());
	}
}
