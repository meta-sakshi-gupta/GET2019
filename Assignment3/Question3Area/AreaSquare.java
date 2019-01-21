import java.util.Scanner;

public class AreaSquare 
{
 Scanner scan = new Scanner(System.in);
 
 //method for calculating the area of the square
 // @ param side should be greater than zero
 public double square()
 {
   System.out.println("Enter the side of the square : ");
   double side = scan.nextDouble();
   double square_area = side*side;
   return square_area;
 }
 
}