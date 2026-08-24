package comparator;

import java.util.ArrayList;
import java.util.List;

public class UserTest {
	public static void main(String[] args) {
		List<User> userList = new ArrayList<>();
		userList.add(new User("Павел", 25));
		userList.add(new User("Ольга Петровна", 80));
		userList.add(new User("Ваня", 4));
		userList.add(new User("Женя", 10));
		userList.add(new User("Георгий Иванович", 90));

		System.out.println(userList);

		UserNameComparator userNameComparator = new UserNameComparator();
		userList.sort(userNameComparator);

		System.out.println(userList);

		UserAgeComparator userAgeComparator = new UserAgeComparator();
		userList.sort(userAgeComparator);

		System.out.println(userList);

		userList.add(new User("Ваня", 4));
		userList.add(new User("Ваня", 14));
		userList.add(new User("Ваня", 1));

		userList.sort(userNameComparator.thenComparing(userAgeComparator));

		System.out.println(userList);
	}
}
