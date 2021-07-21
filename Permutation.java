/* The problem statement is Write program to write all permutations of a string (Iteratively or recursively) */

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        String str; 
        String answer="";
        System.out.println("Enter a string");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();

        System.out.println("All possible string are: ");
        permute(str, answer);
    }

    public static void permute(String str, String answer){
        if(str.length() == 0){
            System.out.println(answer + "");
            return;
        }

        for(int i=0; i < str.length(); i++){
            char ch = str.charAt(i);
            String left_substr = str.substring(0, i);
            String right_substr = str.substring(i+1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }
}
