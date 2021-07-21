/* The problem statement is Check if a given string or number is palindrome or not. */

import java.util.Scanner;

public class Palindrome{
    public static void main(String[] args) {
        String str, reverse = "";
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a string: ");
        str = scan.nextLine();
        int length = str.length();
        for(int i=length-1; i >= 0; i-- ){
            reverse += str.charAt(i);
        }
        System.out.println("The reverse string is " + reverse);
        if(str.equals(reverse)){
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    }
}