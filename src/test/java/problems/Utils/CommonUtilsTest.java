package problems.Utils;

public class CommonUtilsTest {

    public static String printArray(int nums[]){
        String output = "[";
        for(int i=0;i<nums.length-1;i++)
            output = output + nums[i] + ",";
        return output +  nums[nums.length-1]+ "]";
    }
}
