import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int res = Math.max(a,b);
        System.out.println("Max num is: "+res);
        while(true){
            if(res%a==0 && res%b==0){
                break;
            }res++;
        }
        System.out.println("LCM is: "+res);
    }
}
