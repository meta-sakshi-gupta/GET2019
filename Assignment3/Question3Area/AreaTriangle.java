import java.util.Scanner;

public class AreaTriangle 
{
Scanner scan = new Scanner(System.in);
 //method for calculating the area of the triangle
// @ param height and width should be greater than zero
 public double triangle()
 {
   System.out.println("Enter the height of the triangle : ");
   double height = scan.nextDouble();
   
   System.out.println("Enter the width of the triangle : ");
   double width = scan.nextDouble();
   
   double triangle_area = 0.5*height*width;
   return triangle_area;
   
 }
}
