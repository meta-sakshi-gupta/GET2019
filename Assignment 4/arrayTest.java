import static org.junit.Assert.*;

import org.junit.Test;

 // jUnit test class for testing array methods
public class arrayTest 
{
 ArrayLargestMirrorSection largest_Mirror_Section = new  ArrayLargestMirrorSection();
 ArrayClumps array_clumps = new ArrayClumps();
 ArrayFixXY array_FixXY = new ArrayFixXY();
 ArraySplit arraySplit = new ArraySplit();
 @Test
 public void testMirrorSection()
 {
  assertEquals(3,largest_Mirror_Section.maxMirror(8,new int[] {1,2,3,8,9,3,2,1}));
 }
 @Test
 public void testClumps()
 {
  assertEquals(2,array_clumps.countClumps(6,new int[]{1,2,2,3,4,4}));
 }
 public void testFixXY()
 {
  assertEquals(new int[]{1,4,5,1,1,4,5},array_FixXY.SolveFixX_Y(7, new int[]{1,4,1,5,5,4,1}, new int[]{4,5}));
 }
 public void testSplit()
 {
  assertEquals(-1,arraySplit.splitArray(5, new int[] {2,1,1,2,1}));
 }
}
