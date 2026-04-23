// Prime Number
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        int count = 0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count = count+1;
            }
        }
        if(count==2){
            System.out.print("Prime number");
        }else{
            System.out.print("Not a prime number");
        }
    }
}
