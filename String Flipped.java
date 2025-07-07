//Flipped string from 0 to 1 , 1 to 0
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String r ="";
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='0'){
                r = r+'1';
            }else if(c=='1'){
                r=r+'0';
            }else{
                System.out.print("Invalid Character found"+c);
            }
        }
        System.out.println("Flipped String: "+r);
    }
}
