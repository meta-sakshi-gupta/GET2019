import java.util.Scanner;

public class AreaMenu 
{
	Scanner scan = new Scanner(System.in);
	
  public void menu()
  {
  System.out.println("Enter the area you want to calculate : ");
  System.out.println("1.Triangle \n2.Rectangle \n3.Square \n4.Circle \n0.Exit");
  
  int choice = scan.nextInt();
  switch(choice)
  {
   case 1:
   {
	 AreaTriangle area_triangle = new AreaTriangle();
	 System.out.println("Area of triangle is : "+area_triangle.triangle());
	 break;
   }
   
   case 2:
   {
	 AreaRectangle area_rectangle = new AreaRectangle();
	 System.out.println("Area of rectangle is : "+area_rectangle.rectangle()); 
	 break;
   }
   
   case 3:
   {
	 AreaSquare area_square = new AreaSquare();
	 System.out.println("Area of Square is : "+area_square.square());
	 break;
   }
   
   case 4:
   {
	 AreaCircle area_circle = new AreaCircle();
	 System.out.println("Area of Circle is : "+area_circle.circle());
	 break;
   }
   
   case 0:
   {
	 System.exit(0);
	 break;
   }
   
   default:
    break;
  }
  
  }
}