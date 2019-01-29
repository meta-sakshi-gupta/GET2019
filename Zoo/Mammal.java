import java.util.ArrayList;
import java.util.List;


public class Mammal extends Animal
{
 String mammalType;
 public Mammal(String mammalType,String name,String age,float weight)
 {
  super(name, age, weight);
  this.mammalType=mammalType;
 }
 public enum MammalType
 {
  tiger, dog;
  public String getSound()
  {
   switch(this)
   {
   case tiger:
	return "roar";
   case dog:
	 return "bark";
   default:
	 return "sound";
   }
  }
 }
 List<Zone> mammalzones = new ArrayList<Zone>();
 final int max_Zone=3;
 int left_zone=3;
 public void addMammalZone(boolean hasPark, boolean hasCanteen)
 {
  if(left_zone>0)
  {
	Zone zone=new Zone(hasPark, hasCanteen);
	mammalzones.add(zone);
	left_zone--;
  }
 }
}
