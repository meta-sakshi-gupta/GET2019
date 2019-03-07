import java.util.Scanner;
public class ExpressionConvertUser 
{
	Scanner scan = new Scanner(System.in);

	public String Input()
	{
		System.out.println("Please enter the infix expression which has to be converted to postfix expression: ");
		String expression = scan.next();
		return expression;
	}

	public void Output(String result)
	{
		System.out.println("Postfix expression is: "+result);
	}
}
