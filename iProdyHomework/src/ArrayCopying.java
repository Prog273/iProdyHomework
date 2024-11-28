import java.util.Arrays;

public class ArrayCopying {
    public static void main(String[] args) {
        int[] source = {1, 2, 3, 4};
        int[] target = {33, 44, 55};
        target = arrayCopy(source, target);
        System.out.println(Arrays.toString(target));
    }

    public static int[] arrayCopy(int[] source, int[] target) {
        if (target.length == 0) {
            target = source;
            return target;
        }
        if (source.length == 0) {
            return target;
        }

        int[] result = new int[source.length + target.length];
        //заполняем целевой массив сперва элементами массива target
        for (int i = 0; i < target.length; i++) {
            result[i] = target[i];
        }
        //... а затем добавляем элементы массива source
        for (int i = target.length; i < result.length; i++) {
            result[i] = source[i - target.length];
        }
        return result;
    }
}
