package by.training.lapin.test.ex02test;

import by.training.lapin.main.task02.ex2.Task02;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyArrayTest1 {

    @Test
    public void MultiplyArray1(){
        int[][] realArray;
        int[][] expectedArray = {{1,2,3,4,5},{1,4,9,16,25},{1,8,27,64,125}};

        realArray = Task02.multiplyArray(new int[][]{{1,2,3,4,5},{1,2,3,4,5},{1,2,3,4,5}});
        Assert.assertArrayEquals(expectedArray,realArray);
    }
}
