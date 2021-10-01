package by.epam.lapin.main.ex6;

/*
Написать программу нахождения суммы большего и меньшего из трех чисел.
 */

public class Task06 {
    public static void main(String[] args){

        int a = 2000;
        int b = 3000;
        int c = -100;

        int max;
        int min;
        int sum;

        // max
        if(a >= b){
            max = a;
        }else max = b;
        if(max >= c){
            System.out.println("max: " + max);
        }else {
            max = c;
            System.out.println("max: " + max);
        }

        // min
        if(a <= b){
            min = a;
        }else min = b;
        if(min <= c){
            System.out.println("min: " + min);
        }else {
            min = c;
            System.out.println("min: " + min);
        }

        sum = min + max;

        System.out.println("Сумма минимального и максимального: " + sum);


    }
}
