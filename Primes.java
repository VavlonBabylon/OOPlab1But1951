public class Primes {


    /*Создание метода с циклом с 2 до 100 интераций для вывода чисел. Метод
    основывается на результатах другого метода isPrime для принятия решения о том простое ли число или нет
    */
    public static void main(String[] args) {
        String printNumbers = "";
        for (int i = 2; i <= 100; i++) {
            boolean resultpr = isPrime(i);
            if (resultpr) {
                printNumbers = printNumbers + i + " ";
            }
        }
        System.out.println("Простые числа: ");
        System.out.println(printNumbers);
    }

    /*Метод необходимый для определения является ли число из цикла метода main простым и нужно ли его записывать.
    Возвращает двоичное число
    */

    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++) {
            if (n%i == 0) {
                return false;
            }
        }
        return true;
    }
}