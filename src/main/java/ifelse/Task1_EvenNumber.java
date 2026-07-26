package ifelse;

public class Task1_EvenNumber {

	public static void main(String[] args) {
		 int i = 101;
		System.out.println(isEven(i));
	}

	static String isEven(int i) {
		boolean isEven = (i % 2) == 0;
		if (isEven) {
			return "Чётное";
		} else {
			return "Нечетное";
		}
	}
}
