package by.epam.lapin.main.ex9;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого.
 */

public class Task09 {
    public static void main(String[] args){

        int[] array1 = {1,2,3,4,5,6,7,8,9,10};
        int[] array2 = {-1,-2,-3,-4,-5};
        int[] array3 = new int[array1.length + array2.length];
        int k = 4;


        for (int i = 0; i < k; i++){
            array3[i] = array1[i];
        }

        for (int i = 0; i < array2.length ; i++){
            array3[i + k] = array2[i];
        }

        for(int i = k; i < array1.length; i++){
            array3[k + array2.length] = array1[i];
            k++;
        }


        for (int i = 0; i < array3.length; i++){
            System.out.print(array3[i] + " ");
        }





    }
}
