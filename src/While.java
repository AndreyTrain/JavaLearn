
import java.util.Scanner;

public class While {
    public static void main(String[] args) {
      int i = 0, even = 0, n = 8, a = 0, b = 1;
        while (i <= 5) {
            System.out.println( i + " " + (10 - i));
            ++i;
        }

        while (even < n) {
            System.out.println(even);
            even += 2;
        }

        while (a < 7) {
            System.out.println(a + " " + b);
            ++a;
            b *= 2;

        }

      int amount, x, y;

      Scanner input = new Scanner(System.in);

      System.out.print("Введите целое число: ");
      x = input.nextInt();

      y = 1;
      amount = 0;


      while(y <= x) {
        amount = amount + y;
        System.out.print(y);
        ++y;

        if (y <= x) {
          System.out.print(" + ");
        }

        }

      if (amount != (x * (x + 1)) / 2) {
        System.out.println( " != " + "(" + x + " * " + "(" + x + " + 1)) / 2)");
        System.out.print("Сумма левой части выражения равна: " + amount);
      } else {
        System.out.println(" = " + "(" + x + " * " + "(" + x + " + 1)) / 2)");
        System.out.print("Сумма равна: " + amount);
      }

    }

}
