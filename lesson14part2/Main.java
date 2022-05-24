package lesson14part2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Commodity commodity = new Commodity();

		while (true) {
			menu();

			switch (sc.next()) {
			case "1": {
				commodity.addСom();
				break;
			}
			case "2": {
				commodity.removeСom();
				break;
			}
			case "3": {
				commodity.replaceCom();
				break;
			}
			case "4": {
				commodity.sortNameCom();
				break;
			}
			case "5": {
				commodity.sortHeigCom();
				break;
			}
			case "6": {
				commodity.sortWeigCom();
				break;
			}
			case "7": {
				commodity.sortWidhtCom();
				break;
			}
			case "8": {
				commodity.elementOfCommod();
				break;
			}
			case "9": {
				commodity.exitProgrCommod();
				break;
			}
			}
		}
	}

	static void menu() {
		System.out.println("Натисніть 1, щоб додати товар: ");
		System.out.println("Натисніть 2, щоб видалити товар: ");
		System.out.println("Натисніть 3, щоб замінити товар: ");
		System.out.println("Натисніть 4, щоб сортувати за назвою: ");
		System.out.println("Натисніть 5, щоб сортувати за  висотою: ");
		System.out.println("Натисніть 6, щоб сортувати за вагою: ");
		System.out.println("Натисніть 7, щоб сортувати за шириною: ");
		System.out.println("Натисніть 8, щоб вивести  і-тий елемент: ");
		System.out.println("Натисніть 9, щоб завершити програму: ");
	}
}
