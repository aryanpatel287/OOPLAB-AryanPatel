/* 
Enrollment No: 230180107032  
Practical: 2  
Question: 8  

Problem Statement: 
Write a program that checks if a string is a valid password based on the following rules:
1. A password must have at least eight characters.
2. A password consists of only letters and digits.
3. A password must contain at least two digits.
The program should prompt the user to enter a password and display 'Valid Password' or 'Invalid Password'.
*/

import java.util.Scanner;
public class PasswordValidator {
    public static boolean isValidPassword(String password) {
        if (password.length() < 8) {
            return false;
        }
        
        int digitCount = 0;
        for (char c : password.toCharArray()) {
            if (!Character.isLetterOrDigit(c)) {
                return false;
            }
            if (Character.isDigit(c)) {
                digitCount++;
            }
        }
        
        return digitCount >= 2;
    }//end of isValidPassword method
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = sc.nextLine();
        
        if (isValidPassword(password)) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Invalid Password");
        }
        
        sc.close();
    }//Enf of Main method
}//End of PasswordValidator