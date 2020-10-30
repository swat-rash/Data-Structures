package problems.LeetCode.Easy;

import org.junit.Assert;
import org.junit.Test;

public class SlowestKeyTest {

    SlowestKey slowestKey = new SlowestKey();

    @Test
    public void test1(){
        int s[] = {12,23,36,46,62};
        Assert.assertEquals('a',slowestKey.slowestKey(s,"spuda"));
    }

    @Test
    public void test2(){
        int s[] = {1,2};
        Assert.assertEquals('b',slowestKey.slowestKey(s,"ba"));
    }

    @Test
    public void test3(){
        int s[] = {9,29,49,50};
        Assert.assertEquals('c',slowestKey.slowestKey(s,"cbcd"));
    }
}
