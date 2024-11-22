public class SingleLinked_List {
    public static void main(String[] args) {

    }

    public static int[] initiateList(int size) {
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

    public static int getElementByIndex(int[] arr, int index) {
        return arr[index];
    }

    public static int getListSize(int[] arr) {
        return arr.length;
    }
}
