/* The problem statement is In an array 1-100 numbers are stored. However, one number is duplicate. How
will you find the duplicate number? */

public class DuplicateNumber {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,3,4};

        for(int i = 0; i < arr.length; i++){
            for(int j = i + 1; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    System.out.println( arr[j]);
                }
            }
        }
    }
}
