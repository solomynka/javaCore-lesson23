package les23part1les13;

import java.util.Scanner;

public class Delegate extends Human {

	private String name;
	private String surname;
	private boolean bribe;
	private double sumOfBribe;

	public Delegate(double height, double weight, String name, String surname, boolean bribe) {
		super(height, weight);
		this.name = name;
		this.surname = surname;
		this.bribe = bribe;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public boolean isBribe() {
		return bribe;
	}

	public void setBribe(boolean bribe) {
		this.bribe = bribe;
	}

	public double getSumOfBribe() {
		return sumOfBribe;
	}

	public void setSumOfBribe(double sumOfBribe) {
		this.sumOfBribe = sumOfBribe;
	}

	public void giveBribe() {
		if (bribe == false) {
			System.out.println(" Цей депутат не бере хабарів");
		}
		if (bribe == true) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Ведіть суму хабаря: ");
			double sum = sc.nextDouble();

			System.out.println("Ведіть суму хабаря: ");
			if (sum >= 5000) {
				this.sumOfBribe = sum;
				System.out.println("Поліція ув'язнить депутата");
			} else {
				this.sumOfBribe = sum;
			}
		}
	}

	@Override
	public String toString() {
		return "[name=" + name + ", surname=" + surname + ", bribe=" + bribe + ", sumOfBribe=" + sumOfBribe + "]";
	}

}
