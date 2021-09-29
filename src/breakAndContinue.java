import java.util.Scanner;
public class breakAndContinue {
    public static void main(String[] args) {
//        boolean a = false;
//        int sum, number;
//
//        sum = 0;
//        number = 0;
//        while (number < 20 && !a) {
//            number++;
//            sum += number;
//            if (sum >= 100)
//                a = true;
//        }
//        System.out.println("Число равно " + number);
//        System.out.println("Сумма равна " + sum);
//        int sum, number;
//
//        sum = 0;
//        number = 0;
//        while (number < 20) {
//            number++;
//            if (number == 10 || number == 11) {
//
//            } else {
//                sum += number;
//            }
//        }
//        System.out.println("Сумма равна " + sum);
//        for (int i = 1; i < 4; i++) {
//            for (int j = 1; j < 4; j++) {
//                if (i * j > 2)
//                    break;
//                System.out.println(i * j);
//            }
//            System.out.println(i);
//        }
//        for (int i = 1; i < 4; i++) {
//            for (int j = 1; j < 4; j++) {
//                if (i * j > 2)
//                    continue;
//                System.out.println(i * j);
//            }
//            System.out.println(i);
//        }

//        String s;
//        int low, high;
//        boolean isPalindrome;
//
//        Scanner input = new Scanner(System.in);
//
//        // Получить строку
//        System.out.print("Введите строку без пробелов: ");
//        s = input.nextLine();
//
//        // Инициализировать индекс начала строки
//        low = 0;
//
//        // Инициализировать индекс конца строки
//        high = s.length() - 1;
//
//        // Проверить строку на палиндром
//        isPalindrome = true;
//        while (low <= high) {
//            if (s.charAt(low) != s.charAt(high)) {
//                isPalindrome = false;
//                break;
//            }
//            low++;
//            high--;
//        }
//
//        // Отобразить, является ли строка палиндромом
//        if (isPalindrome)
//            System.out.println(s + " является палиндромом");
//        else
//            System.out.println(s + " не является палиндромом");
                boolean revers = true;
                String s;
                int low, high;

                System.out.print("Введите строку: ");

                Scanner input = new Scanner(System.in);

                s = input.nextLine();

                low = 0;
                high = s.length() - 1;

                while (low <= high) {
                    System.out.print(s.charAt(high));
                    high--;
                }

                System.out.print("\n" + "The end");

            }
        }
