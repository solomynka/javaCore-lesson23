package lesson14part2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Supplier;

public class Commodity {

	private String name;
	private double weight;
	private double height;
	private double widht;

	public Commodity() {
		super();
	}

	public Commodity(String name, double weight, double height, double widht) {
		super();
		this.name = name;
		this.weight = weight;
		this.height = height;
		this.widht = widht;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidht() {
		return widht;
	}

	public void setWidht(double widht) {
		this.widht = widht;
	}

	@Override
	public String toString() {
		return "Commodity [name=" + name + ", weight=" + weight + ", height=" + height + ", widht=" + widht + "]";
	}

	List<Commodity> comSet = new ArrayList<>();

	static Supplier<Commodity> Goods = () -> {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву товару: ");
		String name = sc.next().toUpperCase();
		System.out.println("Введіть вагу товару: ");
		double weight = sc.nextDouble();
		System.out.println("Введіть висоту товару: ");
		double height = sc.nextDouble();
		System.out.println("Введіть ширину товару: ");
		double widht = sc.nextDouble();

		return new Commodity(name, weight, height, widht);
	};

	public void addСom() {
		comSet.forEach(System.out::println);

		Commodity com = Goods.get();
		comSet.add(com);
		System.out.println("Товар " + com + " доданий");

		comSet.forEach(System.out::println);
	}

	public void removeСom() {
		comSet.forEach(System.out::println);

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву товару: ");
		String name = sc.next().toUpperCase();

		Iterator<Commodity> iterator = comSet.iterator();

		while (iterator.hasNext()) {
			Commodity next = iterator.next();
			if (next.getName().equalsIgnoreCase(name)) {
				iterator.remove();
				System.out.println("Товар " + name + " видалений");
			} else {
				System.out.println("Товар " + name + " відсутній");
			}
		}
		comSet.forEach(System.out::println);
	}

	public void replaceCom() {
		comSet.forEach(System.out::println);

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть назву товару, який хочете замінити ");
		String name1 = sc.next().toUpperCase();

		Iterator<Commodity> iterator = comSet.iterator();

		try {
			while (iterator.hasNext()) {
				Commodity next = iterator.next();

				if (next.getName().equalsIgnoreCase(name1)) {
					iterator.remove();
					System.out.println("Товар " + name1 + " видалений");

					Commodity com = Goods.get();
					comSet.add(com);
					System.out.println("Товар " + com + " доданий");
					System.out.println("");
				} else {
					System.out.println("Товар " + name1 + " відсутній");
				}
			}
		} catch (Exception e) {

		}
		comSet.forEach(System.out::println);
	}

	public void sortNameCom() {
		System.out.println("До сортування: ");
		comSet.forEach(System.out::println);

		System.out.println("Після сортування: ");
		comSet.stream().sorted((a, b) -> a.getName().compareTo(b.getName())).forEach(a -> System.out.println(a));
	}

	public void sortHeigCom() {
		System.out.println("До сортування: ");
		comSet.forEach(System.out::println);

		System.out.println("Після сортування: ");
		comSet.stream().sorted((a, b) -> (int) a.getHeight() - (int) b.getHeight()).forEach(a -> System.out.println(a));
	}

	public void sortWeigCom() {
		System.out.println("До сортування: ");
		comSet.forEach(System.out::println);

		System.out.println("Після сортування: ");
		comSet.stream().sorted((a, b) -> (int) a.getWeight() - (int) b.getWeight()).forEach(a -> System.out.println(a));
	}

	public void sortWidhtCom() {
		System.out.println("До сортування: ");
		comSet.forEach(System.out::println);

		System.out.println("Після сортування: ");
		comSet.stream().filter(x -> x.getName().equals(name)).forEach(a -> System.out.println(a));
	}

	public void elementOfCommod() {
		comSet.forEach(System.out::println);

		Scanner sc = new Scanner(System.in);
		System.out.println("Введіть номер елемента, який хочете вивести на екран (цілі числа від 0 ");
		int number = sc.nextInt();

		Object[] array = comSet.toArray();
		System.out.println(array[number]);
	}

	public void exitProgrCommod() {
		System.exit(0);
	}
}
