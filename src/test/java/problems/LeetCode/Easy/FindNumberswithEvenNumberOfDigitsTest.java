package problems.LeetCode.Easy;

import org.junit.Assert;
import org.junit.Test;

public class FindNumberswithEvenNumberOfDigitsTest {

    FindNumberswithEvenNumberOfDigits findNumberswithEvenNumberOfDigits = new FindNumberswithEvenNumberOfDigits();

    @Test
    public void findNumberswithEvenNumberOfDigitsTest1(){
        int nums[] = {12,345,2,6,7896};
        Assert.assertEquals(2,findNumberswithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void findNumberswithEvenNumberOfDigitsTest2(){
        int nums[] = {555,901,482,1771};
        Assert.assertEquals(1,findNumberswithEvenNumberOfDigits.findNumbers(nums));
    }

    @Test
    public void findNumberswithEvenNumberOfDigitsTest3(){
        int nums[] = {555,901,482,177};
        Assert.assertEquals(0,findNumberswithEvenNumberOfDigits.findNumbers(nums));
    }
}
