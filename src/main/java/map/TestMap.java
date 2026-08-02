package map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {
	public static void main(String[] args) {
		Map<Integer, String> states = new HashMap<>();
		states.put(1, "Germany");
		states.put(2, "Spain");
		states.put(3, "Italy");
		states.put(4, "France");
		String first = states.get(2);
		System.out.println(first);

		Set<Integer> keys = states.keySet();
		System.out.println("keys: " + keys);

		Collection<String> values = states.values();
		System.out.println("values: " + values);

		states.replace(1, "Poland");
		states.remove(2);
		for (Map.Entry<Integer, String> item : states.entrySet()) {
			System.out.printf("Key: %d Value: %s \n", item.getKey(), item.getValue());
		}

	}
}
