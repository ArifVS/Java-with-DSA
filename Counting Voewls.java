// Counting Voewls
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int c = 0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(ch=='a' || ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                c++;
            }
        }
        System.out.print(c);
    }
}
