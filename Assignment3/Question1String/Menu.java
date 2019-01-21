/**
 * @author : Sakshi Gupta
 * @Date : 21/1/2019
 * @Classname : Menu
 * @Description : describing cases for users choice of operations
**/
public class Menu
{
 public void menu()
 {
	 UserInput choiceinput = new UserInput();//class for getting user input
	 
	  int choice = choiceinput.getChoiceInput();
	  
	  switch(choice)
	  {
	   case 1:
	    {
		 CompareStrings comparestring = new CompareStrings();//comparing strings
	     comparestring.display();
	     break;
	    }
	   case 2:
	    {
		 ReverseString reversestring = new ReverseString();//reversing the string
		 reversestring.reverse();
		 break;
	    }
	  case 3:
	    {
		 ChangeCase casechange = new ChangeCase();//changing the case of the string
		 casechange.changecase();
		 break;
	    }
	  case 4:
	    {
		 MaximumWord maximumword = new MaximumWord();//finding the longest word of the string
		 maximumword.maxword();
		 break;
	    }
	  case 0:
		 System.exit(0);//exit the system
		 break;
		
	  default:
		  System.out.println("Invalid choice");
		 break;
	 
	  }
	 
 }
}