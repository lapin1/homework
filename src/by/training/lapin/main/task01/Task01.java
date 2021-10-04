package by.training.lapin.main.task01;

import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное).
 */

public class Task01 {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int[][] array;
        int size;

        // проверка ввода данных
        do {
            System.out.print("Введите размерность массива (четное число): > ");
            while (!sc.hasNextInt()){
                System.out.print("Ошибка, повторите ввод: > ");
                sc.next();
            }
            size = sc.nextInt();
        }while(size % 2 != 0);

        array = new int[size][size];

        fillArray(array);
        rotateOdd(array);
        printArray(array);
    }


    // заполняем массив
    private static void fillArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = j + 1;
            }
        }
    }

    // формируем по образцу (строки с нечетными индексами выводятся в обратном порядке)
    private static void rotateOdd(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                if(i % 2 != 0){
                    array[i][j] = array.length - j;
                }
            }
        }
    }

    // выводим массив на экран
    private static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }

    }
}
