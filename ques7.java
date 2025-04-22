/* QUESTION:- 7
Write a program that prompts the user to enter a letter and check whether a letter is a
vowel or constant.
Enrollment no : 230180107032
Practical : 1 
Question : 7
INPUT :-*/
import java.util.*;
public class ques7 {
    public static void main(String[] args)   {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = sc.next().charAt(0);
        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
            letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println(letter + " is a vowel.");
        } 
        else if ((letter >= 'a' && letter <= 'z') || (letter >= 'A' && letter <= 'Z'))
        {
            System.out.println(letter + " is a consonant.");
        }  else{
            System.out.println("Invalid input. Please enter a letter."); }
        sc.close(); 
    }
}
