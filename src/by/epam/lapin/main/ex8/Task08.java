package by.epam.lapin.main.ex8;

/*
В массив A [N] занесены натуральные числа.
Найти сумму тех элементов, которые кратны данному К.
 */

public class Task08 {
    public static void main(String[] args){

        int[] array = {1,2,3,4,5,6,7,8,9,10};

        int k = 2;
        int sum = 0;

        for (int i : array) {
            if (i % k == 0) {
                sum += i;
            }
        }

        System.out.println("Сумма чисел, кратных k = " + sum);

    }
}
