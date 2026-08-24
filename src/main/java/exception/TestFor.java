package exception;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFor {

	public static void main(String[] args) {
		readFile();
	}

	public static void readFile() {
		try {
			BufferedReader fin = new BufferedReader(new FileReader("d:/Main.java"));
			String line;
			while ((line = fin.readLine()) != null)
				System.out.println(line);
		} catch (IOException e) {
			throw new MyException("Путь указан неверно", "d:/Main.java");
		}


	}
}
