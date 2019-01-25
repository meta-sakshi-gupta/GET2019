import java.util.Scanner;

public class PolyInput 
{
 Scanner scan = new Scanner(System.in);
 public int[] polyInput(String string)
 {
	 System.out.println(string);
	  int degree = scan.nextInt();
	  System.out.println("Enter the coefficients of polynomial in Increasing degree order : ");
	  int[] Coefficients = new int[degree+1];
	  for(int index=0;index<degree+1;index++)
	  Coefficients[index]=scan.nextInt();
	  return Coefficients;
 }
 public int Choice()
 {
  System.out.println("Enter your choice : ");
  System.out.println("1.Evaluate \n2.Degree \n3.Add two polynomials \n4.Multiply two polynomials \n0.Exit");
  int choice = scan.nextInt();
  return choice;
 }
 public float Value()
 {
	 System.out.println("Enter the value of the variable : ");
	 float value = scan.nextInt();
	 return value;
 }
}
