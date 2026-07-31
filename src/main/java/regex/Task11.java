package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();

		Pattern p = Pattern.compile("\\d+");
		Matcher matcher = p.matcher(str);

		int maxLength = 0;
		String numberSeq = "";

		/*while (matcher.find()) {
			if (maxLength < matcher.end() -  matcher.start()) {
				maxLength = matcher.end() - matcher.start();
				numberSeq = matcher.group();
			}
		}*/

		while (matcher.find()) {

			String current =  matcher.group();

			if (current.length() > maxLength) {
				maxLength = current.length();
				numberSeq = current;
			}
		}

		System.out.println(maxLength + " " + numberSeq);
	}
}
