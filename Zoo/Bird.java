import java.util.ArrayList;
import java.util.List;


public class Bird extends Animal
{
	String birdType;
	 public Bird(String birdType,String name,String age,float weight)
	 {
	  super(name, age, weight);
	  this.birdType=birdType;
	 }
	public enum BirdType
	 {
	  sparrow, pigeon;
	  public String getSound()
	  {
	   switch(this)
	   {
	   case sparrow :
		return "chirp";
	   case pigeon:
		 return "coo";
	   default:
		 return "sound";
	   }
	  }
	 }
	List<Zone> birdzones = new ArrayList<Zone>();
	 final int max_Zone=3;
	 int left_zone=3;
	 public void addBirdZone(boolean hasPark, boolean hasCanteen)
	 {
	  if(left_zone>0)
	  {
		Zone zone=new Zone(hasPark, hasCanteen);
		birdzones.add(zone);
		left_zone--;
	  }
	 }
}
