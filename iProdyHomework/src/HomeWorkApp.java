public class HomeWorkApp {
    public static void main(String[] args) {
    }

    public static void printThreeWords() {
        System.out.println("Orange\nBanana\nApple");
    }

    public static void checkSumSign() {
        int a = 92;
        int b = -194;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    public static void printColor() {
        int value = 44;
        if (value <= 0) {
            System.out.println("Красный");
        } else if (value <= 100) {
            System.out.println("Жёлтый");
        } else {
            System.out.println("Зелёный");
        }
    }

    public static void compareNumbers() {
        int a = 23;
        int b = 35;
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static boolean isSumBetween10And20(int firstNumber, int secondNumber) {
        int sum = firstNumber + secondNumber;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else {
            return false;
        }
    }

    public static void checkNumber(int number) {
        String answer = number >= 0 ? "Число положительное" : "Число отрицательное";
        System.out.println(answer);
    }

    public static boolean isNumberNegative(int number) {
        boolean answer = number < 0 ? true : false;
        return answer;
    }

    public static void printStrings(String string, int number) {
        if (number <= 0) {
            System.out.println("Ошибка: число строк должно быть положительным");
        } else {
            for (int i = 0; i < number; i++) {
                System.out.println(string);
            }
        }
    }

    public static boolean isYearIntercalary(int year) {
        if (year <= 0) {
            System.out.println("Ошибка: год должен быть положительным");
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
