import java.util.Scanner;

public class AreaCircle 
{
  Scanner scan = new Scanner(System.in);
  
  //method for calculating the area of the circle
  //@ param radius should be greater than zero
  public double circle()
  {
	System.out.println("Enter the radius of the circle : ");
	double radius = scan.nextDouble();
	double circle_area = 3.14*radius*radius;// value of pi is 3.14
	return circle_area;
  }
  
}