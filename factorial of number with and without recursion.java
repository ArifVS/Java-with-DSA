import java.util.*;
class Main{
        static int fact(int n){
           if(n==0||n==1){
            return 1;
        }
        return n*fact(n-1); 
        }
       public static void main(String[] args){
           System.out.print(fact(5));
    }
}

// Factorial of numeber without recursion
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }
        System.out.print(fact);
    }
}
