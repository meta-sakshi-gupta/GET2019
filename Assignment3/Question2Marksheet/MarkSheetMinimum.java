public class MarkSheetMinimum 
{
	//method for finding minimum of grades
	public float getMinimum(int Students, float[]Marks)
	  {
		//initializing minimum grade
		float min_grade=Marks[0];
		for(int marks=1; marks<Students; marks++)
		{
		  if(Marks[marks]<min_grade)
			{
			  min_grade=Marks[marks];
			}
		}
		return min_grade;
	  }
}
