import static org.junit.Assert.*;

import org.junit.Test;
public class IntSetTest
{
 IntSet intset=new IntSet(new int[]{11,33,56,37,78});
 IntSet intset_1=new IntSet(new int[]{56,37,78});
 IntSet intset_2=new IntSet(new int[]{45,63,89,67});
 /*@Test
 public void testisMember()
 {
  assertEquals(true,intset.isMember(33));
  assertEquals(false,intset.isMember(22));
 }
 @Test
 public void testsize()
 {
  assertEquals(5,intset.size());
  assertEquals(3,intset_1.size());
 }
 @Test
 public void testisSubSet()
 {
  assertEquals(true,intset.isSubSet(intset_1));	
  assertEquals(false,intset.isSubSet(intset_2));
 }*/
 @Test
 public void testunion()
 {
  assertEquals(new int[]{56,37,78,45,63,89,67},intset.union(intset_1,intset_2));
  assertEquals(new int[]{11,33,56,37,78},intset.union(intset,intset_1));
 }
}
