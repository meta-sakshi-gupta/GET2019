
import java.util.Scanner;

public class MarkSheetInput 
{
 Scanner scan = new Scanner(System.in);
 
  //method for getting no. of students
 //@param no. of students should be greater than or equal to zero
    public int getStudentsInput()
    {
      System.out.println("Enter the no. of students : ");
      int students = scan.nextInt();
      return students;
    }
 
    //method for getting the grades of students
    // @ param grades should be between 0 and 100 both inclusive
    public float[] getMarksInput(int Students)
    {
      float[] Marks=new float[Students];
      System.out.println("Enter the grades of the students : ");
      for(int marks=0;marks<Students;marks++)
      {
    	Marks[marks] = scan.nextFloat();
      }
      return Marks;
    }
}