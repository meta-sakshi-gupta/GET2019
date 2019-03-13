import static org.junit.Assert.*;
import org.junit.Test;

public class PriorityQueueTest 
{
	PriorityQueue priority = new PriorityQueue(6);
	
	@Test
	public void isEmptytest() 
	{
		assertEquals(true, priority.isEmpty());
		priority.add(2);
		
		assertEquals(false, priority.isEmpty());
		
		priority.remove(0);
		
		assertEquals(true, priority.isEmpty());
	}
	
	@Test
	public void isFulltest() 
	{
		assertEquals(false, priority.isFull());
		priority.add(3);
		priority.add(5);
		priority.add(4);
		priority.add(7);
		priority.add(6);
		priority.add(5);
		assertEquals(true, priority.isFull());
	}
	
	@Test
	public void sizetest()
	{
		assertEquals(0, priority.size());
	}
	
	@Test
	public void toStringtest()
	{
		assertEquals("[ ]", priority.toString());
		priority.add(3);
		priority.add(5);
		priority.add(4);
		priority.add(7);
		priority.add(6);
		priority.add(8);
		assertEquals("[8, 7, 6, 5, 4, 3]", priority.toString());
	}
	
}
