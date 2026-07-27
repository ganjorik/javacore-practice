package stroki;

import java.util.Random;
import java.util.Scanner;

public class Games {

	public static void main(String[] args) {


		String[] adjectives = {"смешной", "ленивый", "огромный", "маленький", "веселый",
				"зеленый", "хитрый", "смелый", "добрый", "быстрый"};

		String[] nouns = {"кот", "программист", "дракон", "робот", "студент",
				"повар", "тигр", "ежик", "пингвин", "волшебник"};

		String[] verbs = {"бегает", "танцует", "программирует", "летает", "смеется",
				"читает", "прыгает", "поет", "рисует", "спит"};

		Random random = new Random();

		Scanner scanner = new Scanner(System.in);

		System.out.println("Сколько фраз сгенерировать?");

		int count = scanner.nextInt();



		for (int i = 0; i < count; i++) {

			int adjectiveIndex = random.nextInt(adjectives.length);

			int nounIndex = random.nextInt(nouns.length);

			int verbIndex = random.nextInt(verbs.length);

			StringBuilder builder = new StringBuilder("Как здорово увидеть, как ");

			builder.append(adjectives[adjectiveIndex])
					.append(" ")
					.append(nouns[nounIndex])
					.append(" ")
					.append(verbs[verbIndex])
					.append("!");

			System.out.println((i + 1) + ". " + builder);
		}

		scanner.close();
	}
}
