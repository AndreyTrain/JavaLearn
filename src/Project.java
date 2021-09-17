import java.util.Scanner;

public class Project {
    public static void main(String[] args) {
        final double ROUBLES_PER_DOLLAR = 56.09;
        double roubles;
        int dollars, digitCad, digitRub;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите сумму денег в Канадских долларах: ");
        dollars = input.nextInt();

        System.out.print(dollars);

        if(dollars >= 5 && dollars <= 20)
            System.out.print(" канадских долларов равны ");
        else {
            digitCad = dollars % 10;

            if(digitCad == 1)
                System.out.print(" канадский доллар равен ");
            else if(digitCad >= 2 && digitCad <= 4)
                System.out.print(" канадских доллара равны ");
            else
                System.out.print(" канадских долларов равны ");
        }

        roubles = dollars * ROUBLES_PER_DOLLAR;

        System.out.print((int)(roubles * 100) / 100.0);

        digitRub = (int)roubles % 10;

        if(digitRub == 1)
            System.out.print(" рублю ");
        else
            System.out.print(" рублям ");

    }
}