import java.util.Scanner;
public class SparseInput 
{
 Scanner scan = new Scanner(System.in);
 public int rows(String string)
 {
  System.out.println(string);
  int ROWS = scan.nextInt();
  return ROWS;
 }
 public int columns(String string)
 {
  int COLUMNS = scan.nextInt();
  return COLUMNS;
 }
  public int[][] sparseInput(int ROWS, int COLUMNS)
  {
  System.out.println("Enter the no. of non-zero elements : ");
  int number = scan.nextInt();
  System.out.println("Enter the positions and values of sparse matrix : ");
  int[][] Sparse = new int[number][3];
  for(int index =0;index<number;index++)
  {
	if(Sparse[index][0]<=ROWS||Sparse[index][1]<COLUMNS)
	{
    Sparse[index][0]=scan.nextInt();
    Sparse[index][1]=scan.nextInt();
    Sparse[index][2]=scan.nextInt();
	}
	else
    System.out.println("Invalid Entry!");
  }
  System.out.println("Entered Sparse matrix data is : ");
  for(int index=0;index<number;index++)
  {
  System.out.print(Sparse[index][0]+" , "+Sparse[index][1]+" , "+Sparse[index][2]);
  System.out.print("\n");
  }
  return Sparse;
 }
 public int Choice()
 {
  System.out.println("Enter your choice : ");
  System.out.println("1.Transpose \n2.Symmetricity \n3.Addition \n4.Multiplication \n5.exit");
  int choice = scan.nextInt();
  return choice;
 }
}
