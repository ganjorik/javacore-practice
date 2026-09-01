package javaio;

import java.io.*;

public class UserTest {

	public static void main(String[] args) {
		User user = new User();
		user.setName("Test");
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("d://user.dat"))){
			oos.writeObject(user);

		} catch (FileNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("d://user.dat"))) {
			User user2 = (User) ois.readObject();
			System.out.println(user2);
			System.out.println(user.equals(user2));

		} catch (FileNotFoundException | ClassNotFoundException e) {
			throw new RuntimeException(e);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
}
