package arrays;

import java.util.Arrays;
import java.util.Random;

public class Task5_ArrayMax {
	public static void main(String[] args) {
		int[] array = new int[10];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(20);
		}
		System.out.println(Arrays.toString(array));

		int max = 0;
		for (int element : array) {
			if (max < element)
				max = element;
		}
		System.out.println(max);

		int sum = 0;
		for (int element : array) {
			sum += element;
		}
		System.out.println(sum);
	}


}

