import java.util.Scanner;

public class AreaRectangle 
{
  Scanner scan = new Scanner(System.in);
  //method for calculating the area of the rectangle
  // @ param height and width should be greater than zero
  public double rectangle()
  {
	  System.out.println("Enter the height of the rectangle : ");
	   double height = scan.nextDouble();
	   
	   System.out.println("Enter the width of the rectangle : ");
	   double width = scan.nextDouble();
	   
	   double rectangle_area = height*width;
	   return rectangle_area; 
  }
}