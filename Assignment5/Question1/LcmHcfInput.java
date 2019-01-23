import java.util.Scanner;
public class LcmHcfInput
{
 Scanner scan = new Scanner(System.in);
 public int FirstNumber()
 {
  System.out.println("Enter the first number : ");
  int first_number = scan.nextInt();
  return first_number;
 }
 public int SecondNumber()
 {
  System.out.println("Enter the Second number : ");
  int second_number = scan.nextInt();
  return second_number;
 }
 public int Choice()
 {
  System.out.println("Enter your choice : ");
  System.out.println("1.LCM \n2.HCF \n3.exit");
  int choice = scan.nextInt();
  return choice;
 }
}
