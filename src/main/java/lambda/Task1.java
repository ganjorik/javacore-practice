package lambda;

public class Task1 {
    public static void main(String[] args) {
        Thread thread = new Thread(
                () -> System.out.println("Hello World!")
        );
        thread.start();
    }
}
