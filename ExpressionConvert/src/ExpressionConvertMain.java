
public class ExpressionConvertMain
{
	public static void main(String args[])
	{
		ExpressionConvertUser user = new ExpressionConvertUser();
		String expression = user.Input();
		ExpressionConvert convert = new ExpressionConvert();
		String result = convert.InfixToPostfix(expression);
		user.Output(result);
	}
}
