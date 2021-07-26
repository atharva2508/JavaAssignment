/* The problem statement is In an array 1-100 numbers are stored. However, one number is missing. How
will you find the missing number ? */

public class MissingNumber {
    
    public static int findMissingNumber(int a[], int n){
        int total = 1;
        for(int i = 2; i < (n+1); i++){
            total += i;
            total -= a[i-2];
        }

        return total;

    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7};

        System.out.println(findMissingNumber(arr, arr.length));
    }
}
