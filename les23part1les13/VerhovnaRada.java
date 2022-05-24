package les23part1les13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Optional;
import java.util.Scanner;
import java.util.function.Supplier;

public class VerhovnaRada {

	private static VerhovnaRada verhovnaRada;

	public static VerhovnaRada getInstance() {
		if (verhovnaRada == null) {
			verhovnaRada = new VerhovnaRada();
		}
		return verhovnaRada;
	}

	public static void setVerhovnaRada(VerhovnaRada verhovnaRada) {
		VerhovnaRada.verhovnaRada = verhovnaRada;
	}

	ArrayList<Faction> newFactionArray = new ArrayList<>();

	public ArrayList<Faction> getNewFactionArray() {
		return newFactionArray;
	}

	Supplier<Faction> newFact = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String name = sc.next().toUpperCase();

		return new Faction(name);
	};

	public void addFaction() {

		Faction faction = newFact.get();
		newFactionArray.add(faction);
		System.out.println("Фракція " + faction + " створена");
	}

	public void removeFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String name = sc.next().toUpperCase();

		Iterator<Faction> iterator = newFactionArray.iterator();
		while (iterator.hasNext()) {
			Faction next = iterator.next();
			if (next.getDelegateName().equalsIgnoreCase(name)) {
				iterator.remove();
				System.out.println(("Фракція " + name + " видалена"));
			} else {
				System.out.println("Фракція " + name + " не існує");
			}
		}
	}

	public void allFaction() {

		newFactionArray.forEach(System.out::println);
	}

	public void oneFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String name = sc.next().toUpperCase();

		Iterator<Faction> iterator = newFactionArray.iterator();

		while (iterator.hasNext()) {
			Faction next = iterator.next();
			if (next.getDelegateName().equalsIgnoreCase(name)) {
				System.out.println(("Фракція " + name.toString()));
			} else {
				System.out.println("Фракція " + name + " не існує");

			}
		}
	}

	public void addDelegateToFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String nameF = sc.next().toUpperCase();

		Optional<Faction> correct = getNewFactionArray().stream().filter(p -> p.getDelegateName().equals(nameF))
				.findAny();
		if (correct.isPresent()) {
			correct.get().addDelegate();
		} else {
			System.out.println("Фракція " + nameF + " не існує");
		}
	}

	public void removeDelegateFromFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String nameF = sc.next().toUpperCase();

		Optional<Faction> correct = getNewFactionArray().stream().filter(p -> p.getDelegateName().equals(nameF))
				.findAny();
		if (correct.isPresent()) {
			correct.get().removeDelegate();
		} else {
			System.out.println("Фракція " + nameF + " не існує");
		}
	}

	public void allBribeDelegateInFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String nameF = sc.next().toUpperCase();

		Optional<Faction> correct = getNewFactionArray().stream().filter(p -> p.getDelegateName().equals(nameF))
				.findAny();
		if (correct.isPresent()) {
			correct.get().allBribeDelegate();
		} else {
			System.out.println("Фракція " + nameF + " не існує");
		}
	}

	public void maxBribeDelegateInFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String nameF = sc.next().toUpperCase();

		Optional<Faction> correct = getNewFactionArray().stream().filter(p -> p.getDelegateName().equals(nameF))
				.findAny();
		if (correct.isPresent()) {
			correct.get().maxBribery();
		} else {
			System.out.println("Фракція " + nameF + " не існує");
		}
	}

	public void removeAllDelegateInFaction() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву фракції: ");
		String nameF = sc.next().toUpperCase();

		Optional<Faction> correct = getNewFactionArray().stream().filter(p -> p.getDelegateName().equals(nameF))
				.findAny();
		if (correct.isPresent()) {
			correct.get().removeAllDelegate();
		} else {
			System.out.println("Фракція " + nameF + " не існує");
		}
	}

	@Override
	public String toString() {
		return "VerhovnaRada [newFactionArray=" + newFactionArray + "]";
	}

}
