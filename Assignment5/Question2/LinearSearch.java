
   public class LinearSearch 
   {
	   //method for linearly searching the element using recursion
	public int Linear_Search(int[]array,int Element,int low)
	 {
	  if(low>array.length)//terminating the loop
	  return -1;//value not found
	  else 
	  {
	   if(array[low]==Element) 
	   return low;
	   else
	   return Linear_Search(array,Element,low+1);//recursive calling
	  }
	 }
    }
