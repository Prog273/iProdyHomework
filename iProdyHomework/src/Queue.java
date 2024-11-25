public class Queue {
    public static void main(String[] args) {

    }

    public static int[] initiateQueue(int size) {
        return new int[size];
    }

    public static int[] addElement(int[] arr, int newElement) {
        //создаём расширенную копию массива
        var enhancedArr = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            enhancedArr[i] = arr[i];
        }
        enhancedArr[enhancedArr.length - 1] = newElement;
        return enhancedArr;
    }

    public static int getElement(int[] arr) {
        return arr[arr.length - 1];
    }
}
