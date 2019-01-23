
public class LCM
{
 public int findLCM(int big, int small, int original_big)
 {
  if(big%small==0)
  {
   return big;
  }
  else
  {
   return (findLCM(big+original_big,small,original_big));
  }
 }
}
