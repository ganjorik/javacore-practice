package concurrent;

public class ThreadExample extends Thread {

	public ThreadExample(String name) {
		super(name);
	}

	@Override
	public void run() {
		System.out.println("ThreadClass run() method " + "Thread name is: " + this.getName());
	}

	public static void main(String[] args) {
		ThreadExample threadClass1 = new ThreadExample("Поток 1");
		threadClass1.start();
		ThreadExample threadClass2 = new ThreadExample("Поток 2");
		threadClass2.start();
		ThreadExample threadClass3 = new ThreadExample("Поток 3");
		threadClass3.start();


	}
}
