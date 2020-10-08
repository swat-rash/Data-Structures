package problems.Sorting;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfListIsSortedTest {

    CheckIfListIsSorted checkIfListIsSorted = new CheckIfListIsSorted();

    @Test
    public void checkTrue(){
        int array[] = {11, 12, 22, 55, 64};
        Assert.assertEquals(true,checkIfListIsSorted.recursiveCheck(array,array.length));
        Assert.assertEquals(true,checkIfListIsSorted.check(array));
    }

    @Test
    public void checkFalse(){
        int array[] = {11, 12, 22, 55, 64};
        Assert.assertEquals(true,checkIfListIsSorted.recursiveCheck(array,array.length));
        Assert.assertEquals(true,checkIfListIsSorted.check(array));
    }

}
