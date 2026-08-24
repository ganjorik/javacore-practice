package comparator;

import java.util.Comparator;

public class UserAgeComparator implements Comparator<User> {

	@Override
	public int compare(User o1, User o2) {
		if (o1.age > o2.age) {
			return 1;
		} else if (o1.age < o2.age) {
			return -1;
		}
		return 0;
	}
}
