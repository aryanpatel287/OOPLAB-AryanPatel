/* QUESTION:- 5
Body Mass Index (BMI) is a measure of health on weight. It can be calculated by taking
your weight in kilograms and dividing it by the square of your height in meters. Write a
program that prompts the user to enter weight in pounds and height in inches and displays
the BMI.
Note:- 1 pound=.45359237 Kg and 1 inch=.0254 meters.
INPUT :-*/
import java.util.*;
/*
Enrollment no : 230180107032
Practical : 1 
Question : 5
*/
public class ques5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your weight in pounds: ");
        double weightInPounds = sc.nextDouble();
        System.out.print("Enter your height in inches: ");
        double heightInInches = sc.nextDouble();
        double weightInKilograms = weightInPounds * 0.45359237;
        double heightInMeters = heightInInches * 0.0254;
        double bmi = weightInKilograms / (heightInMeters * heightInMeters);
        System.out.println("Your BMI is: " + bmi);
    }
}
