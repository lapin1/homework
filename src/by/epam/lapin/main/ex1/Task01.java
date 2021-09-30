package by.epam.lapin.main.ex1;

/*
Составить линейную программу, печатающую значение true,
если указанное высказывание является истинным, и false — в противном случае:

Сумма двух первых цифр заданного четырехзначного числа
равна сумме двух его последних цифр.

 */

public class Task01 {
    public static void main(String[] args){

        int number = 1234;

        int a = number / 1000;
        int b = number / 100 % 10;
        int c = number / 10 % 10;
        int d = number % 10;


        System.out.println(a + b == c + d);



    }
}
