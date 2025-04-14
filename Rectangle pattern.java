// First Pattern Rectangle(with n= 4(rows), m=5(columns))
// *****
// *****
// *****
// *****
import java.util.*;
public class Patterns {
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    
    int n,m,i,j;
    
    System.out.print("Enter n value:");
    n = sc.nextInt();
    
    System.out.print("Enter m value:");
    m = sc.nextInt();
    
    for(i=0;i<n;i++)
    {
      for(j=0;j<m;j++)
      {
        System.out.print("*");
      }
      System.out.println();

    }

  }
}
