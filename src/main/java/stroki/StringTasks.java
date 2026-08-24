package stroki;

public class StringTasks {
	public static void main(String args[]) {

		System.out.println(getFormatLogin("   AdMiN   "));

		System.out.println(replaceSecondWord(
				"Java Spring Hibernate",
				"SQL"
		));

		System.out.println(replaceSecondWord(
				"Java SQL Hibernate",
				"SQL"
		));

		System.out.println(replaceSecondWord(
				"Java",
				"SQL"
		));

		System.out.println(replaceSecondWord(
				"Java    Spring     Hibernate",
				"SQL"
		));

		System.out.println(replaceSecondWord(
				"Java Spring",
				null
		));
	}

	public static String getFormatLogin(String str) {
		return str.trim().toLowerCase();
	}

	public static String replaceSecondWord(String str1, String str2) {

		String [] words = str1.trim().split("\\s+");

		if (words.length < 2) {
			return str1;
		}

		if (words[1].equals(str2)) {
			return "Замена бессмысленна";
		}

		words[1] = str2;

		return String.join(" ", words);
	}
}
