/* QUESTION:- 3
Write a program that solves the following equation and displays the value x and y:
a) 3.4x+50.2y=44.5 2) 2.1x+.55y=5.9 (Assume Cramer’s rule to solve equation)
b) ax+by=e x=ed-bf/ad-bc cx+dy=f y=af-ec/ad-bc )

Enrollment no : 230180107032
practical : 1 
Question : 3
*/

public class ques3 {
    public static void main(String[] args) {      
        double a1 = 4.5, b1 = 60.3, c1 = 37.8;
        double a2 = 3.2, b2 = 1.5, c2 = 8.7;
        double determinant = a1 * b2 - a2 * b1; // Calculate the determinant of the coefficient matrix
 // Check if the determinant is zero to avoid division by zero
        if (determinant == 0) {
            System.out.println("The equations have no unique solution.");
        } 
else {
            // Calculate the values of x and y using Cramer's Rule
            double x = (c1 * b2 - c2 * b1) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            // Display the results
            System.out.println("The value of x is: " + x);
            System.out.println("The value of y is: " + y);
        }}}
