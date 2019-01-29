public class Animal 
{
 String name,age;
 public static int id=1;
 float weight;
 public Animal(String name,String age,float weight)
 {
  this.name=name;
  this.age=age;
//  this.id=id;
//  id++;
  this.weight=weight;
  id++;
 }
 public String getName()
 {
  return name;
 }
 public String getAge()
 {
  return age;
 }
 public int getId()
 {
  return id;
 }
 public float getWeight()
 {
  return weight;
 }
 
 public void setName(String name)
 {
  this.name=name;
 }
 public void setAge(String age)
 {
  this.age=age;
 }
 public void setId(int id)
 {
  this.id=id;
 }
 public void setWeight(float weight)
 {
  this.weight=weight;
 }
}