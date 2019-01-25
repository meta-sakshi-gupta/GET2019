public class PolyMenu 
{
 public void menu()
 {
 PolyInput poly_input = new PolyInput();
 int []Coefficients=poly_input.polyInput("Enter the degree of Polynomial : ");
 Poly poly = new Poly(Coefficients);
 int choice = poly_input.Choice();
 switch(choice)
 {
 case 1:
 {
  float value = poly_input.Value();
  System.out.println("Result is : "+poly.evaluate(value));
  break;
 }
 case 2:
 {
 System.out.println("Degree is : "+poly.degree());
 break;
 }
 case 3:
 {
 PolyInput poly_input_1 = new PolyInput();
 int[] Coefficients_1=poly_input_1.polyInput("Enter the degree of Second Polynomial : ");
 Poly poly_1=new Poly(Coefficients_1);
 System.out.println("Addition is : ");
 poly.addpoly(poly_1).printPoly();
 break;
 }
 case 4:
 {
  PolyInput poly_input_1 = new PolyInput();
  int[] Coefficients_1=poly_input_1.polyInput("Enter the degree of Second Polynomial : ");
  Poly poly_1=new Poly(Coefficients_1);
  System.out.println("Multiplication is : ");
  poly.multiplypoly(poly_1).printPoly();
  break;
 }
 case 5:
 {
  System.exit(0);
  break;
 }
 default:
	 System.out.println("Invalid choice!");
	 break;
}
}
}
