package arrays;

import java.util.Arrays;
import java.util.Random;

public class Task4_Array {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(20);
		}

		System.out.println(Arrays.toString(array));

		for (int i = 0; i < array.length; i++) {
			array[i] += 100;
		}
		System.out.println(Arrays.toString(array));
		for (int element : array) {
			System.out.print(element % 100 + " ");
		}
		System.out.println();

		/*Arrays.sort(array);
		System.out.println(Arrays.toString(array));*/
	}
}
