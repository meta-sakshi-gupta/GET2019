
public class ArrayFixXY
{
	//method for finding fixed array
	/*Return an array that contains exactly the same numbers as the input array,
	  but rearranged so that every X is immediately followed by a Y. 
	  X remain at fixed position, but every other number may move*/
	// @param array should not be empty
	// @param equal no of X and Y
	// @param X should not be at last position
	// @param two X's should be separated by atleast one element
 public int[] SolveFixX_Y(int number, int[]input_array, int[]x_y)
 {
   int flag=0;
   for(int char_value=0;char_value<number;char_value++)
   {
	if(input_array[char_value]==x_y[0])
	{
	 for(int char_status=flag;char_status<number;char_status++)
	 {
	  if(input_array[char_status]==x_y[1] && char_status!=char_value+1)
	  {
		  //swapping the values
	  int temp=input_array[char_value+1];
	  input_array[char_value+1]=x_y[1];
	  input_array[char_status]= temp;
	  flag=char_status;
	  }
	  else 
	  {
	  continue;
	  }
     }
	}
	else 
	 {
	 continue;
	 }
   }
      return input_array;
 }
}
