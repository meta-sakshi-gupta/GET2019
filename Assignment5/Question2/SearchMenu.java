
  public class SearchMenu 
  {
	  //Menu function to call and display the other functions
	public void Menu()
	 {
	  SearchInput search_input = new SearchInput();
	  int choice = search_input.Choice();
	  int number = search_input.Number();
	  switch(choice)
	  {
	  case 1:
	  {
	   int[] array = search_input.Array_Input(number);
	   int Element = search_input.Search_Element();
	   int low=0; //beginning index value for traversing
	   LinearSearch linear_search = new LinearSearch();
	   System.out.println("Index value is : "+linear_search.Linear_Search(array,Element,low));
	   break;
	  }
	  case 2:
	  {
	   int[] sorted_array = search_input.SortedArray_Input(number);
	   int sort = search_input.CheckSorted(sorted_array,number);
	   if(sort!=0)
	   {
		System.out.println("Array is sorted");
	   }
	   else
	   {
		System.out.println("Array is not sorted");
		System.exit(0);
	   }
	   int Element = search_input.Search_Element();
	   BinarySearch binary_search = new BinarySearch();
	   System.out.println("Index value is : "+binary_search.Binary_Search(sorted_array, Element));
	   break;
	  }
	  case 3:
	  {
	   System.exit(0);// exit the sysytem
	   break;
	  }
	  default:
	  break;
	  }
	 }
}
