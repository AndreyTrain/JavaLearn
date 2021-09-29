import java.time.LocalDate;
import java.util.Scanner;
public class DepositInterest {
    static final int DAYS_YEAR = 365;
    static final int MONTH_OF_YEAR = 12;
    public  static void main(String[] args) {
        int term, month, year;
        double interest, sumDeposit, monthlyIncome;
        double totalIncome = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Введите номер месяца открытия вклада: ");
        month = input.nextInt();

        System.out.print("Введите номер года открытия вклада: ");
        year = input.nextInt();

        System.out.print("Введите срок вклада в месяцах: ");
        term = input.nextInt();

        System.out.print("Введите процентную ставку по вкладу: ");
        interest = input.nextDouble();

        System.out.print("Введите сумму вклада в рублях: ");
        sumDeposit = input.nextDouble();

        int i = year;
        int monthCounter = 0;

        while (monthCounter < term) {
            for (int j = 1; j <= MONTH_OF_YEAR; j++) {
                if (i == year && j <= month) {
                    continue;
                }
                if (monthCounter == term) {
                    break;
                }

                int lengthOfMonth = LocalDate.of(i, j, 1).lengthOfMonth();
                monthlyIncome = (sumDeposit / 100) * interest / DAYS_YEAR * lengthOfMonth;
                monthlyIncome = Math.round(monthlyIncome * 100) / 100.0;

                System.out.println("Сумма процентов по депозиту за " + i + " год " + j
                        + " месяц составляет: " + monthlyIncome);

                totalIncome = totalIncome + monthlyIncome;

                monthCounter++;
            }

            i++;
        }

        totalIncome = Math.round(totalIncome * 100) / 100.0;

        System.out.print("Общая сумма процентов за указанный период составляет: " + totalIncome + " руб.");
    }
}
