
   public class BinarySearch 
   {
	   //method for binary search of an element
	public int Binary_Search(int[] array, int Element)
	 {
	  int start,end;
	  start=0;
	  end = array.length-1;
	  return Binary_Search(array, Element, start, end);
	 }
	 public int Binary_Search(int[] array, int Element, int start, int end)
	 {
	  if(start>=end)
	  {
	   if(array[start]==Element)//array contain only one element
	   {
		return start;
	   }
	   else
	   {
		return -1;//value not found
	   }
	  }
	  else
	  {
	   int mid = (start+end)/2;
	   if(array[mid]==Element)
	   {
	    return mid;
	   }
	   else if(array[mid]>Element)
	   {
		return Binary_Search(array,Element,start,mid-1);//splitting the array in two parts
	   }
	   else
	   {
		return Binary_Search(array,Element,mid+1,end);
	   }
	  }
	 }
   }
