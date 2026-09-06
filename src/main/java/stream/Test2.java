package stream;

import java.util.stream.Stream;

public class Test2 {
    public static void main(String[] args) {
        long res = Stream.of("a1", "a2", "a3").filter("a1"::equals).count();
        System.out.println(res);
    }
}
