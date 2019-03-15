import static org.junit.Assert.*;

import java.util.HashMap;

import org.junit.Test;

public class CricketTest
{

	CricketSort sort = new CricketSort();

	@Test
	public void testfindOrderOfBolres() throws Exception
	{
		HashMap<Integer, Integer> map1 = new HashMap<>();
		map1.put(1, 3);
		map1.put(2, 5);
		map1.put(3, 4);

		HashMap<Integer, Integer> map2 = new HashMap<>();
		map2.put(1, 1);
		map2.put(2, 2);
		map2.put(3, 2);
		
		assertArrayEquals(new int[] {2,2,3,1,2,3,1,2,3,1,2,3}, sort.cricketFunction(12, 3, map1));
		
		assertArrayEquals(new int[] {2,3,1,2,3}, sort.cricketFunction(5, 3, map2));
		try
		{
			sort.cricketFunction(6, 3, map2);
		}
		catch(Exception e)
		{
			assertEquals(e.getMessage(),"Total number of balls of balls should be equal to Virat's");
		}

	}
}