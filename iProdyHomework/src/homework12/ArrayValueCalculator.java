package homework12;

public class ArrayValueCalculator {
    public static void main(String[] args) {
        String[][] stringArr = {{"1", "2", "3", "4"}, {"5", "6", "7", "8"}, {"9", "10", "11", "12"}, {"13", "14", "15", "16"}};
        try {
            var sum = doCalc(stringArr);
            System.out.println(sum);
        } catch (ArraySizeException e) {
            System.out.println("Ошибка! Неправильный размер массива!");
        } catch (ArrayDataException e) {
            //Подскажи, пожалуйста, как здесь детализировать, в какой именно ячейке ошибка. В методе doCalc мог это сделать,
            // так как там проходил циклом по массиву, а тут не знаю как
            System.out.println("Ошибка! В одной из ячеек массива находятся неподходящие данные!");
        }

    }

    public static int doCalc(String[][] stringArr) throws ArraySizeException, ArrayDataException {
        if (stringArr.length != 4 || stringArr[0].length != 4) {
            throw new ArraySizeException("Ошибка! Неправильный размер массива!");
        }

        var intArr = new int[stringArr.length][stringArr[0].length];
        int sum = 0;
        for (int i = 0; i < stringArr.length; i++) {
            for (int j = 0; j < stringArr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(stringArr[i][j]);
                    int arrElement = intArr[i][j];
                    sum += arrElement;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Ошибка! В ячейке [" + i + "][" + j + "] находятся неподходящие данные!");
                }
            }
        }
        return sum;
    }
}
