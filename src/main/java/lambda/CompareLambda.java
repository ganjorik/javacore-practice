package lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CompareLambda {
    public static void main(String[] args) {
        String[] s1 = new String[]{"Hello", "World", "eefe", "dsjs", "dsja", "dshcs", "hgf"};
        String[] s2 = new String[]{"Hello", "World", "eefe", "dsjs"};
        String[] s3 = new String[]{"Hello", "World", "eefe", "dsjs", "dsja", "dshcs"};
        String[] s4 = new String[]{"Hello"};
        String[] s5 = new String[]{"Hello", "World", "eefe", "dsjs", "dsja"};

        List<String[]> arrays = new ArrayList<>();
        arrays.add(s1);
        arrays.add(s2);
        arrays.add(s3);
        arrays.add(s4);
        arrays.add(s5);

        arrays.sort((o1, o2) -> o2.length -  o1.length);

        for (String[] arr : arrays) {
            System.out.println(Arrays.toString(arr));
        }


    }
}
