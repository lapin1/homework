package by.training.lapin.test.ex01test;

import by.training.lapin.main.task02.ex1.Task01;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceEverySecondTest2 {

    @Test
    public void replaceEverySecond2(){
        int[] realArray;
        int[] expectedArray = {1,0,3,0,5,0,7,0,9,0};

        realArray = Task01.replaceEverySecond(new int[]{1,2,3,4,5,6,7,8,9,10});
        Assert.assertArrayEquals(expectedArray,realArray);
    }
}
