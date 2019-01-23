public class SolveNQueenOneSolution 
{
 public Position [] solveNQueenOneSolution(int order) 
  {
   Position[] positions = new Position[order];
   boolean hasSolution = solveNQueenOneSolutionUtil(order, 0, positions);
    if (hasSolution) 
    return positions;
   else 
   return new Position[0];
  }
 public boolean solveNQueenOneSolutionUtil(int order, int row, Position[] positions) 
  {
   if (order == row) 
   return true;
   int col;
   for (col = 0; col < order; col++) 
   {
    boolean foundSafe = true;
         //check if this row and col is not under attack from any previous queen.
     for (int queen = 0; queen < row; queen++) 
     {
       if (positions[queen].col == col || positions[queen].row - positions[queen].col == row - col ||
             positions[queen].row + positions[queen].col == row + col) 
          {
            foundSafe = false;
            break;
          }
     }
      if (foundSafe) 
       {
        positions[row] = new Position(row, col);
        if (solveNQueenOneSolutionUtil(order, row + 1, positions)) 
        return true;
       }  
    }
    return false;
  }
}
