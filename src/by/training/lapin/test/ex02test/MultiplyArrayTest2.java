package by.training.lapin.test.ex02test;

import by.training.lapin.main.task02.ex2.Task02;
import org.junit.Assert;
import org.junit.Test;

public class MultiplyArrayTest2 {

    @Test
    public void MultiplyArray2(){
        int[][] realArray;
        int[][] expectedArray = {{1,2},{1,4}};

        realArray = Task02.multiplyArray(new int[][]{{1,2},{1,2}});
        Assert.assertArrayEquals(expectedArray,realArray);
    }
}
