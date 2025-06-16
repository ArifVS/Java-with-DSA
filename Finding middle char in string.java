//with arguments, with return type
import java.util.*;
class Main{
    static char middleElement(String s){
        int l = s.length();
        int m = l/2;
        
        if(l%2==0){
            return s.charAt(m-1);
        }else{
            return s.charAt(m);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();
        System.out.print(middleElement(st));
    }
}
