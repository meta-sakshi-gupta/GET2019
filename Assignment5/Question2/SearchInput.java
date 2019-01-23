  import java.util.Scanner;
  public class SearchInput 
   {
	Scanner scan = new Scanner(System.in);
	 public int Number()
	 {
	  System.out.println("Enter the no. of elements in array : ");
	  int number = scan.nextInt();
	  return number;
	 }
	 public int[] Array_Input(int number)
	 {
	  int array[]=new int [number];
	  System.out.println("Enter the values of array : ");
	  for(int index=0;index<number;index++)
	  {
	   array[index]=scan.nextInt();
	  }
	  return array;
	 }
	 public int[] SortedArray_Input(int number)
	 {
	  int sort_array[]=new int [number];
	  System.out.println("Enter the values of array in ascending order : ");//Binary search only works for sorted array
	  for(int index=0;index<number;index++)
	  {
	   sort_array[index]=scan.nextInt();
	  }
	  return sort_array;
	 }
	 public int CheckSorted(int[] sort_array, int number)
	 {
	  if( number==1||number==0)
	  {
	   return 1;
	  }
	  if(sort_array[number-1]<sort_array[number-2])
	  {
	   return 0;
	  }
	  return(CheckSorted(sort_array,number-1));
	 }
	 public int Search_Element()
	 {
	  System.out.println("Enter the value to be searched : ");
	  int Element = scan.nextInt();
	  return Element;
	 }
	 public int Choice()
	 {
	  System.out.println("Enter your choice : ");
	  System.out.println("1.Linear search \n2.Binary search \n0.Exit");
	  int choice = scan.nextInt();
	  return choice;
	 }
	}

	