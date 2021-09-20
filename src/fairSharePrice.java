import java.util.*;
public class fairSharePrice {
    public static void main(String[] args) {
        double epsAverage, epsStart, epsEnd, growthRateEps, coefficient, projectedEps, peAverage,
              pe1, pe2, pe3, pe4, pe5, projectedSharePrice, rateOfReturn,
              fairSharePrice;
        int profitability;

        Scanner input = new Scanner(System.in);

        // Узнать текущую EPS
        System.out.print("Введите текущую EPS: ");
        epsEnd = input.nextDouble();

        // Узнать начальную EPS
        System.out.print("Введите начальную EPS: ");
        epsStart = input.nextDouble();

        // Рассчитать среднюю EPS
        epsAverage = epsEnd / epsStart;

        // Рассчитать темп роста EPS
        growthRateEps = ((Math.exp(Math.log(epsAverage)/4)) - 1) * 100;


        // Вывести темп роста EPS в % и запросить округлить в консервативную сторону
        System.out.println("Темп роста EPS составляет: " + (int)growthRateEps + "%");
        System.out.print("Округлите EPS в меньшую сторону: ");
        growthRateEps = input.nextDouble();

        // Рассчитать коэффициэнт роста EPS
        coefficient = growthRateEps / 100 + 1;

        // Рассчитать будующую EPS
        projectedEps = coefficient * epsEnd;

        // Узнать P/E за 5 лет и рассчитать средний P/E
        System.out.print("Введите через пробел P/E за последние 5 лет: ");
        pe1 = input.nextDouble();
        pe2 = input.nextDouble();
        pe3 = input.nextDouble();
        pe4 = input.nextDouble();
        pe5 = input.nextDouble();
        peAverage = (pe1 + pe2 + pe3 + pe4 + pe5) / 5;

        // Рассчитать будущую стоимость одной акции
        projectedSharePrice = projectedEps * peAverage;

        // Запросить желаемую доходность в % и рассчитать коэффициент
        System.out.print("Введите желаемую доходность: ");
        profitability = input.nextInt();
        rateOfReturn = Math.pow(((double)profitability / 100 + 1), 4);

        // Рассчитать вывести справедливую стоимость акции
        fairSharePrice = projectedSharePrice / rateOfReturn;
        System.out.print("Справедливая цена акции равна: " + (int)(fairSharePrice * 100) / 100.0
                + " руб.");

    }
}
