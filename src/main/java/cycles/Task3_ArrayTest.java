package cycles;

public class Task3_ArrayTest {
	public static void main(String[] args) {
		cycleTest();
		System.out.println("Метод отработал");

	}

	static void cycleTest() {
		for (int i = 0; i <= 8; i++) {
			if (i == 3) {
				return;
			}
			System.out.println(i);
		}
		System.out.println("Цикл отработал");
	}



}
