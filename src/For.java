
public class For {
    public static void main(String[] args) {
        int odd, sum, n = 8, i, j;

        sum = 0;
        for (odd = 1; odd < n; odd += 2) {
            sum += odd;
            System.out.println(odd + " " + sum);
        }

        System.out.println(odd + " " + sum);

        j = 10;
        for (i = 0; i <= 5; ++i) {
            System.out.println(i + " " + j);
            j -= 2;
        }

    }
}
