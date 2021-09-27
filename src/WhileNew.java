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



//import java.util.Scanner;
//
//public class WhileNew {
//    public static void main(String[] args) {
////        int theNumber, count_years, ratesOfGrowth, year;
////
////        theNumber = 9870;
////        year = 2021;
////        while (theNumber <= 30000) {
////            System.out.println("Численность населения в " + year + " году равна " + theNumber);
////            theNumber += (int)(theNumber / 100) * 10;
////            ++year;
////
////        }
////
////        year = year - 2021;
////
////        System.out.print("Численность населения превысит 30 000 человек через " +
////                year + " лет/года и составит приблизительно "  + theNumber
////                + " человек");
//        int p = 1, n;
//
//        Scanner input = new Scanner(System.in);
//
//        System.out.print("Введите значение n: ");
//
//        for (n = input.nextInt();
//             n > 0;
//             --n) {
//
//            p *= n;
//            System.out.println("n = " + n + " , " + "p = " + p);
//
//        }
//
//    }
//}


public class WhileNew {
    public static void main(String[] args) {
//        final int Sentinal = 0;
//        int x = 0, y = 0, meaning;
//
//        System.out.print("Введите число или введите 0 для завершения программы: ");
//        Scanner input = new Scanner(System.in);
//
//        meaning = input.nextInt();
//
//        while(meaning != Sentinal) {
//            if (meaning > 0) {
//                ++x;
//                System.out.println(meaning + " положительное число;");
//                System.out.println("Количество положительных чисел равно: " + x +
//                        "\n" + "Количество отрицательных чисел равно: " + y + "\n");
//                System.out.print("Введите следующее число или введите 0 для завершения программы: ");
//
//                meaning = input.nextInt();
//            } else {
//
//                ++y;
//                System.out.println(meaning + " отрицательное число;");
//                System.out.println("Количество положительных чисел равно: " + x +
//                        "\n" + "Количество отрицательных чисел равно: " + y + "\n");
//                System.out.print("Введите следующее число или введите 0 для завершения программы: ");
//
//                meaning = input.nextInt();
//            }
//
//            System.out.print("Вы ввели " + Sentinal + " работа программы завершена!");
//        }

//        // Напишите программу с интерактивным циклом проверки правильности ввода данных,
//        int x, y, z, v;
//
//        Scanner input = new Scanner(System.in);
//
//        do {
//            System.out.print("Введите два целых числа через пробел: ");
//            x = input.nextInt();
//            y = input.nextInt();
//
//            z = x % y;
//            v = y % x;
//
//            System.out.println(z + "  " + v);
//
//        } while ((x % y) != 0 && (y % x) != 0);
//        // считывающую пары целых чисел до тех пор, пока не встретит пару, в которой одно из чисел кратно другому.

        // Вложенные циклы (перебор значений)
//
//
//                for (int i = 1; i < 5; i++) {
//                    int j = 0;
//                    while (j < i) {
//                        System.out.print(j + " ");
//                        j++;
//                    }
//                }
//        int i = 0;
//        while (i < 5) {
//            for (int j = i; j > 1; j--)
//                System.out.print(j + " ");
//            System.out.println("****");
//            i++;
//        }
//        int i = 1;
//        do {
//            int num = 1;
//            for (int j = 1; j <= i; j++) {
//                System.out.print(num + "G" + "\t" + j);
//                num += 2;
//            }
//            System.out.println();
//            i++;
//        } while (i <= 5);
        int i = 1;

        do {
            int num = 0;
            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println(" ");
            i++;
        } while (i < 7);

        do {
            int num = 0;
            for (int j = 3; j <= i; j++) {
                System.out.print(num + " ");
                num += 1;
            }
            System.out.println(" ");
            i--;
        } while (i > 1);


    }
}