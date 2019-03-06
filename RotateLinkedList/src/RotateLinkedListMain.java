
public class RotateLinkedListMain 
{
	public static void main(String args[])
	{
		RotateLinkedListUser rotateUser = new RotateLinkedListUser();
		int number = rotateUser.Number("Enter the no. of nodes: ");
		ListNode head = rotateUser.NodeElement(number);
		System.out.println("Given list is: ");
		rotateUser.displayList(head);
		
		int left_position = rotateUser.Number("Enter the left position of sublist: ");
		int right_position = rotateUser.Number("Enter the right position of sublist: ");
		int steps = rotateUser.Number("Enter the steps to which sublist has to be rotated: ");
		System.out.println("Rotated sublist is: ");
		rotateUser.displayList(RotateLinkedListSubList.rotateSubList(head, left_position, right_position, steps));
	}
}
