// Hallow pattern
import java.util.*;
public class patterns{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
      
        int i,j,m,n;
      
        System.out.print("Enter n(row) value:");
        n = sc.nextInt();
      
        System.out.print("Enter m(column) values:");
        m = sc.nextInt();
      
        for(i=0;i<n;i++)
        {
            for(j=0;j<m;j++)
            {
                if(i==0||j==0 || i==n-1|| j==m-1)
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
                
            }
            System.out.println();
            
        }
    }
}
