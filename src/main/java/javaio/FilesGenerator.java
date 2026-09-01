package javaio;

import java.io.*;
import java.util.Scanner;

public class FilesGenerator {
	public static void main(String[] args) throws IOException {
		File dir = new File("d:/test");
		dir.mkdir();

		for (int i = 0; i < 20; i++) {
			File f = new File(dir, "test_" + i + ".txt");
			f.createNewFile();
			try (OutputStream os = new FileOutputStream(f);
			BufferedOutputStream bos = new BufferedOutputStream(os)) {
				bos.write(("Java " + i).getBytes());
			}
		}

		for (File f : dir.listFiles()) {
			try (FileReader fr = new FileReader(f);
				 Scanner sc = new Scanner(fr)) {
				while (sc.hasNextLine()) {
					if (sc.nextLine().equals("Java 7"))
						System.out.println("Я нашел этот файл: " + f.getName());
				}
			}
		}

		/*for (File f : dir.listFiles()) {
			System.out.println(f.getName());
		}*/
	}
}
