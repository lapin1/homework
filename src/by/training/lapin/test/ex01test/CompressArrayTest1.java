package by.training.lapin.test.ex01test;

import by.training.lapin.main.task02.ex1.Task01;
import org.junit.Assert;
import org.junit.Test;

public class CompressArrayTest1 {

    @Test
    public void compressArray1(){
        int[] realArray;
        int[] expectedArray = {1,3,0,0};

        realArray = Task01.compressArray(new int[]{1,0,3,0});
        Assert.assertArrayEquals(expectedArray,realArray);
    }

}
