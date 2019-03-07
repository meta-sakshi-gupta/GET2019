import java.util.Stack;


public class ExpressionConvert 
{
	static int Precedence(char character)
	{
		switch(character)
		{

		case '^':
			return 1;
		case '>':
			return 2;
		case '<':
			return 3;
		case '+':
		case '-':
			return 4;
		case '*':
		case '/':
			return 5;
		}
		return -1;
	}

	public String InfixToPostfix(String expression) 
	{
		String result = new String("");
		Stack<Character> stack = new Stack<>();

		for(int index=0; index<expression.length(); index++)
		{
			char character = expression.charAt(index);

			if(character == ' ') 
				continue; 

			else if(Character.isLetterOrDigit(character)) // If the scanned character is an operand, add it to output. 
				result+=character;

			else if(character == '(') // If the scanned character is an '(', push it to the stack.
				stack.push(character);

			else if (character == ')') //  If the scanned character is an ')', pop and output from the stack until an '(' is encountered. 
			{ 
				while (!stack.isEmpty() && stack.peek() != '(') 
					result += stack.pop(); 

				if (!stack.isEmpty() && stack.peek() != '(') 
					return "Invalid Expression"; // invalid expression                 
				else
					stack.pop(); 
			} 
			else // an operator is encountered 
			{ 
				while (!stack.isEmpty() && Precedence(character) <= Precedence(stack.peek())) 
					result += stack.pop(); 
				stack.push(character); 
			} 
		} 

		// pop all the operators from the stack 
		while (!stack.isEmpty()) 
			result += stack.pop(); 

		return result;
	}

}
