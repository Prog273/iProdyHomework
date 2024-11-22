public class Queue {
    public static void main(String[] args) {

    }

    public static int[] initiateQueue(int size) {
        return new int[size];
    }

    public static void addElement(int[] arr, int newElement) {
        //создаём расширенную копию массива
        var enhancedArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            enhancedArr[i] = arr[i];
        }
        enhancedArr[enhancedArr.length - 1] = newElement;
        //присваиваем переменной arr ссылку на расширенный массив
        arr = enhancedArr;
    }

    public static int getElement(int[] arr) {
        //создаём уменьшенную на 1 копию исходного массива
        var reducedArr = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            reducedArr[i] = arr[i];
        }
        //присваиваем переменной arr ссылку на "урезанный" массив и возвращаем взятый элемент
        int lastElement = arr[arr.length - 1];
        arr = reducedArr;
        return lastElement;
    }
}
