package homework8;

import java.util.Random;
import java.util.Scanner;

public class GuessWords {
    static String[] fruitsAndVegetables = {"apple", "orange", "lemon", "banana", "apricot",
            "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon",
            "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut",
            "pear", "pepper", "pineapple", "pumpkin", "potato"};

    public static void main(String[] args) {
        guessWord();
    }

    public static void guessWord() {
        Random random = new Random();
        int randomIndex = random.nextInt(fruitsAndVegetables.length);
        String randomWord = fruitsAndVegetables[randomIndex];
        while (true) {
            Scanner scanner = new Scanner(System.in);
            String answer = scanner.nextLine();
            if (randomWord.equals(answer)) {
                System.out.println("Поздравляем, вы отгадали слово: \"" + answer + "\"!");
                break;
            }

/*Далее создаём массивы из букв загаданного слова и ответа, а также переменную, обозначающую
длину меньшего слова (из загаданного слова и ответа) - чтобы правильно провести сравнение
посимвольно в цикле и не выйти за пределы одного из двух массивов.
 */
            char[] unknownWord = randomWord.toCharArray();
            char[] answerWord = answer.toCharArray();
            int shorterWordLength = Math.min(randomWord.length(), answer.length());

            StringBuilder sb = new StringBuilder();
            //сперва посимвольно сравниваем загаданное слово и ответ
            for (int i = 0; i < shorterWordLength; i++) {
                if (unknownWord[i] == answerWord[i]) {
                    sb.append(unknownWord[i]);
                } else {
                    sb.append('#');
                }
            }
            //затем "дозаполняем" оставшуюся часть строки символами '#" и выводим в консоль
            for (int i = shorterWordLength; i < 15; i++) {
                sb.append('#');
            }
            System.out.println(sb.toString());
        }
    }
}
