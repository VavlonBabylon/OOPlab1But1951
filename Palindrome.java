import java.util.Scanner; // Подключение библиотек со сканером для считывания с командной строки в дальнейшем


public class Palindrome {
    //В главном методе main будет записываться слово и сравниваться со своим инверсным "собратом", который создается ниже.
    public static void main(String[] args) {
        System.out.println("Введите слово для анализа");
        Scanner in = new Scanner(System.in);
        String inputString = in.nextLine();;
        boolean resultpalindrom = isPalindrome(inputString);
        if (resultpalindrom == false) {
            System.out.println("Слово не является палиндромом");
        } else {
            System.out.println("Слово является палиндромом");
        }

    }
    // Метод, в котором инвертируется слово путем перебора его символов и записи в новую переменную
    public static String reverseString (String inputString){
        int stringLength = inputString.length();
        String result = "";
        for (int i = 0; i < stringLength; i++) {
            result = inputString.charAt(i) + result;
        }
        return result;
    }
// Метод, производящий сравнение слов для создания логической переменной, значения которой определят является ли слово палиндромом или нет
    public static boolean isPalindrome (String inputString){
        return inputString.equals(reverseString(inputString));
    }
}
