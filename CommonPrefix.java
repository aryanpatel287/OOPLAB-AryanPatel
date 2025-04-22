/* 
Enrollment No: 230180107032  
Practical: 2  
Question: 7  
Problem Statement: 
Write a program that prompts the user to enter two strings and displays the largest common prefix of the two strings.
*/
import java.util.Scanner;
public class CommonPrefix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String str1 = sc.nextLine();
        System.out.print("Enter second string: ");
        String str2 = sc.nextLine();
        
        int minLength = Math.min(str1.length(), str2.length());
        String prefix = "";
        
        for (int i = 0; i < minLength; i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                prefix += str1.charAt(i);
            }//if statement 
            else {
                break;
            }//else statement
        }//for loop of characters comparison
        
        if (prefix.isEmpty()) {
            System.out.println("No common prefix found.");
        }//if statement 
        else {
            System.out.println("Largest common prefix: " + prefix);
        }//else statement
        
        sc.close();
    }
}