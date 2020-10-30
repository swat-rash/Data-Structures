package problems.LeetCode.Easy;

import org.junit.Assert;
import org.junit.Test;
import problems.Utils.CommonUtilsTest;

public class SquaresOfASortedArrayTest {

    SquaresOfASortedArray squaresOfASortedArray = new SquaresOfASortedArray();

    @Test
    public void testSquaresOfASortedArray(){
        int A[] = {-4,-1,0,3,10};
        Assert.assertEquals("[0,1,9,16,100]", CommonUtilsTest.printArray(squaresOfASortedArray.sortedSquares3(A)));
    }
}
