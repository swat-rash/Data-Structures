package problems.LeetCode.Easy;

import java.util.Arrays;

public class SquaresOfASortedArray {

    public int[] sortedSquares(int[] A) {
        for (int i = 0; i < A.length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);
        return A;
    }

    public int[] sortedSquares2(int[] A) {
        return Arrays.stream(A).map(i -> i * i).sorted().toArray();
    }

    public int[] sortedSquares3(int[] A) {
        int i = 0;
        int n = A.length;
        while (i < n && A[i] < 0) {
            i++;
        }
        int j = i-1;
        int squaresRes[] = new int[n];
        int k=0;
        while(j>=0 && i<n){
            if(A[i]*A[i]<A[j]*A[j]){
                squaresRes[k++]=A[i]*A[i];
                i++;
            }
            else{
                squaresRes[k++]=A[j]*A[j];
                j--;
            }
        }
        while(j>=0){
            squaresRes[k++]=A[j]*A[j];
            j--;
        }
        while(i<n){
            squaresRes[k++]=A[i]*A[i];
            i++;
        }
        return squaresRes;
    }
}
