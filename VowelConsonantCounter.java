/* 
Enrollment No: 230180107032  
Practical: 2  
Question: 6  
Problem Statement: 
Write a program that prompts the user to enter a string and displays the number of vowels and consonants in the string.
*/
import java.util.Scanner;
public class VowelConsonantCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine().toLowerCase();

        int vowels = 0, consonants = 0;
        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') { // Check if it's a letter
                if ("aeiou".indexOf(c) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }//for loop of charArray

        System.out.println("Vowels: " + vowels);
        System.out.println("Consonants: " + consonants);
        sc.close();
    }//End of Main method
}//End of VowelConsonantCounter