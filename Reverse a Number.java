// Reverse a Number
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int rev = 0;
        while (n>0){
            int m = n%10;
            rev = (rev*10)+m;
            n = n/10;
            
        }
        System.out.print(rev);
    }
}
