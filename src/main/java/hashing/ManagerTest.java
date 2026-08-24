package hashing;

import java.time.LocalDate;

public class ManagerTest {
	public static void main(String[] args) {
		Manager manager = new Manager();
		manager.addNewUser(new User("misha", "12l54", LocalDate.of(2020, 10, 10)));
		manager.addNewUser(new User("vania", "hasder", LocalDate.now()));
		manager.addNewUser(new User("petr", "poket", LocalDate.of(2021, 10, 12)));
		manager.addNewUser(new User("ira", "rooter", LocalDate.of(2022, 8, 16)));
		manager.addNewUser(new User("kira", "sender", LocalDate.of(2022, 2, 12)));
		System.out.println();

		manager.getAllUsers("date");
		System.out.println();
		manager.editUser(new User("misha", "111", LocalDate.now()));
	}
}
