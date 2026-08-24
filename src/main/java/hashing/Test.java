package hashing;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Test {
	public static void main(String[] args) {
		Map<User, String> test = new HashMap<>();
		User user = new User("misha", "1234", LocalDate.of(2020, 10, 10));

		test.put(user, "value 1");

		System.out.println(test);

		user.setPassword("12345");

		System.out.println(user.equals(user));

		test.put(user, "value 2");

		System.out.println(test);
	}
}
