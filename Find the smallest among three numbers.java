// No Argument, No return using methods in java

import java.util.*;
class Main{
    static void smallestNumber(){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int smallest = (a<b && a<c)? a:(b<c?b:c);
        System.out.print(smallest);
            
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        smallestNumber();
    }
}
