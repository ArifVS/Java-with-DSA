// First and last character print in String
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(s);
        //First char
        System.out.println(s.charAt(0));
        //Last char
        System.out.println(s.charAt(s.length()-1));
    }
}
