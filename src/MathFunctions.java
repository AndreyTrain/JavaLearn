import java.util.*;

public class MathFunctions {
    public static void main(String[] args) {
    final double PI = 3.14159265359;
    double x, y, z, w;
    int a, b;

    // Преобразует 47 градусов в радианы
    x = Math.toRadians(47);
    System.out.println(x);

    // Преобразует число π в угол в градусах
    y = PI / 180;
    z = Math.toDegrees(y);
    System.out.println(z);

    // Генерирует случайное целое число от 34 до 55
    a = 34 + (int)(Math.random() * 23);
    System.out.println(a);

    // Генерирует случайное целое число от 0 до 999
    Random random = new Random();
    b = random.nextInt(999);
    System.out.println(b);

    // Генерирует случайное число от 5.5 до 55.5
    w = 5.5 + Math.random() * 50;
    System.out.printf(Locale.ENGLISH, "%(.1f%n", w);

    // Что возвращается следующими методами
    System.out.println(Math.log(Math.exp(5.5)));
    System.out.println(Math.exp(Math.log(5.5)));
    System.out.println(Math.asin(Math.sin(Math.PI / 6)));
    System.out.println(Math.sin(Math.asin(Math.PI / 6)));

    }
}
