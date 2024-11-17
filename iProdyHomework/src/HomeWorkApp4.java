import java.util.Arrays;

public class HomeWorkApp4 {
    public static void main(String[] args) {
    }

    public static void switchZerosAndOnes(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillAndPrintArray() {
        var arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] changeElements(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
        return arr;
    }

    public static void changeMatrix(int[][] matrix) {
        //заполняем главную диагональ и выводим в консоль
        for (int i = 0; i < matrix.length; i++) {
            matrix[i][i] = 1;
        }
        System.out.println(Arrays.deepToString(matrix));

        //заполняем главную и дополнительную диагональ и выводим в консоль
        int count = 0;
        int i = matrix.length - 1;
        int j = 0;
        while (count < matrix.length) {
            matrix[i][j] = 1;
            count++;
            i--;
            j++;
        }
        System.out.println(Arrays.deepToString(matrix));
    }

    public static int[] fillArray(int len, int initValue) {
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = initValue;
        }
        return arr;
    }

    public static void printMinAndMaxElements(int[] arr) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            //сперва сделал через последовательное сравнение переменных min и max c
            //элементами массива, но Idea подсказала такое решение, больше понравилось
            max = Math.max(max, arr[i]);
            min = Math.min(min, arr[i]);
        }
        System.out.println("Max element of array: " + max);
        System.out.println("Min element of array: " + min);
    }

    public static boolean isArrayBalanced(int[] arr) {
        if (arr.length == 1) {
            return false;
        }

        for (int i = 1; i < arr.length; i++) {
            //находим сумму элементов массива слева arr[i]
            int firstPartSum = 0;
            for (int j = 0; j < i; j++) {
                firstPartSum += arr[j];
            }
            //находим сумму элементов массива справа, включая arr[i]
            int secondPartSum = 0;
            for (int k = i; k < arr.length; k++) {
                secondPartSum += arr[k];
            }

            if (firstPartSum == secondPartSum) return true;
        }
        return false;
    }
}