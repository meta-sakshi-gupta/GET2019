
public class ArrayMenu 
{
	// menu which is displayed on the output screen
  public void menu()
  {
	ArrayInput arrayinput = new ArrayInput();
    int number = arrayinput.Elements_Input();//no. of elements of array
    int[] input_array = new int[number];
	input_array = arrayinput.Array_Input(number);//elements of array
	int choice = arrayinput.choice_input();//choice of the operation
	switch(choice)
	{
	case 1:
	{
	ArrayLargestMirrorSection largestMirrorSection = new  ArrayLargestMirrorSection();
	System.out.println("Largest mirror section : "+largestMirrorSection. maxMirror(number, input_array));
	break;
	}
	case 2:
	{
	ArrayClumps arrayclumps = new ArrayClumps();
	System.out.println("Clumps : "+ arrayclumps.countClumps(number, input_array));
	break;
	}
	case 3:
	{
	ArrayFixXY arrayFixXY = new ArrayFixXY();
	System.out.println("fixed array is : ");
	int [] new_array = arrayFixXY.SolveFixX_Y(number, input_array, arrayinput.XY());
	  //loop for printing the values of fixed array
	for(int value =0; value<number;value++)
	{
	 System.out.println(new_array[value]);
	}
	break;
	}
	case 4:
	{
    ArraySplit arraySplit = new ArraySplit();
    if(arraySplit.splitArray(number, input_array)==-1)
    System.out.println("Not Possible");
    else
    System.out.println("Splitting Position is : "+arraySplit.splitArray(number, input_array));
	break;
	}
	case 0:
	{
	System.exit(0);//exit the system
	break;
	}
	default:
	System.out.println("Invalid Choice!");
	break;
	}
  }
}
