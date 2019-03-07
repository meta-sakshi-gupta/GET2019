import java.util.EmptyStackException;
import java.util.Stack;
public class StackEvaluate 
{
	/*method to evaluate value of postfix expression
	 * @param String type expression consists of digits and operators
	 * @return integer result
	 */
	public int PostfixEvaluate(String expression)
	{
		Stack<Integer> stack = new Stack<>(); // creating a stack
		for(int index = 0; index<expression.length(); index++) // traversing each character one by one
		{
			char character = expression.charAt(index);
			if(character==' ')
				continue;
//			{
//				System.out.println("Do not enter spaces in expression");
//				return 0;
//			}
			else if(Character.isDigit(character)) //If the scanned character is an operand, push it to the stack. 
				stack.push(character-'0');
			
			else
			{
				try
				{
					int value_1 = stack.pop(); //If the scanned character is an operator, pop two elements from stack apply the operator
					int value_2 = stack.pop();

					switch(character)
					{
					case '+':
						stack.push(value_2+value_1);
						break;
					case '-':
						stack.push(value_2-value_1);
						break;
					case '*':
						stack.push(value_2*value_1);
						break;
					case '/':
						stack.push(value_2/value_1);
						break;

					default:
						break;
					}
				}
				catch(EmptyStackException e) // if operators are given before operands
				{
					System.out.println("Please enter the postfix expression");
					return 0;
				}
			}
		}
		return stack.pop();
	}
}
