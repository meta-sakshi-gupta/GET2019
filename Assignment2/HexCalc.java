
/**
 * @author : Sakshi Gupta
 * @Date : 17/1/2019
 * @Classname : HexCalc
 * @Description : Hexadecimal operations and interconversion to decimal number
**/


import java.util.Scanner;

public class HexCalc 
{
 static String hexnum1, hexnum2;
   static int choice, decnum1, decnum2;
  static Scanner read = new Scanner(System.in);
 
//Convert hexadecimal no. to decimal no
  public static int hextodecimal(String HexaString) throws NumberFormatException
  {
  
   
	 String HexaStringUpperCase = HexaString.toUpperCase();
	 int decimal=Integer.parseInt(HexaStringUpperCase,16);
	 return decimal;
   
 
  }
 
  //defining arithmetic operations
  private static void ArithmeticOperations(int num1, int num2)
   {
	  int output=0;
	 switch (choice)
	 {
	
	  case 1:
	   {
	 	 output = num1+num2;
	 	 break;
	   }
	  case 2:
	   {
		  output = Math.abs(num1-num2);// getting absolute value of difference
		  break;
	   }
	  case 3:
	   {
		  output = num1*num2;
		  break;
	   }
	  case 4:
	   {
		  output = num1/num2;
		  break;
	   }
	  default:
		  break;
	 }
	 System.out.println("The result is : "+output);
  }
 
  //Comparing the two hexadecimal strings
   private static void ComparisionOperation(String HexNum1, String HexNum2)
  {
	 
	   int comparisionResult = HexNum1.compareTo(HexNum2);
	   switch (choice)
	   {
	    case 1:
	     {
	       if(comparisionResult>0)
	        {
		  System.out.println("TRUE");
	        }
	      else
	        {
		     System.out.println("FALSE");
	        }
	       break;
	     }
	     
	    case 2:
	      {
		    if(comparisionResult<0)
		      {
			 System.out.println("TRUE");
		      }
		     else
		       {
			    System.out.println("FALSE");
		       }
		     break;
		     }
	     case 3:
	        {
		       if(comparisionResult==0)
		        {
			  System.out.println("TRUE");
		        }
		      else
		        {
			     System.out.println("FALSE");
		        }
		       break;
		     }
	      }
	    
  }
 
   
	//displaying the arithmetic choices
   public static void displayArithmeticChoices()
      {
	 System.out.println("1. Addition\n2. Subtraction\n3. Multiplicaton\n4. Division");
      }
   
   //displaying the comparison choices
   public static void displayComparisionChoices()
   {
	   System.out.println("1. Is First no greater than second?\n2. Is First no smaller than second?\n3. Are both no.'s equal?");
   }
   
   //displaying the choices of operations to be performed
   public static void startScreen()
	  {
	   System.out.println("1. Arithmetic operation\n2. Comparision\n3. Hexadecimal to Decimal\n4. Decimal to Hexadecimal");
	  }
	 
   //taking choice input from user
	 private static int getUserInput() throws NumberFormatException
	  {
	   System.out.println("Enter your choice : ");
       
       choice = read.nextInt();
       return choice;
	  }
      
 
  public static void main(String args[])
  {
  
  
		 do
		 {
		  startScreen();
		  getUserInput();
		 
		   switch (choice)
		   {
		     case 1:
		      {
		    	System.out.print("Enter first Hexadecimal Number : ");
		        hexnum1 = read.nextLine();
		        decnum1 = hextodecimal(hexnum1);
		        
		        System.out.print("Enter second Hexadecimal Number : ");
		        hexnum2 = read.nextLine();
		        decnum2 = hextodecimal(hexnum2);
		        
		    	displayArithmeticChoices();
		    	getUserInput();
		    	ArithmeticOperations(decnum1,decnum2);
		    	break;
		      }	
		      
		    case 2:
		      {
		    	System.out.print("Enter first Hexadecimal Number : ");
		        hexnum1 = read.nextLine();
		        hexnum1 = hexnum1.toUpperCase();
		        
		        System.out.print("Enter second Hexadecimal Number : ");
		        hexnum2 = read.nextLine();
		        hexnum2 = hexnum2.toUpperCase();
		        
		        displayComparisionChoices();
		        getUserInput();
		    	ComparisionOperation(hexnum1,hexnum2);
		    	break;
		      }
		    	
		    case 3:
		    {
		    	System.out.print("Enter Hexadecimal Number : ");
		    	hexnum1 = read.nextLine();
		    	decnum1 = hextodecimal(hexnum1);
		    	System.out.println("The Decimal equivalent of the no. is : "+decnum1);
		    	break;
		    }
		    	
		    case 4:
		    {
		    	System.out.println("Emter Decimal number : ");
		    	decnum1 = read.nextInt();
		    	String str = Integer.toHexString(decnum1);//converting decimal number to hexadecimal number
		    	System.out.println("The Hexadecimal equivalent of the no. is : "+str);
		    	break;	
		    }
		  }
	     } while(choice!=0);
		 

 
  }


}
