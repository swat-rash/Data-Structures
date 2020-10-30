package problems.LeetCode.Medium;

public class MaximumDistanceToClosestPerson {

    public int maxDistToClosest(int[] seats) {
        int max=0;
        int taken =-1;
        for(int i=0;i<seats.length;i++){
            if(seats[i]==1){
                if(taken == -1){
                    max = i;
                }
                else if(i>taken+1){
                    int mid = (i-taken)/2;
                    System.out.print(mid);
                    max = Math.max(max,mid);
                }
                taken = i;
            }
        }
        return Math.max(max,seats.length-1-taken);
    }
}
