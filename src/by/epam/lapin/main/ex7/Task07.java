package by.epam.lapin.main.ex7;

/*
Составить программу для вычисления значений функции  F(x)
на отрезке [а, b] с шагом h. Результат представить в виде
таблицы, первый столбец которой – значения  аргумента,
второй - соответствующие значения функции:
 */

public class Task07 {
    public static void main(String[] args){

        double a;
        double b;
        double h;
        double y;

        a = 1;
        b = 5;
        h = 0.1;

        System.out.println("_________________________");
        System.out.printf("|\t%4s\t|\t%4s\t|\n", "x", "y");
        System.out.println("_________________________");

        for(double x = a; x <= b; x = x + h){
            y = (Math.pow(Math.sin(x), 2) - Math.cos(2 * x));
            System.out.printf("|\t%4.1f\t|\t%4.1f\t|\n", x, y);
        }

        System.out.println("_________________________");


    }
}
