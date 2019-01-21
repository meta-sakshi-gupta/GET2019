import java.util.Scanner;

public class UserInput 
{
Scanner scan = new Scanner(System.in);
	
    //method for getting string input from user
   // @ param strings are not null and case sensitive
  // @ return string value which is not null
    public String getStringInput()
    {
     String string = null;
 
     System.out.println("Enter the string : ");
     string = scan.nextLine();
     return string;
    }
    
    // method for getting user's choice
    public int getChoiceInput()
    {
      int CHOICE;
      
      System.out.println("Enter your choice : ");
      System.out.println("1. Compare the two strings \n2. Reverse the string \n3. Change the case of the string \n4. Find the longest word of the string \n0.Exit");
      CHOICE = scan.nextInt();
      return CHOICE;
    }
}