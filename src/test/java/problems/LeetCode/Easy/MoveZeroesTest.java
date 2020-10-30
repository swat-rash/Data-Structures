package problems.LeetCode.Easy;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroesTest {

    MoveZeroes moveZeroes = new MoveZeroes();

    @Test
    public void test1(){
        int[] nums = {3,12,0,0};
        moveZeroes.moveZeroes(nums);
    }
}
