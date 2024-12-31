package homework12;

public class ArrayValueCalculator {
        public static int doCalc(String[][] stringArr) {
        if (stringArr.length != 4) {
            throw new ArraySizeException("Array size must be 4x4. Current length is " + stringArr.length);
        }

        var intArr = new int[stringArr.length][stringArr[0].length];
        int sum = 0;
        for (int i = 0; i < stringArr.length; i++) {
            if (stringArr[i].length != 4) {
                throw new ArraySizeException("Array size must be 4x4. Length of " +
                        "row " + i + " is " + stringArr[i].length);
            }
            for (int j = 0; j < stringArr[i].length; j++) {
                try {
                    intArr[i][j] = Integer.parseInt(stringArr[i][j]);
                    int arrElement = intArr[i][j];
                    sum += arrElement;
                } catch (NumberFormatException e) {
                    throw new ArrayDataException("Ошибка! В ячейке [" + i + "][" + j + "] " +
                            "находятся неподходящие данные!", e);
                }
            }
        }
        return sum;
    }
}
