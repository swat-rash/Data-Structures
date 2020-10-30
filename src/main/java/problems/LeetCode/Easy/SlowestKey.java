package problems.LeetCode.Easy;

public class SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        int diff;
        char result = keysPressed.charAt(0);
        int min = releaseTimes[0];
        for(int i=1;i<releaseTimes.length;i++){
            diff = releaseTimes[i]-releaseTimes[i-1];
            if(diff>= min) {
                if(diff == min){
                    result = (char)Math.max(keysPressed.charAt(i),result);
                }else {
                    min = diff;
                    result = keysPressed.charAt(i);
                }
            }
        }
        return result;
    }
}
