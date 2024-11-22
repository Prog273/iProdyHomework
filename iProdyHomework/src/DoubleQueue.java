public class DoubleQueue {
    public static void main(String[] args) {

    }

    public static int[] initiateDoubleQueue(int size) {
        return new int[size];
    }

    public static void addHeadElement(int[] arr, int headElement) {
        //создаём расширенную копию массива и добавляем элемент в голову очереди
        var enhancedArr = new int[arr.length + 1];
        for (int i = 1; i < enhancedArr.length; i++) {
            enhancedArr[i] = arr[i - 1];
        }
        enhancedArr[0] = headElement;
        //присваиваем переменной arr ссылку на расширенный массив
        arr = enhancedArr;
    }

    public static int getHeadElement(int[] arr) {
        //создаём уменьшенную на 1 копию исходного массива
        var reducedArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            reducedArr[i] = arr[i + 1];
        }
        //присваиваем переменной arr ссылку на "урезанный" массив и возвращаем взятый из головы элемент
        int headElement = arr[0];
        arr = reducedArr;
        return headElement;
    }

    public static void addTailElement(int[] arr, int tailElement) {
        //создаём расширенную копию массива
        var enhancedArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            enhancedArr[i] = arr[i];
        }
        enhancedArr[enhancedArr.length - 1] = tailElement;
        //присваиваем переменной arr ссылку на расширенный массив
        arr = enhancedArr;
    }

    public static int getTailElement(int[] arr) {
        //создаём уменьшенную на 1 копию исходного массива
        var reducedArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            reducedArr[i] = arr[i];
        }
        //присваиваем переменной arr ссылку на "урезанный" массив и возвращаем взятый элемент
        int tailElement = arr[arr.length - 1];
        arr = reducedArr;
        return tailElement;
    }
}
