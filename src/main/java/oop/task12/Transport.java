package oop.task12;

public class Transport {
	void honk() {
		System.out.println("Би-бип");
	}

	void honk(String msg) {
		System.out.println(msg);
	}

	void honk(String msg, int count) {
		for (int i = 0; i < count; i++)
		System.out.println(msg);
	}
}
