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
  Arrays.stream(position).forEach(pos -> System.out.println(pos.row + " " + pos.col));
  }

}
