import java.util.Arrays;
public final class IntSet 
{
 private final int set[];
 public IntSet(int []array)
 {
  set = this.removeDuplicateElement(array);
 }
     // will remove duplicate element in array if any
	private int [] removeDuplicateElement(int [] my_array)
	{
     //array to be returned after remove duplicate element
	 int[] setArray; 
    //Assuming all elements in input array are unique
     int no_unique_elements = my_array.length;
   //Comparing each element with all other elements
     for (int index = 0; index < no_unique_elements; index++) 
     {
       for (int index_1 = index+1; index_1 < no_unique_elements; index_1++)
        {
         //If any two elements are found equal
         if(my_array[index] == my_array[index_1])
          {
            //Replace duplicate element with last unique element
            my_array[index_1] = my_array[no_unique_elements-1];
            no_unique_elements--;
             index_1--;
          }
        }
     }
       //Copying only unique elements of my_array into setArray
      setArray = Arrays.copyOf(my_array, no_unique_elements);
       return setArray;
	}
	
	 //@return "true" if value is member of set otherwise "false"
	 public boolean isMember(int value)
	 {
      for(int index=0;index<this.size();index++)
      {
		if(this.set[index]==value)
		return true;
	  }
		return false;
	}
	// return size of the set
	public int size()
	{
	 return this.set.length;
	}
	public boolean isSubSet(IntSet subSet)
	{
	//checking status of existence of subset value in superset
	 int exist=0;
	//checking that all the member of subset are present in superset or not
	 for(int index=0;index<subSet.size();index++)
	 {
	  for(int index_1=0;index_1<this.size();index_1++)
	  {
		//if value of subset member is found in superset then fix exist status 1 and break because only one similer value will be in super set
		if(subSet.set[index]==this.set[index_1])
		{
		 exist=1;
		 break;
		}
	  }
	 //if exist status is 1 i.e. value is present and check for another value
	 if(exist==1)
	//status change to 0 for another value
	 exist=0;
	//if any single value of subset is not present in superset i.e. this is not a subSet of super set
	else
	return false;
	}
   return true;
  }
	//getting complement of set
  public IntSet getComplement()
  {
   int tempCompleMentSet[] = new int[1000],elementInComplementSet=0;
	//set has to be return
   int complementSet[];
	//checking universal set element existence in set
   int exist=0;
	for(int index=1;index<=1000;index++)
	{
	for(int index_1=0;index_1<this.size();index_1++)
	 {
	  if(index==this.set[index_1])
	  {
	   exist=1;
	   break;
	  }
	 }
	if(exist==1)
	exist=0;
	//if universal set element doesn't exist in set then assign it's value to tempCompleMentSet
	else	
    tempCompleMentSet[elementInComplementSet++]=index;
   }
	//initializing complementSet 
	complementSet = Arrays.copyOf(tempCompleMentSet,elementInComplementSet);
	//returning complementSet which is IntSet type
	return new IntSet(complementSet);
 }
	public static IntSet union(IntSet set1, IntSet set2)
	{
     //creating an array size of addition of both set size
	 int tempUnionSet[] = new int[set1.size()+set2.size()],elementInTempUnionSet=0;
		
		//set has to be return
		int unionSet[];
		
		//Initializing s1 set into unionSet
		for(int index=0;index<set1.size();index++)
		{
			tempUnionSet[elementInTempUnionSet++]=set1.set[index];
		}
		
		for(int index=0;index<set2.size();index++)
		{
			//is s2 set value is not member of s1 set then only it will  assign into union set 
			if(!set1.isMember(set2.set[index]))
			{
				tempUnionSet[elementInTempUnionSet++]=set2.set[index];
			}
		}
		//initializing unionSet
		unionSet = Arrays.copyOf(tempUnionSet,elementInTempUnionSet);
		
		//returning unionSet 
		return new IntSet(unionSet);
		
	}
	
	
	//Printing Set values
	void printSet()
	{
		System.out.print("{ ");

		for(int index=0;index<this.size();index++)
		{
			System.out.print(this.set[index]+",");
		}
		
		System.out.print(" } ");
		
		System.out.println();
	}
}

