import java.util.ArrayList;
import java.util.List;


public class Zone 
{
 final int max_Cage=3;
 boolean hasPark,hasCanteen;
 static int zoneID=1;
 List <Cage> cages = new ArrayList<Cage>();
 int cage_left=3;
 Zone(boolean hasPark, boolean hasCanteen)
 {
  this.hasCanteen=hasCanteen;
  this.hasPark=hasPark;
  zoneID++;
 }
 public void addCageToZone()
 {
  if(cage_left>0)
  {
   Cage cage=new Cage();
   cages.add(cage);
   cage_left--;
  }
 }
}
