public final class Sparse 
{
 private final int[][]SparseMatrix;
 public Sparse(int[][]SparseMatrix)
 {
  this.SparseMatrix=SparseMatrix;
 }
 public int length()
 {
  int number=0;
  try
  {
  while(SparseMatrix[number][2]!=0)
  number++;
  }
  catch(ArrayIndexOutOfBoundsException e)
  {
   System.out.println("");
  }
  return number;
 }
 public int[][] transpose()
 {
  int[][] result = new int[this.length()][3];
  
  for(int index=0;index<this.length();index++)
  { 
	if(this.SparseMatrix[index][0]!=this.SparseMatrix[index][1])
	{
    result[index][0]=this.SparseMatrix[index][1];
    result[index][1]=this.SparseMatrix[index][0];
    result[index][2]=this.SparseMatrix[index][2];
	}
  }
 /* int swap[][]=new int[1][3];
  for(int index=0;index<this.length();index++)
  {
   for(int index_1=index+1;index_1<this.length();index_1++)
   {
	if(this.SparseMatrix[index][0]>this.SparseMatrix[index_1][0])
	{
     swap[0][0]=result[index][0];
     swap[0][1]=result[index][1];
     swap[0][2]=result[index][2];
     result[index][0]=result[index_1][0];
     result[index][1]=result[index_1][1];
     result[index][2]=result[index_1][2];
     result[index_1][0]=swap[0][0];
     result[index_1][1]=swap[0][1];
     result[index_1][2]=swap[0][2];
	}
   }
  }
  int swap_1[][]=new int[1][3];
  for(int index=0;index<this.length();index++)
  {
   for(int index_1=index+1;index_1<this.length();index_1++)
   {
	if(this.SparseMatrix[index][1]>this.SparseMatrix[index_1][1]&& this.SparseMatrix[index][0]==this.SparseMatrix[index_1][0])
	{
     swap_1[0][0]=result[index][0];
     swap_1[0][1]=result[index][1];
     swap_1[0][2]=result[index][2];
     result[index][0]=result[index_1][0];
     result[index][1]=result[index_1][1];
     result[index][2]=result[index_1][2];
     result[index_1][0]=swap_1[0][0];
     result[index_1][1]=swap_1[0][1];
     result[index_1][2]=swap_1[0][2];
	}
   }
  }*/
  return result;
 }
 
 public boolean isSymmetric()
 {
	int[][] Transpose=this.transpose();
	 Sparse trans_pose=new Sparse(this.transpose());
  for(int index=0;index<this.length();index++)
  {
   for(int index_1=0;index_1<trans_pose.length();index_1++)
   {
	 if(this.SparseMatrix[index][0]==Transpose[index_1][0] && this.SparseMatrix[index][1]==Transpose[index_1][1])
	 {
		if(this.SparseMatrix[index][2]!=Transpose[index_1][2]) 
		return false;
	 }
   }
  }
  return true;
 }
 public Sparse Addition(Sparse sparse_1)
 {
  int index_1=0,index_2=0,index=0;
  int[][] result=new int [this.length()+sparse_1.length()][3];
  while(index_1<this.length() && index_2<sparse_1.length())
  {
   if(this.SparseMatrix[index_1][0]<sparse_1.SparseMatrix[index_2][0] || (this.SparseMatrix[index_1][0]==sparse_1.SparseMatrix[index_2][0] && this.SparseMatrix[index_1][1]<sparse_1.SparseMatrix[index_2][1] ))
   {
	result[index][0]=this.SparseMatrix[index_1][0];
	result[index][1]=this.SparseMatrix[index_1][1];
	result[index][2]=this.SparseMatrix[index_1][2];
	index++;
	index_1++;
   }
   else if(this.SparseMatrix[index_1][0]>sparse_1.SparseMatrix[index_2][0] || (this.SparseMatrix[index_1][0]==sparse_1.SparseMatrix[index_2][0] && this.SparseMatrix[index_1][1]>sparse_1.SparseMatrix[index_2][1] ))
   {
	 result[index][0]=sparse_1.SparseMatrix[index_2][0];
     result[index][1]=sparse_1.SparseMatrix[index_2][1];
     result[index][2]=sparse_1.SparseMatrix[index_2][2];
     index_2++;
     index++;
   }
   else
   {
	int addvalue = this.SparseMatrix[index_1][2]+sparse_1.SparseMatrix[index_2][2];
	if(addvalue!=0)
	{
		result[index][0]=this.SparseMatrix[index_1][0];
		result[index][1]=this.SparseMatrix[index_1][1];
     result[index][2]=addvalue;
     index_1++;
     index_2++;
     index++;
	}
   }
  }
  while(index_1<this.length())
  {
	  result[index][0]=this.SparseMatrix[index_1][0];
	  result[index][1]=this.SparseMatrix[index_1][1];
	  try
	  {
	  result[index++][2]=this.SparseMatrix[index_1++][2];
	  }
	  catch(ArrayIndexOutOfBoundsException ae)
	  {
		  System.out.println("");
	  }
  } 
  while(index_2<sparse_1.length())
  {
	  result[index_2][0]=sparse_1.SparseMatrix[index_2][0];
	  result[index_2][1]=sparse_1.SparseMatrix[index_1][1];
	  result[index_2++][2]=sparse_1.SparseMatrix[index_1++][2];
  }
  
  return new Sparse(result);
 }
 
 
 
 public void SparsePrint()
 {
  for(int index=0;index<this.length();index++)
  {
   System.out.print(this.SparseMatrix[index][0]+" , "+this.SparseMatrix[index][1]+" , "+this.SparseMatrix[index][2]);
   System.out.print("\n");
  } 
 }
}