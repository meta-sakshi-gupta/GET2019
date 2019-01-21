public class MarkSheetPass 
{
 public float getPass(int Students, float[]Marks)
 {
   int fail = 0,pass_students=0,passmarks=40;// Minimum passing marks is 40
   float pass_percent = 0,pass_fraction = 0;
   for(int marks =0; marks<Students; marks++)
   {
	 if(Marks[marks]<passmarks)
	 {
		fail=fail+1;
	 }
   }
   pass_students = Students-fail;
   pass_fraction = pass_students*100;
   pass_percent = pass_fraction/Students;
   
   return pass_percent;
 }
}
