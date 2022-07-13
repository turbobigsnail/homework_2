public class Main {
    //задача 1
    public static void main(String[] args) {
        byte A = 1;
        int AA = 4;
        long AAA = 8L;

        float B = 4.4444444f;
        double BB = 8.8888888888888888;

        char C = '2';

         boolean F = true ;

         //задача 2

        System.out.println("     задача 2 ");

        float Boxer_1 = 78.2f;
        float Boxer_2 = 82.7f;

        float Sum = Boxer_1 + Boxer_2;

        float Diff = Boxer_1 - Boxer_2;

        System.out.println("Общая масса боксёров = "  + Sum);
        System.out.println("Разница в массе боксёров = "  +  Diff);

        //задача 3

        System.out.println("     задача 3 ");


        float banana = 80f;
        float milk = 105f;
        float iceCream = 100f;
        float egg = 70f;

        float weightAll = (banana * 5) + (milk * 2) + (iceCream * 2) + (egg * 4);

        float Kg = weightAll / 1000;

        System.out.println("Масса завтрака составляет " + Kg + " килограмм");

        //задача 4

        System.out.println("     задача 4 ");

        float X, Y, ALL;

        X = 250;

        Y = 500;

        ALL = 7000;

        float day250 = ALL  / X;
        float day500 = ALL / Y;
        float average = (day250 + day500) / 2;




        System.out.println("если будет худеть по " + X + " грамм, то уйдёт " + day250 + " дней");
        System.out.println("если будет худеть по " + Y + " грамм, то уйдёт " + day500 + " дней");
        System.out.println("в среднем будет худеть дней: " + average );

        // задача 5

        System.out.println("      задача 5 ");

        double M, D, K;

        M = 67_760;
        D = 83_690;
        K = 76_230;

        double overload = 1.1;

        double newSalary_M = M * overload;

        double newSalary_D = D * overload;

        double newSalary_K = K * overload;

        double newSalaryPerYear_M = (newSalary_M - M) * 12 ;
        double newSalaryPerYear_D = (newSalary_D - D) * 12;
        double newSalaryPerYear_K = (newSalary_K - K) * 12;

        System.out.println("Маша теперь получает " + newSalary_M + " рублей. Годовой доход вырос на " + newSalaryPerYear_M + " рублей");

        System.out.println("Дима теперь получает " + newSalary_D + " рублей. Годовой доход вырос на " + newSalaryPerYear_D + " рублей");

        System.out.println("Катя теперь получает " + newSalary_K + " рублей. Годовой доход вырос на " + newSalaryPerYear_K + " рублей");

















    }
}