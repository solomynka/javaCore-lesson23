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
				commodity.add�om();
				break;
			}
			case "2": {
				commodity.remove�om();
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
		System.out.println("�������� 1, ��� ������ �����: ");
		System.out.println("�������� 2, ��� �������� �����: ");
		System.out.println("�������� 3, ��� ������� �����: ");
		System.out.println("�������� 4, ��� ��������� �� ������: ");
		System.out.println("�������� 5, ��� ��������� ��  �������: ");
		System.out.println("�������� 6, ��� ��������� �� �����: ");
		System.out.println("�������� 7, ��� ��������� �� �������: ");
		System.out.println("�������� 8, ��� �������  �-��� �������: ");
		System.out.println("�������� 9, ��� ��������� ��������: ");
	}
}
