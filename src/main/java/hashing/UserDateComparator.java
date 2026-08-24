package hashing;

import java.util.Comparator;

public class UserDateComparator implements Comparator<User> {

	@Override
	public int compare(User user1, User user2) {
		if (user1.getCreateDate().isAfter(user2.getCreateDate())) {
			return 1;
	} else if (user2.getCreateDate().isAfter(user1.getCreateDate())) {
		return -1;
		} else {
			return 0;
		}
	}
}
