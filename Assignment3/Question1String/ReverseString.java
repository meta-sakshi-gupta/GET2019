public class ReverseString 
{
	//method for reversing the strings
	public void reverse()
	{
	UserInput stringinputrev = new UserInput();
	String stringrev = stringinputrev.getStringInput();
	String reversed = "";//initializing the string
	
	  //loop for accessing each character of the string in reverse order
	 for(int character = stringrev.length()-1; character>=0; character-- )
	 {
		 reversed = reversed + stringrev.charAt(character);
	 }
	 System.out.println("Reverse of the string : "+reversed);
	}
}