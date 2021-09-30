package by.epam.lapin.main.ex4;

/*
Для данных областей составить линейную программу,
которая печатает true, если точка с координатами (х, у)
принадлежит закрашенной области, и false — в противном случае:
 */

public class Task4 {
    public static void main(String[] args){

        int xPoint = 0;
        int yPoint = -1;

        int x1 = 2;
        int y1 = 4;
        int x2 = -2;
        int y2 = 4;
        int x3 = -4;
        int y3 = -3;
        int x4 = 4;
        int y4 = -3;

        if(xPoint <= x1 && yPoint <= y1 || xPoint >= x2 && yPoint <= y2 || xPoint >= x3 && yPoint >= y3 || xPoint <= x4 && yPoint >= y4 ){
            System.out.println(true);
        } else System.out.println(false);

    }
}
