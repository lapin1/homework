package by.training.lapin.main.task02.ex1;

import java.util.Scanner;

/*
Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него
каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание.
Дополнительный массив не использовать.
 */

public class Task01 {
    public static void main(String[] args) {

        int[] a;
        a = createArray(8);

        replaceEverySecond(a);
        compressArray(a);
        printArray(a);

    }

    public static int[] createArray(int size){
        Scanner sc = new Scanner(System.in);

        int[] array = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("Введите значение элемента array[" + i + "]: > ");
            while (!sc.hasNextInt()){
                System.out.print("Ошибка, повторите ввод: > ");
                sc.next();
            }
            array[i] = sc.nextInt();
        }
        return array;
    }

    public static int[] replaceEverySecond(int[] array){
        for (int i = 0; i < array.length; i++){
            if(i % 2 != 0){
                array[i] = 0;
            }
        }
        return array;
    }

    public static int[] compressArray(int[] array){
        int pos = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                if (pos < i) {
                    int tmp = array[i];
                    array[i] = array[pos];
                    array[pos] = tmp;
                }
                pos++;
            }
        }
        return array;
    }

    private static void printArray(int[] array){
        for (int i : array) {
            System.out.print(i + " ");
        }

    }
}
