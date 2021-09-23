import java.lang.reflect.Method;
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


    }

}
