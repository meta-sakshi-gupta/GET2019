
public class MarkSheetAverage 
{
   //method for calculating average of the grades
 public float getAverage(int Students, float[]Marks)
 {
	 float average=0,total=0;
	 // loop for accessing grades of each student one by one
  for(int marks=0; marks<Students; marks++)
   { 
	 total =total+Marks[marks];
   }
  average = total/Students;
  return average;
 }
}
