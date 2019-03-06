import java.util.Scanner;


public class RotateLinkedListUser 
{
	Scanner scan = new Scanner(System.in);

	/*
	 * function for taking no. of elements in linked list
	 * @param integer
	 * @return integer
	 */
	public int Number(String string)
	{
		System.out.println(string);
		int number = scan.nextInt();
		return number;
	}

	/*
	 * function for storing data values of nodes
	 * @param integer
	 * @return nodes of listNode type 
	 */
	public ListNode NodeElement(int number)
	{
		System.out.println("Enter the integer data values for nodes: ");
		ListNode head = null;
		for(int node = 0; node<number; node++)
		{
			head = ListNode.push(head, scan.nextInt());//each time head points to new node
		}
		return head;
	}
	
	/*
	 * function to display list in linked list form
	 * @param nodes of listNode type
	 */
	public void displayList(ListNode head)
	{
		while (head != null) 
		{  
			System.out.print( head.data);  
			head = head.next;
			if(head != null)
				System.out.print("->");
		}  
		System.out.println();
	}
}
