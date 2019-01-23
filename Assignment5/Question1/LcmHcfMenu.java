
public class LcmHcfMenu 
{
 public void menu()
 {
  LcmHcfInput input =  new LcmHcfInput();
  int FirstNumber = input.FirstNumber();
  int SecondNumber = input.SecondNumber();
  int choice = input.Choice();
  int big,small;
 
  switch(choice)
  {
   case 1:
   {
	LCM lcm = new LCM();
	 if(FirstNumber>SecondNumber)
	  {
	   big=FirstNumber;
	   small=SecondNumber;
	  }
	  else
	  {
	   big=SecondNumber;
	   small=FirstNumber;
	  }
	 int original_big = big;
	 System.out.println("LCM of the two numbers is : "+lcm.findLCM(big,small,original_big)); 
	 break;
   }
   case 2:
   {
	HCF hcf = new HCF();
	System.out.println("HCF of the two numbers is : "+hcf.findHCF(FirstNumber,SecondNumber));
	break;
   }
   case 3:
   {
	System.exit(0);
   }
   default:
   {
	System.out.println("Invalid choice!");
   }
  }
 }
}
