package map;

import java.util.*;

public class GetOrDefaultDemo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();

		int[] arr = new int[size];
		Random random = new Random();

		for (int i = 0; i < arr.length; i++) {
			arr[i] = random.nextInt(20);
		}

		System.out.println(Arrays.toString(arr));

		Map<Integer, Integer> duplicatesMap = new HashMap<>();


		for (int number : arr) {

			/*int count = duplicatesMap.getOrDefault(number,0);

			duplicatesMap.put(number, count + 1);*/

			duplicatesMap.merge(number, 1, Integer::sum);
		}

		System.out.println(duplicatesMap);


	}
}
