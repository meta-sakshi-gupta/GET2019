import java.util.Scanner;


public class ArrayInput 
{
  Scanner scan = new Scanner(System.in);
  // method for getting no. of elements and value of elements of array from user
  // @ param elements should be positive in value
  
  public int Elements_Input()
  {
	System.out.println("Enter the no. of elements of array : ");
	int number = scan.nextInt();
	return number;
  }
  public int[] Array_Input(int number)
  {
	System.out.println("Enter the elements of the array : ");
	int[] input_array = new int[number];
	for(int value=0;value<number;value++)
	{
	  input_array[value] = scan.nextInt();
	}
	return input_array;
  }
  public int choice_input()
  {
	System.out.println("Enter your choice : ");
	System.out.println("1.Return the size of the largest mirror section found in the input array. \n2.Return the number of clumps in the input array. \n3.Solve fixXY problem \n4.splitArray \n0.exit");
	int choice = scan.nextInt();
	return choice;
  }
  public int[] XY()
  {
	System.out.println("Enter the value of X and Y : ");
	int[] x_y = new int[2];
	for(int value = 0;value<2;value++)
	{
	 x_y[value] = scan.nextInt();
	}
	return x_y;
  }
}
