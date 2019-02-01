import static org.junit.Assert.*;

import org.junit.Test;
public class NQueenTest 
{
 SolveNQueenOneSolution solve_NQueen = new SolveNQueenOneSolution();
 @SuppressWarnings("deprecation")
@Test
 public void test()
 {
	 int[][] expArr={{0,1},{1,3},{2,0},{3,2}};
  assertEquals(expArr,solve_NQueen.solveNQueenOneSolution(4));
 }
}
