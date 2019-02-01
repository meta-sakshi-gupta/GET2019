import java.util.Arrays;
import java.util.Scanner;
public class QueensMain 
{
 public static void main(String args[]) 
 {
  System.out.println("Enter the order of chessboard : ");
  Scanner scan = new Scanner(System.in);
  int order= scan.nextInt();
  if(order<4)
  System.out.println("0");
  Position [] position = new Position [order];
  SolveNQueenOneSolution NQueen = new SolveNQueenOneSolution();
  position = NQueen.solveNQueenOneSolution(order);
  int[][] array=new int[order][order];
  for(int row =0;row<order;row++)
  {
	  for(int col=0;col<order;col++)
	  if (col==position[row].col)
	   array[row][col]=1;
	  else
  	array[row][col]=0;
  }
  System.out.println("possible solution is : ");
  for(int row=0;row<order;row++)
  {
   for(int col=0;col<order;col++)
	   System.out.print(array[row][col]+"  ");
   System.out.print("\n");
  }
 }
}
