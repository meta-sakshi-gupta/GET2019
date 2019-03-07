import java.util.Scanner;
public class StackEvaluateUser 
{
	Scanner scan = new Scanner(System.in);

	/*
	 * method to take expression to be evaluated as an input
	 * @param string input
	 * @return String expression
	 */
	public String Input()
	{
		System.out.println("Enter the postfix expression to be evaluated");
		String expression = scan.next();
		return expression;
	}

	/* 
	 * method for displaying output on the screen
	 * @param integer type result
	 */
	public void Output(int result)
	{
		System.out.println("Result is: "+result);
	}
}
