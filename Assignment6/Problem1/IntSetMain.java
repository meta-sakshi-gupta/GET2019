import java.util.Scanner;


public class IntSetMain 
{
 public static void main(String args[])
 {
  IntSet intSet=new IntSet(new int[]{11,22,33,44,55,66});
  IntSet intSet_1=new IntSet(new int[]{11,33});
  IntSet intSet_2=new IntSet(new int[]{88,77});
  System.out.println("isMember : "+intSet.isMember(22));
  System.out.println("isSubset : "+intSet.isSubSet(intSet_1));
  System.out.println("size : "+intSet.size());
  System.out.println("Complement : ");
  intSet.getComplement().printSet();
  System.out.println("Union : ");
  intSet.union(intSet, intSet_2).printSet();
 }
 
}
