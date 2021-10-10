package by.training.lapin.test.ex01test;

import by.training.lapin.main.task02.ex1.Task01;
import org.junit.Assert;
import org.junit.Test;

public class ReplaceEverySecondTest1 {

    @Test
    public void replaceEverySecond1(){
        int[] realArray;
        int[] expectedArray = {1,0,3,0};

        realArray = Task01.replaceEverySecond(new int[]{1,2,3,4});
        Assert.assertArrayEquals(expectedArray,realArray);
    }

}
