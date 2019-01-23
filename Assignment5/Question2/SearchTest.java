import static org.junit.Assert.*;
import org.junit.Test;
public class SearchTest
{
 LinearSearch linearSearch = new LinearSearch();
 BinarySearch binarySearch = new BinarySearch();
 @Test
 public void testlinear() 
 {
  assertEquals(3,linearSearch.Linear_Search(new int[]{21,43,65,37,57,86},37,0));
  assertEquals("Value not found",linearSearch.Linear_Search(new int[]{21,34,25,76,47},36,0));
 }
 @Test
 public void testbinary()
 {
  assertEquals(2,binarySearch.Binary_Search(new int[]{35,67,75,89,98},75));
 }

}
