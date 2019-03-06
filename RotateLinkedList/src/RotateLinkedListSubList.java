
public class RotateLinkedListSubList 
{
	static ListNode rotateSubList(ListNode start, int left_position, int right_position, int steps )
	{
		int left = left_position-1; //indexing starts from 0
		int right = right_position-1; //indexing starts from 0
		int size = left + right + 1; //size of subList
		if(steps>size)
			steps = steps%size;

		if(steps==0||steps==size) //list will remain unchanged
		{
			ListNode head = start;
			return head;
		}

		ListNode link = null;
		if(left==0)
			link = start; //sublist is starting from 0th index of list

		ListNode current = start;
		int count = 0;
		ListNode end = null;
		ListNode previous = null;
		while(current!=null)
		{
			if(count==left-1)
			{
				previous = current;	
				link = current.next;
			}
			if(count==right-steps)
			{
				if(left==0)
				{
					end=current;
					start=current.next;
				}
				else
				{
					end=current;
					previous.next=current.next;
				}
			}
			if(count==right)
			{
				ListNode temporary = current.next;
				current.next = link;  
				end.next = temporary;  
				ListNode head = start;  
				return head;  
			}  
			current = current.next; 
			count++;
		}
		return start;
	}
	
	/*
	 * method for loop detection by Floyd's cycle-finding algorithm
	 */
	boolean detectLoop()  
    { 
        ListNode slow = head, fast = head; 
        while (slow != null && fast != null && fast.next != null) { 
            slow = slow.next; 
            fast = fast.next.next; 
            if (slow == fast) { 
                System.out.println("Found loop"); 
                return true; 
            } 
        } 
        return false; 
    } 
}

