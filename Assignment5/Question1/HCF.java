
public class HCF 
{
 public int findHCF(int FirstNumber, int SecondNumber)
 {
  if(FirstNumber==0)
  {
   return SecondNumber;
  }
  else if(SecondNumber==0)
  {
   return FirstNumber;
  }
  else if(FirstNumber == SecondNumber)
  {
   return FirstNumber;
  }
  else
  {
   if(FirstNumber>SecondNumber)
   {
    return findHCF(FirstNumber%SecondNumber,SecondNumber);
   }
   else
   {
	return findHCF(SecondNumber%FirstNumber,FirstNumber);
   }
  }
 }
}
