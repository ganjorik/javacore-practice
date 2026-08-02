package collection;

import java.util.*;

public class TestClass {
	public static void main(String[] args) {

		Queue<String> queue = new LinkedList<String>();
		queue.add("element 1");
		queue.add("element 2");
		queue.add("element 3");
		System.out.println(queue.peek());
		System.out.println(queue);
		System.out.println(queue.poll());
		System.out.println(queue);
		System.out.println();

		Set<String> words = new HashSet<String>();
		words.add("One");
		words.add("Two");
		words.add("Three");

		Iterator<String> iter = words.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
	}
}
