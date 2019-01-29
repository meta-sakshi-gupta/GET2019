import java.util.Scanner;
public class ZooMain
{
 public static void main(String args[])
 {
	 Scanner scan=new Scanner(System.in);
 System.out.println("Enter the animal you want to add ");
 System.out.println("1.Mammal\n2.Reptile\n3.Bird");
 int choice=scan.nextInt();
 switch(choice)
 {
  case 1:
  {
  System.out.println("Tiger or dog ?");
  String type=scan.nextLine();
  System.out.println("Enter its name ");
  String name=scan.nextLine();
  System.out.println("Enter its age ");
  String age=scan.nextLine();
  System.out.println("Enter its weight ");
  float weight=scan.nextInt();
  Mammal mammal=new Mammal(type,name,age,weight);
  break;
  }
 case 2:
  {
  System.out.println("Crocodile or snake ?");
  String type=scan.nextLine();
  System.out.println("Enter its name ");
  String name=scan.nextLine();
  System.out.println("Enter its age ");
  String age=scan.nextLine();
  System.out.println("Enter its weight ");
  float weight=scan.nextInt();
  Reptile reptile=new Reptile(type,name,age,weight);
  break;
  }
 case 3:
  {
  System.out.println("Sparrow or Pigeon ?");
  String type=scan.nextLine();
  System.out.println("Enter its name ");
  String name=scan.nextLine();
  System.out.println("Enter its age ");
  String age=scan.nextLine();
  System.out.println("Enter its weight ");
  float weight=scan.nextInt();
  Bird bird=new Bird(type,name,age,weight);
  break;
  }
  default:
  break;
  }
 }
}
