package by.epam.lapin.main.ex3;

/*
Вычислить периметр и площадь прямоугольного треугольника по длинам а и b  двух катетов.
 */

public class Task03 {
    public static void main(String[] args){

        double a = 9;
        double b = 7;

        double c;  //гипотенуза(для перимтера)

        double p;
        double s;

        c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));

        p = a + b + c;
        s = a * b / 2;

        System.out.println("периметр: " + p);
        System.out.println("площадь: " + s);

    }
}
