package comparator;

import java.util.TreeSet;

public class PersonTest {
	public static void main(String[] args) {
		TreeSet<Person> personTreeSet = new TreeSet<>();
		personTreeSet.add(new Person("Tom"));
		personTreeSet.add(new Person("Jack"));
		personTreeSet.add(new Person("Den"));

		System.out.println(personTreeSet);
	}
}
