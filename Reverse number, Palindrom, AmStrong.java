// Reverse number, Palindrom, AmStrong 
import java.util.*;
class Main{
    
    //Function for Reversing a number
    static int reverse(int n){
        int temp = 0;
        while(n!=0){
            int n1 = n%10;
            temp = temp*10 +n1;
            n = n/10;
        }
        return temp;
    }
    
    
    //Function for palindrom
    static void palindrom(int n){
        int o = n;
        int t = 0;
        while(n!=0){
            int d = n%10;
            t = t*10+d;
            n = n/10;
        }
        if(t==o){
            System.out.println(t+" is a palindrom");
        }else{
            System.out.println(t+" is not a palindrom");
        }
    }
    
    //Function for AmStrong
    static void amStrong(int n){
        int o = n;
        int t = 0;
        while(n!=0){
            int n1 = n%10;
            t = t+(int)Math.pow(n1,3);
            n = n/10;
        }
        if(t==o){
            System.out.println(t+" It is Amstrong");
        }
        else{
            System.out.println(t+" It is not an Amstrong");
        }
    }
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        //Calling a Reverse function
        System.out.println(reverse(n));
        //Calling a Palindrom 
        palindrom(n);
        //Calling a amStrong
        amStrong(n);
    
    }
}
