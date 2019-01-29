import java.util.ArrayList;
import java.util.List;


public class Reptile extends Animal
{
	String reptileType;
	 public Reptile(String reptileType,String name,String age,float weight)
	 {
	  super(name, age, weight);
	  this.reptileType=reptileType;
	 }
	 public enum ReptilelType
	 {
	  crocodile, snake;
	  public String getSound()
	  {
	   switch(this)
	   {
	   case crocodile:
		return "hiss";
	   case snake:
		 return "hiss";
	   default:
		 return "sound";
	   }
	  }
	 }
	 List<Zone> reptilezones = new ArrayList<Zone>();
	 final int max_Zone=3;
	 int left_zone=3;
	 public void addReptileZone(boolean hasPark, boolean hasCanteen)
	 {
	  if(left_zone>0)
	  {
		Zone zone=new Zone(hasPark, hasCanteen);
		reptilezones.add(zone);
		left_zone--;
	  }
	 }
}
