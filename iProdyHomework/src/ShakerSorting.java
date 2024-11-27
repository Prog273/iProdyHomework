import java.util.Arrays;

public class ShakerSorting {
    public static void main(String[] args) {
        var unsortedArr = new int[]{3, -55, 43, 2, 544, -5, 88, 0, 1234, -345};
        doShakerSorting(unsortedArr);
        System.out.println(Arrays.toString(unsortedArr));
    }

    //честно скажу, что просто по описанию алгоритма не смог понять, как реализовать повторные проходы
    // направо и налево, понимал, только как один раз пройти в обе стороны
    //только прочитав псевдокод алгоритма, понял, что нужны индексы left и right, а также цикл while
    public static void doShakerSorting(int[] arr) {
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        var iterations = 0;

        while (leftIndex < rightIndex) {
            //проходим слева-направо и уменьшаем индекс справа
            for (int i = 0; i < rightIndex; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
                iterations++;
            }
            rightIndex--;
            //проходим справа-налево и увеливаем индекс слева
            for (int j = rightIndex; j > leftIndex; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
                iterations++;
            }
            leftIndex++;
        }
        System.out.println("Number of iterations: " + iterations);
    }
}
