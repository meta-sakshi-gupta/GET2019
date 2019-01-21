public class CompareStrings 
{
	// method for displaying the result for the comparison of the strings
	public void display()
	{
	 UserInput stringinputcomp = new UserInput();
	 String string1 = stringinputcomp.getStringInput();
	 String string2 = stringinputcomp.getStringInput();
	 int result = compare(string1, string2); // calling the compare function
	   if(result == 1)
	     {
		System.out.println("Strings are equal");
	     }
	  else
		 {
		System.out.println("Strings are unequal");
		 }
	}
	
	  //method for comparing the strings
	  public static int compare(String string1, String string2)
	
	{
         //Compare the length of the two strings
        if(string1.length() != string2.length())
        {
        	return 0;
        }
        
        	int character;
        	// loop for comparing each character of both the strings
        	for(character=0; character<string1.length(); character++)
        	{
        		if(string1.charAt(character) != string2.charAt(character))
      			return 0;
            }
		    
            return 1;
	 }
}