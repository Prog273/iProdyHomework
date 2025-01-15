package homework17;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String[] strings = {"a", "b", "c", "d"};
        String[] strings2 = {"a", "b", "c", "d", "e"};
        Integer[] integers = {1, 2, 3, 4, 5, 6, 7, 8};
        Integer[] integers2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        ArrayUtils.changePairs(strings);
        ArrayUtils.changePairs(strings2);
        ArrayUtils.changePairs(integers);
        ArrayUtils.changePairs(integers2);

        System.out.println(Arrays.toString(strings));
        System.out.println(Arrays.toString(strings2));
        System.out.println(Arrays.toString(integers));
        System.out.println(Arrays.toString(integers2));
    }
}
