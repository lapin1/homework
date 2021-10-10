package by.training.lapin.test.ex01test;

import by.training.lapin.main.task02.ex1.Task01;
import org.junit.Assert;
import org.junit.Test;

public class CompressArrayTest2 {

    @Test
    public void compressArray2(){
        int[] realArray;
        int[] expectedArray = {1,3,0,0,0,0};

        realArray = Task01.compressArray(new int[]{0,1,0,0,3,0});
        Assert.assertArrayEquals(expectedArray,realArray);
    }
}
