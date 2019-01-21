
public class MarkSheetMenu 
{
	public void Menu()
	 {
		 MarkSheetInput marksheetinput = new MarkSheetInput();
		 int Students = marksheetinput.getStudentsInput();
		 
		 float[] Marks = new float[Students];
		 Marks = marksheetinput.getMarksInput(Students);
		 
		 MarkSheetAverage gradeaverage = new MarkSheetAverage();
		 System.out.println("Average of the grades is : "+gradeaverage.getAverage(Students,Marks));
		 
		 MarkSheetMaximum grademax = new MarkSheetMaximum();
		 System.out.println("Maximum grade is : "+grademax.getMaximum(Students,Marks));
		 
		 MarkSheetMinimum grademin = new MarkSheetMinimum();
		 System.out.println("Minimum grade is : "+grademin.getMinimum(Students,Marks));
		 
		 MarkSheetPass pass = new MarkSheetPass();
		 System.out.println("Percentage of students passed is : "+pass.getPass(Students,Marks));
	 }
}
