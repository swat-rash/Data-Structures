package problems.LeetCode.Easy;

public class FindNumberswithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {
        int countEvenDigitNumbers = 0;
        for (int num : nums) {
            if (findDigits4(num) % 2 == 0)
                countEvenDigitNumbers++;
        }
        return countEvenDigitNumbers;
    }

    private int findDigits1(int num) {
        return  (int)Math.floor(Math.log10(num)+1);
    }

    private int findDigits2(int num){
        int countDigits=0;
        while(num!=0){
            num/=10;
            countDigits++;
        }
        return countDigits;
    }

    private int findDigits3(int num){
        if(num==0)
            return 0;
        return findDigits3(num/10)+1;
    }

    private int findDigits4(int num){
        String numString = Integer.toString(num);
        return numString.length();
    }
}
