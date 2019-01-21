public class MarkSheetMaximum 
{
	// method for finding maximum of grades
  public float getMaximum(int Students, float[]Marks)
  {
	float max_grade=0;
	for(int marks=0; marks<Students; marks++)
	{
	  if(Marks[marks]>max_grade)
		{
		  max_grade=Marks[marks];
		}
	}
	return max_grade;
  }
}