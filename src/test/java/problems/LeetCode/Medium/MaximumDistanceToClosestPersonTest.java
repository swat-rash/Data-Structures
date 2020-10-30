package problems.LeetCode.Medium;

import org.junit.Assert;
import org.junit.Test;

public class MaximumDistanceToClosestPersonTest {

    MaximumDistanceToClosestPerson maximumDistanceToClosestPerson = new MaximumDistanceToClosestPerson();

    @Test
    public void testMaxDistToClosest(){
        int seats[] = {0,1};
        Assert.assertEquals(1,maximumDistanceToClosestPerson.maxDistToClosest(seats));

    }

    @Test
    public void testMaxDistToClosest2(){
        int seats[] = {1,0,0,0};
        Assert.assertEquals(3,maximumDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    public void testMaxDistToClosest3(){
        int seats[] = {1,0,0,0,1,0,1};
        Assert.assertEquals(2,maximumDistanceToClosestPerson.maxDistToClosest(seats));
    }

    @Test
    public void testMaxDistToClosest4(){
        int seats[] = {1,1,0,1};
        Assert.assertEquals(1,maximumDistanceToClosestPerson.maxDistToClosest(seats));
    }
}
