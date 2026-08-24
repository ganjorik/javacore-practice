package map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComputeIfAbsentDemo {
	public static void main(String[] args) {

		Map<String, List<String>> groups = new HashMap<>();

		groups.computeIfAbsent("Java", k -> new ArrayList<>())
				.add("Denis");

		groups.computeIfAbsent("Java", k -> new ArrayList<>())
				.add("Ivan");

		groups.computeIfAbsent("Java", k -> new ArrayList<>())
				.add("Alex");

		groups.computeIfAbsent("Spring", k -> new ArrayList<>())
				.add("Petr");

		groups.computeIfAbsent("Spring", k -> new ArrayList<>())
				.add("Olga");


		System.out.println(groups);


	}
}
