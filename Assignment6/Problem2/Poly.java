public final class Poly
{
	// for creating immutable class, final keyword is used
 private final int coefficients[];
 //passing reference parameters
 public Poly(int[] Coefficients)
 {
  this.coefficients = Coefficients;
 }
 //calculating the degree of the polynomial
 public int degree()
 {
 return (this.coefficients.length)-1;
 }
 //evaluating the value of the polynomial for a given variable
 /* *@param float value of variable
  * @return float value of result*/
 public float evaluate(float value)
 {
  double result_1 = 0; //initializing the result
  float result=0;
  double Value = (double)value;//type casting the value for power function
  for(int index=0;index<=this.degree();index++)
  result_1 = result_1 +(coefficients[index]*(Math.pow(Value,index)));
 return result=(float)result_1;//type casting the result in float value
 }
 //method for adding the polynomials
 // @param take two polynomials
 //@return array of added coefficients
 public Poly addpoly(Poly poly1)
 {
	 //size will be according to greater degree polynomial
  int size = this.degree()>poly1.degree()?(this.degree()+1):(poly1.degree()+1);
  int add[] = new int[size];
  for(int index =0;index<=this.degree();index++)
  add[index] = this.coefficients[index];//adding one polynomial's coefficient to empty array
  for(int index =0;index<=poly1.degree();index++)
  add[index] = add[index]+ poly1.coefficients[index];// adding second polynomial's coefficients to that of first polynomial
  return new Poly(add);
 }
 //method to multiply two polynomials
 public Poly multiplypoly(Poly poly1)
 {
  int size = (this.degree()+poly1.degree())+1;
  int product[]=new int[size];
  for(int index =0;index<size;index++)
  product[index]=0;
  for(int index=0;index<=this.degree();index++)
  {
   for(int index_1=0;index_1<=poly1.degree();index_1++)
   product[index+index_1]= product[index+index_1]+this.coefficients[index]*poly1.coefficients[index_1];
  }
  return new Poly(product);
 }
 //to print a polynomial with variable representation
 void printPoly()
 {
	 for (int index = 0; index <= this.degree(); index++) 
	 { 
         System.out.print(this.coefficients[index]); 
         if (index!=0) 
         System.out.print("x^"+index);  
         if (index != this.degree()) 
         { 
             System.out.print(" + "); 
         } 
     }
 }

}
