/* The problem statement is Count the occurrance of given character in a string */

import java.util.Scanner;

public class CharacterCount {

    public static void countChar(String s, char c){
        int count = 0;

        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == c){
                count++;
            }
        }

        System.out.println("The character " + c + " has appeared " + count + " times.");

    }
    
    public static void main(String[] args) {
        String str;
        char ch;

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the string: ");
        str = scan.nextLine();

        System.out.println("Enter character to be counted: ");
        ch = scan.next().charAt(0);

        countChar(str, ch);
    }
}
