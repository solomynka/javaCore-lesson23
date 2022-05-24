package les23part1les13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
import java.util.function.Supplier;

public class Faction {

	public String delegateName;

	public String getDelegateName() {
		return delegateName;
	}

	public void setDelegateName(String delegateName) {
		this.delegateName = delegateName;
	}

	public Faction(String delegateName) {
		super();
		this.delegateName = delegateName;
	}

	ArrayList<Delegate> delegateArray = new ArrayList<Delegate>();

	static Supplier<Delegate> newDelegate = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть імя депутата: ");
		String name = sc.next().toUpperCase();
		System.out.println("Введіть фамілію депутата: ");
		String lastName = sc.next().toUpperCase();
		System.out.println("Введіть вагу депутата: ");
		double weight = sc.nextDouble();
		System.out.println("Введіть ріст депутата: ");
		double height = sc.nextDouble();
		System.out.println("Введіть чи бере депутат взятки: true  або false");
		boolean bribeTaker = sc.nextBoolean();
		return new Delegate(weight, height, name, lastName, bribeTaker);

	};

	public void addDelegate() {

		Delegate del = newDelegate.get();
		if (del.isBribe()) {
			del.giveBribe();
		}
		delegateArray.add(del);
		System.out.println("Депутат " + del.toString() + " доданий до фракції");
	}

	public void removeDelegate() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть фамілію депутата: ");
		String lastName = sc.next().toUpperCase();

		ListIterator<Delegate> listIterator = delegateArray.listIterator();

		while (listIterator.hasNext()) {
			Delegate next = listIterator.next();

			if (next.getSurname() == lastName) {
				listIterator.remove();
				System.out.println(("Депутат " + lastName + " видалений з фракції"));
			} else {
				System.out.println("Депутата " + lastName + " немає у даній фракції");
			}
		}
	}

	public void allBribeDelegate() {

		delegateArray.forEach(Delegate::isBribe);
	}

	public void maxBribery() {
		System.out.println("Найбільший хабарник ");
		System.out.println(Collections.max(delegateArray, new FactionBribeComparator()));
	}

	public void allDelegate() {

		for (Delegate delegate : delegateArray) {
			System.out.println("Список депутатів" + delegate.toString());
		}
	}

	public void removeAllDelegate() {

		delegateArray.clear();
		System.out.println("Всі депутати видалені з фракції");
	}

	@Override
	public String toString() {
		return "[" + delegateName + "]";
	}

}
