package problems.Sorting;

public class CheckIfListIsSorted {

    public boolean recursiveCheck(int array[],int n){
        if (n==0|| n==1)
            return true;
        if (array[n-1]<array[n-2])
            return false;
        return recursiveCheck(array,n-1);
    }

    public boolean check(int array[]){
        int n = array.length;
        if (n==0 || n==1)
            return true;
        for(int i=1;i<n;i++){
            if(array[i-1]>array[i])
                return false;

        }
        return true;
    }
}
