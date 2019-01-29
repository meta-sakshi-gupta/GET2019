import java.util.ArrayList;
import java.util.List;


public class Cage 
{
 final int max_Animal = 3;
 int animal_left=3;
 List<Animal> animalInCage = new ArrayList<Animal>();
 public void addAnimalToCage(Animal animal)
 {
	if(animal_left>0)
	 {
     animalInCage.add(animal);
     animal_left--;
	 }
 }
 public void removeAnimalFromCage(int id)
 {
  animalInCage.remove(id);
  animal_left++;
 }
}
