package map;

import java.util.*;

public class DuplicatesArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int[] arr = new int[size];

		Random random = new Random();
		for (int i = 0; i < size; i++) {
			arr[i] = random.nextInt(20);
		}

		Map<Integer, Integer> duplicatesMap = new HashMap<>();
		System.out.println(Arrays.toString(arr));

		for (int i : arr) {
			if (duplicatesMap.containsKey(i)) {
				int duplicateCount = duplicatesMap.get(i);
				duplicatesMap.put(i, ++duplicateCount);
			}  else {
				duplicatesMap.put(i, 0);
			}
		}

		System.out.println(duplicatesMap);
	}
}
