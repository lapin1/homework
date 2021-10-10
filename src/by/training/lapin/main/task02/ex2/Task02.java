package by.training.lapin.main.task02.ex2;

/*
 Получить действительную квадратную матрицу порядка n:
 */

public class Task02 {
    public static void main(String[] args){

        int[][] array;
        array = createArray(5);

        multiplyArray(array);
        printArray(array);

    }

    public static int[][] createArray(int size){
        int[][] array = new int[size][size];
      for (int i = 0; i < array.length; i++){
          for (int j = 0; j < array[i].length; j++){
              array[i][j] = j + 1;
          }
      }
        return array;
    }

    public static int[][] multiplyArray(int[][] array){
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                array[i][j] = (int) Math.pow(array[i][j], i + 1);
            }
        }
        return array;
    }

    public static void printArray(int[][] array){
        for(int i = 0; i < array.length; i++){
            for (int j = 0; j < array[i].length; j++){
                System.out.printf("[%6d]", array[i][j]);
            }
            System.out.println();
        }
    }
}
