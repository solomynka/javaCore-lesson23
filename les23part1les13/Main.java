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
	System.out.println("Натисніть 1, щоб додати фракцію: ");
	System.out.println("Натисніть 2, щоб видалити конкретну фракцію: ");
	System.out.println("Натисніть 3, щоб вивести усі  фракції: ");
	System.out.println("Натисніть 4, щоб очистити конкретну фракцію: ");
	System.out.println("Натисніть 5, щоб вивести конкретну фракцію: ");
	System.out.println("Натисніть 6, щоб додати депутата в фракцію: ");
	System.out.println("Натисніть 7, щоб видалити депутата з фракції: ");
	System.out.println("Натисніть 8, щоб вивести список хабарників: ");
	System.out.println("Натисніть 9, щоб вивести найбільшого хабарника: ");
}

}
