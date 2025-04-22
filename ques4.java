/*QUESTION:- 4
Write a program that reads a number in meters, converts it to feet, and displays the result.*/


import java.util.*;
/*
Enrollment no: 230180107032
Practical: 1
Question: 4
*/
public class ques4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number in meters: ");
        double meters = sc.nextDouble();
        double feet = meters * 3.28084;
        System.out.println(meters + " meters is equal to " + feet + " feet.");
        sc.close();
    }
}
