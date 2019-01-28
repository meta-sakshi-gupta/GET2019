
public class SparseMenu 
{
 public void menu()
 {
  SparseInput sparse_input = new SparseInput();
  int ROWS = sparse_input.rows("Enter the no. of rows of sparse matrix : ");
  int COLUMNS=sparse_input.columns("Enter the vo. of columns of sparse matrix : ");
  int[][]SparseMatrix=sparse_input.sparseInput(ROWS, COLUMNS);
  Sparse sparse = new Sparse(SparseMatrix);
  int choice=sparse_input.Choice();
  switch(choice)
  {
  case 1:
  {
   System.out.println("Transpose is : ");
   new Sparse(sparse.transpose()).SparsePrint();
   break;
  }
  case 2:
  {
   if( sparse.isSymmetric())
   System.out.println("Symmetric ");
   else
   System.out.println(" not Symmetric ");
   break;
  }
  case 3:
  {
   int ROWS1 = sparse_input.rows("Enter the no. of rows of second sparse matrix : ");
   int COLUMNS1=sparse_input.columns("Enter the vo. of columns of second sparse matrix : ");
   if(ROWS!=ROWS1 && COLUMNS!=COLUMNS1)
   System.out.println("Addition is not possible!");
   else
   {
   int[][]SparseMatrix1 = sparse_input.sparseInput(ROWS1,COLUMNS1);
   Sparse sparse1 = new Sparse(SparseMatrix1);
   System.out.println("Addition is : ");
   sparse.Addition(sparse1).SparsePrint();
   }
   break;
  }
  case 4:
  {
  int ROWS1 = sparse_input.rows("Enter the no. of rows of second sparse matrix : ");
  int COLUMNS1=sparse_input.columns("Enter the vo. of columns of second sparse matrix : ");
  if(COLUMNS!=ROWS1)
  System.out.println("Multiplication is not possible!");
  else
   {
    int[][]SparseMatrix1 = sparse_input.sparseInput(ROWS1,COLUMNS1);
    Sparse sparse1 = new Sparse(SparseMatrix1);
    System.out.println("Multiplication is : ");
    sparse.Multiplication(sparse1).SparsePrint();
   }
  }
 }
 }
}
