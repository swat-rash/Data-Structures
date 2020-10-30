package problems.LeetCode.Easy;

public class MoveZeroes {

    public void moveZeroes(int[] nums) {
        int zeroes = 0;
        int pointer=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[pointer++]=nums[i];
            }else{
                zeroes++;
            }
        }
        while(zeroes!=0){
            nums[pointer++]=0;
            zeroes--;
        }
    }
}
