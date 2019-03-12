import java.util.Scanner;


public class MolecularWeightMain 
{
  public static void main(String args[])
  {
	  Scanner scan = new Scanner(System.in);
	  System.out.println("Enter the formula: ");
	  String formula = scan.next();
	  MolecularWeight mole = new MolecularWeight();
	  System.out.println("molecular weight is: "+mole.solveCompound(formula));
  }
}
