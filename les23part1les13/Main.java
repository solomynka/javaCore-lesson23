package les23part1les13;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	while(true) {
		menu() ;
		
		switch (sc.next()) {
		case "1":{
			VerhovnaRada.getInstance().addFaction();
			break;
		}
		case "2":{
			VerhovnaRada.getInstance().removeFaction();
			break;
		}
		case "3":{
			VerhovnaRada.getInstance().allFaction();
			break;
		}
		case "4":{
			VerhovnaRada.getInstance().removeAllDelegateInFaction();
			break;
		}
		case "5":{
			VerhovnaRada.getInstance().oneFaction();
			break;
		}
		case "6":{
			VerhovnaRada.getInstance().addDelegateToFaction();
			break;
		}
		case "7":{
			VerhovnaRada.getInstance().removeDelegateFromFaction();
			break;
		}
		case "8":{
			VerhovnaRada.getInstance().allBribeDelegateInFaction();
			break;
		}
		case "9":{
			VerhovnaRada.getInstance().maxBribeDelegateInFaction();
			break;
		}
			
	}
	}
}
static void menu() {
	System.out.println("�������� 1, ��� ������ �������: ");
	System.out.println("�������� 2, ��� �������� ��������� �������: ");
	System.out.println("�������� 3, ��� ������� ��  �������: ");
	System.out.println("�������� 4, ��� �������� ��������� �������: ");
	System.out.println("�������� 5, ��� ������� ��������� �������: ");
	System.out.println("�������� 6, ��� ������ �������� � �������: ");
	System.out.println("�������� 7, ��� �������� �������� � �������: ");
	System.out.println("�������� 8, ��� ������� ������ ���������: ");
	System.out.println("�������� 9, ��� ������� ���������� ���������: ");
}

}
