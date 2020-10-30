package problems.LeetCode.Easy;

import org.junit.Assert;
import org.junit.Test;

public class MaxConsecutiveOnesTest {

    MaxConsecutiveOnes maxConsecutiveOnes = new MaxConsecutiveOnes();

    @Test
    public void maxConsecutiveOnesTest1(){
        int nums[] = {1,1,0,1,1,1};
        Assert.assertEquals(3,maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void maxConsecutiveOnesTest2(){
        int nums[] = {0,0,0,0};
        Assert.assertEquals(0,maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }

    @Test
    public void maxConsecutiveOnesTest3(){
        int nums[] = {0,0,0,1};
        Assert.assertEquals(1,maxConsecutiveOnes.findMaxConsecutiveOnes(nums));
    }
}
