// Fibonaaci series
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int a=0,b=1;
        for(int i=0;i<=n;i++){
            int c = a+b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
        
    }
}
