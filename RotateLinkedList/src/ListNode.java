
public class ListNode 
{
	int data;  
	ListNode next;

	/*
	 * function to insert elements in new nodes
	 * @param integer data 
	 * @param head node of ListNode type
	 * @return linked list
	 */
	static ListNode push(ListNode head, int value)  
	{  
		ListNode new_node = new ListNode();  
		new_node.data = value;  
		new_node.next = (head);  
		(head) = new_node;  
		return head;
	}  
}
