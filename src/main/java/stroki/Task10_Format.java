package stroki;

public class Task10_Format {
	public static void main(String[] args) {
		String str1 = "CAT DOG";
		String str2 = "DOG";
		System.out.println(replaceSecondWord(str1, str2));
	}

	static String replaceSecondWord(String str1, String str2) {
		int i = str1.indexOf(" ");
		String secondWord = str1.substring(i + 1);
		if (secondWord.equals(str2)) {
			System.out.println("замена бесмыссленна");
		} else {
			str1 = str1.substring(0, i + 1) + str2;
		}
		return str1;
	}
}
