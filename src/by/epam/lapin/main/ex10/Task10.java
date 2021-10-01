package by.epam.lapin.main.ex10;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 */

public class Task10 {
    public static void main(String[] args){

        int[][] array = new int[4][4];

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                array[i][j] = j + 1;
            }
        }

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                if(i % 2 != 0){
                    array[i][j] = array.length - j;
                }
            }
        }

        for (int i = 0; i < array.length; i++){
            for(int j = 0; j < array.length; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }


    }
}
