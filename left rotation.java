// Left rotation
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print("Enter the number of elemnt to rotate:");
        int k = sc.nextInt();
        for(int i=k;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
