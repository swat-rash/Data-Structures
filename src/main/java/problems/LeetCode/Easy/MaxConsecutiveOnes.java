package problems.LeetCode.Easy;

public class MaxConsecutiveOnes {

    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i=0;
        while(i<nums.length){
            if (nums[i] == 1) {
                int onesCount = 0;
                while (i<nums.length && nums[i] == 1) {
                    onesCount++;
                    i++;
                    System.out.println(onesCount);
                }
                max = Math.max(onesCount,max);
            }else
                i++;
        }
        return max;
    }

    public int findMaxConsecutiveOnes2(int[] nums) {
        int max = 0;
        int currCount = 0;
        for(int num : nums){
            currCount = (num==0) ? 0 : currCount+1;
            max = Math.max(currCount, max);
        }
        return max;
    }
}
