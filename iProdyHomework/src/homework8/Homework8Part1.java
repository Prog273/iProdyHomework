package homework8;

public class Homework8Part1 {
    public static void main(String[] args) {

    }

    public static int findSymbolOccurance(String string, char ch) {
        int count = 0;
        for (int i = 0; i < string.length(); i++) {
            count = string.charAt(i) == ch ? count + 1 : count;
        }
        return count;
    }

    public static int findWordPosition(String source, String target) {
        return source.indexOf(target);
    }

    public static String stringReverse(String str) {
        char[] chars = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = chars.length - 1; i >= 0; i--) {
            sb.append(chars[i]);
        }
        String reversedString = sb.toString();
        return reversedString;
    }

    public static boolean isPalindrome(String str) {
        if (str.isEmpty()) return false;
        String reversedString = stringReverse(str);
        return str.equals(reversedString);
    }
}
