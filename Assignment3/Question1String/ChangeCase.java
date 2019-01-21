public class ChangeCase 
{
	 //method for changing the case of the string
 public void changecase()
 {
	 UserInput stringchangecase = new UserInput();
	 String stringcase = stringchangecase.getStringInput();
	 
	 int char_index;
	 for(char_index=0;char_index<stringcase.length();char_index++)
	 {
	   int char_value=stringcase.charAt(char_index);
	   if(char_value>64 && char_value<91)//character is in upper case
	   {
		 char_value=char_value+32;
		 System.out.print((char)char_value);//typecasting the int value to char
	   }
	   
	   else if(char_value>96 && char_value<123)//character is in lower case
	   {
		 char_value=char_value-32;
		 System.out.print((char)char_value);
	   }
	   
	   else if(char_value==32)// character is a space
		System.out.print(" ");
	 }
	 
	 
 }
}