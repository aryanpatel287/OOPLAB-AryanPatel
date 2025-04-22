/* QUESTION:- 6
Write a program that prompts the user to enter three integers and display the integers in 
decreasing order.
Enrollment no : 230180107032
Practical : 1 
Question : 6 
INPUT :-*/
import java.util.*;
public class ques6 {
    public static void main(String[] args)  
{
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first integer: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third integer: ");
        int num3 = sc.nextInt();
        int max, middle, min;
        if (num1 >= num2 && num1 >= num3)   
{
            max = num1;
            if (num2 >= num3)
 {
                middle = num2;
                min = num3;} else
 {
                middle = num3;
                min = num2;}    } 
        else if (num2 >= num1 && num2 >= num3) 
 {
            max = num2;
            if (num1 >= num3) 
  {
                middle = num1;
                min = num3; }  
       else
 {
                middle = num3;
                min = num1;  } } 
        else
{
            max = num3;
            if (num1 >= num2) {
                middle = num1;
                min = num2; }
            else
{
                middle = num2;
                min = num1; } }

        System.out.println("The integers in decreasing order are: " + max + ", " + middle + ", " + min);   }
}

