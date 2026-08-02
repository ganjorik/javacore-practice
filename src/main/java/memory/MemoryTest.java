package memory;

import java.util.ArrayList;

public class MemoryTest {

	public static void main(String[] args) {
		printMemory();
		ArrayList list = new ArrayList();
		for (int i = 0; i < 45_000_000; i++) {
			list.add(new Man(i));
		}
		printMemory();
	}

	public static void printMemory() {
		System.out.println("Max mem: " + Runtime.getRuntime().maxMemory() / 1_000_000);
		System.out.println("Total mem: " + Runtime.getRuntime().totalMemory() / 1_000_000);
		System.out.println("Free available mem: " + Runtime.getRuntime().freeMemory() / 1_000_000);
		long usedMemory = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
		System.out.println("Used mem: " + usedMemory / 1_000_000);
		long freeMemory = Runtime.getRuntime().maxMemory() - usedMemory;
		System.out.println("Free mem: " + freeMemory / 1_000_000);
		System.out.println("------------------------------------");
	}
}
