package by.epam.lapin.main.ex5;

/*
Даны три действительных числа.
Возвести в квадрат те из них, значения
 которых неотрицательны, и в четвертую степень — отрицательные
 */

public class Task05 {
    public static void main(String[] args){

        int a = 10;
        int b = -5;
        int c = -4;

        if(a >= 0){
            System.out.println(Math.pow(a,2));
        }else System.out.println(Math.pow(a,4));

        if(b >= 0){
            System.out.println(Math.pow(b,2));
        }else System.out.println(Math.pow(b,4));

        if(c >= 0){
            System.out.println(Math.pow(c,2));
        }else System.out.println(Math.pow(c,4));


    }
}
