
public class ArrayClumps 
{
	/*lump in an array is a series of 2 or more 
	 adjacent elements of the same value*/
	//method for finding no. of clumps in an array
	//@param array should not be empty
  public int countClumps(int number,int[]input_array)
   {
    int clumps=0, current =-1;//current store the value of current element in loop
    try
    {
	 for(int element=0;element<number;element++)
	 {
      if(input_array[element]==input_array[element+1] && input_array[element]!=current)
       {
    	clumps++;
    	current = input_array[element];
       }
      else if(input_array[element]!=current)
       {
        current = -1;
       }
	 }
    }
   catch (ArrayIndexOutOfBoundsException e)
    {
     return clumps;
    }
    finally
    {
	 return clumps;
    }
  }
}
