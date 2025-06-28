// Sum of 2D array elemnts 
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int r = sc.nextInt();
        int c = sc.nextInt();
        int a[][] = new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                a[i][j] = sc.nextInt();
            }
        }
        System.out.println("The 2D array elements are: ");
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum = sum+a[i][j];
                System.out.print(a[i][j]+" ");
            }System.out.println();
        }
        System.out.print("The sum of 2D array elemnts are:"+sum);
        
    }
}
