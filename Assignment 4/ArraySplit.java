
public class ArraySplit
{
/*Return the index if there is a place to split the input array so that
 the sum of the numbers on one side is equal to the sum of the numbers on the other side*/
	//method for finding the position of array where it can split
	//@param array should not be empty
  public int splitArray(int number, int[]input_array)
  {
	int leftsum = 0;
	// traverse array element 
    for (int left = 0; left < number; left++) 
    { 
      // add current element to left Sum 
      leftsum += input_array[left] ; 
     // find sum of rest array 
     // elements (rightSum) 
      int rightsum = 0 ; 
      for (int right = left+1 ; right < number ; right++ ) 
       rightsum += input_array[right] ; 
    // split point index 
      if (leftsum == rightsum) 
      return left+1 ; 
     } 
     // if it is not possible to  
    // split array into two parts 
    return -1; 
    } 
  }

