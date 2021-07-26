/* The problem statement is Find first non repeating character in a string */

import java.util.Scanner;

public class NonRepeating {

    public static void FirstNonRepeating(String s){
    
        boolean flag = false;
        int index = -1;
    
        for(int i = 0; i < s.length(); i++){
            int count = s.length() - s.replace(Character.toString(s.charAt(i)), "").length();
    
            if(count == 1){
                flag = true;
                index = i;
                break;
            }
        }
    
        if(flag){
            System.out.println("The First Non-Repeating character is " + s.charAt(index));
        }
        else{
            System.out.println("There is no Non-Repeating character present in the string");
        }
    
    }

    public static void main(String[] args) {
        String str;
        System.out.println("Enter string : ");
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine(); 

        FirstNonRepeating(str);
    }
}
