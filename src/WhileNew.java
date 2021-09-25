//import java.util.Scanner;
//public class WhileNew {
//    public static void main(String[] args) {
//        int number1, number2, answer;
//
//            Scanner input = new Scanner(System.in);
//
//            // Сгенерировать два случайных целых числа number1 и number2
//            number1 = (int)(Math.random() * 10);
//            number2 = (int)(Math.random() * 10);
//
//            // Получить ответ на вопрос "Сколько будет number1 + number2?"
//            System.out.print(
//                    "Сколько будет " + number1 + " + " + number2 + "? ");
//            answer = input.nextInt();
//
//            // До тех пор, пока ответ неправильный, запрашивать новый ответ
//            while (number1 + number2 != answer) {
//                System.out.println("Неправильный ответ. Попробуйте еще раз. ");
//                System.out.print("Сколько будет " + number1 + " + " + number2 + "? ");
//                answer = input.nextInt();
//            }
//            System.out.println("Вы угадали!");
//        }
//
//}

//import java.util.Scanner;
//
//public class WhileNew {
//    public static void main(String[] args) {
//        int n, product;
//
//        Scanner input = new Scanner(System.in);
//
//        product = 1;
//        while (product < 10000) {
//            // Отобразить произведение
//            System.out.println(product);
//            // Получить целое число
//            System.out.print("Введите целое число: ");
//            n = input.nextInt();
//            // Обновить произведение
//            product *= n;
//        }
//    }
//}

import java.util.Scanner;

import java.util.Scanner;

public class WhileNew {
    public static void main(String[] args) {
        int theNumber, count_years, ratesOfGrowth, year;

        theNumber = 9870;
        year = 2021;
        while (theNumber <= 30000) {
            System.out.println("Численность населения в " + year + " году равна " + theNumber);
            theNumber += (int)(theNumber / 100) * 10;
            ++year;

        }

        year = year - 2021;

        System.out.print("Численность населения превысит 30 000 человек через " +
                year + " лет/года и составит приблизительно "  + theNumber
                + " человек");


    }
}