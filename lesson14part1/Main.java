// * @Author Solomiia
// * 04.05.2022
// * 
// * 

package lesson14part1;

import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
	
		Set<Student> set = new HashSet<>();
		
		set.add(new Student("Anna", 18));
		set.add(new Student("Anna", 19));
		set.add(new Student("Andrii", 19));
		set.add(new Student("Andrii", 17));
		set.add(new Student("Olivia", 20));
		set.add(new Student("Ivan", 18));
		set.add(new Student("Ivan", 20));
		
		List<Student> sortetReverse = set.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(sortetReverse);
		
		set.forEach(System.out::println);
		
		System.out.println();
		TreeSet<Student> tSet2 = new TreeSet<>(new StudentComparator());
		tSet2.add(new Student("Anna", 18));
		tSet2.add(new Student("Anna", 19));
		tSet2.add(new Student("Andrii", 19));
		tSet2.add(new Student("Andrii", 17));
		tSet2.add(new Student("Olivia", 20));
		tSet2.add(new Student("Ivan", 18));
		tSet2.add(new Student("Andrii", 33));
		tSet2.add(new Student("Ivan", 20));
		
		List<Student> tSet2sort = tSet2.stream().sorted().collect(Collectors.toList());
		System.out.println(tSet2sort);
		tSet2.forEach(System.out::println);
	}

}
