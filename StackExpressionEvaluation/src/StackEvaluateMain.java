
public class StackEvaluateMain 
{
	public static void main(String args[])
	{
		StackEvaluateUser user = new StackEvaluateUser();
		String expression = user.Input();
		StackEvaluate evaluate = new StackEvaluate();
		int result = evaluate.PostfixEvaluate(expression);
		user.Output(result);
	}
}
