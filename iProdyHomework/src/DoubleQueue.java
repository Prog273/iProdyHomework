import java.util.Arrays;

public class DoubleQueue {
    public static void main(String[] args) {
        int[] doubleQueue = initiateDoubleQueue(8);
        doubleQueue = addHeadElement(doubleQueue, 4);
        System.out.println(Arrays.toString(doubleQueue));
    }

    public static int[] initiateDoubleQueue(int size) {
        return new int[size];
    }

    public static int[] addHeadElement(int[] arr, int headElement) {
        //создаём расширенную копию массива и добавляем элемент в голову очереди
        var enhancedArr = new int[arr.length + 1];
        for (int i = 1; i < enhancedArr.length; i++) {
            enhancedArr[i] = arr[i - 1];
        }
        enhancedArr[0] = headElement;
        return enhancedArr;
    }

    public static int getHeadElement(int[] arr) {
        return arr[0];
    }

    public static int[] addTailElement(int[] arr, int tailElement) {
        //создаём расширенную копию массива
        var enhancedArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            enhancedArr[i] = arr[i];
        }
        enhancedArr[enhancedArr.length - 1] = tailElement;
        return enhancedArr;
    }

    public static int getTailElement(int[] arr) {
        return arr[arr.length - 1];
    }
}
