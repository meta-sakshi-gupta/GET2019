import static org.junit.Assert.*;
import org.junit.Test;
public class PolyTest 
{
 Poly poly=new Poly(new int[]{1,2,3});
 Poly poly_1 = new Poly(new int[]{1,2,3,4});
 Poly poly_2 = new Poly(new int[]{-2,3});
 @Test
 public void testdegree() 
 {
  assertEquals(2,poly.degree());
  assertEquals(3,poly_1.degree());
 }
 @Test
 public void testaddPoly()
 {
	Poly poly_3 = new Poly(new int[]{2,4,6,4});
  assertEquals(poly_3,poly.addpoly(poly_1));
  assertEquals(new int[]{-1,5,3},poly.addpoly(poly_2));
 }
 @Test
 public void testmultiplyPoly()
 {
	assertEquals(new int[]{-2,-1,0,9},poly.multiplypoly(poly_2));
 }
 @Test
 public void testEvaluate()
 {
  assertEquals(49.0,poly_1.evaluate((float) 2.0));
 }

}
