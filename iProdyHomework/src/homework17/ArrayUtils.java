package homework17;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Необходимо реализовать метод, который принимает в качества параметра массив (массив может
 * быть любого ссылочного типа) и меняет каждую пару элементов местами между собой. Метод
 * работает с массивом по ссылке, а значит ничего не возвращает.
 */
public class ArrayUtils {
    public static <T> void changePairs(T[] array) {
        if (array.length == 0 || array.length == 1) return;

        if (array.length % 2 == 0) {
            for (int i = 1; i < array.length; i = i + 2) {
                T temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        } else {
            for (int i = 1; i < array.length - 1; i = i + 2) {
                T temp = array[i];
                array[i] = array[i - 1];
                array[i - 1] = temp;
            }
        }
    }
    /**
     * Необходимо реализовать метод, который принимает в качества параметра массив (массив может быть любого
     * ссылочного типа) и преобразовывает его в List (должен обладать таким же типом данных, как и переданный в
     * качестве параметра массив). Результатом выполнения операция является экземпляр List возвращаемый после вызова метода.
     */
    public static <T> List<T> arrayToList(T[] array) {
        if (array.length == 0) return Collections.emptyList();
        List<T> list = new ArrayList<>(Arrays.asList(array));
        return list;
    }
}
