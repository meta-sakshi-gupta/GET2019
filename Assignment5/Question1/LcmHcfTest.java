import static org.junit.Assert.*;
import org.junit.Test;
public class LcmHcfTest 
{
 HCF hcf=new HCF();
 LCM lcm= new LCM();
 @Test
 public void testLCM() 
 {
  assertEquals(840,lcm.findLCM(140, 120, 140));	
 }
 @Test
 public void testHCF()
 {
  assertEquals(1,hcf.findHCF(10213, 312));
 }
}
