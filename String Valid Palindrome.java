// Valid Palindrome
import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        String c = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb = new StringBuilder(c);
        sb.reverse();
        if(sb.toString().equals(c)){
            return true;
        }else{
            return false;
        }
     
        
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        Solution ss = new Solution();
        System.out.print(ss.isPalindrome(s));
    }
}
// Another method
// Reversing a String
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        System.out.println(sb);
        if(s.equals(sb.toString())){
            System.out.println("String is palindrom");
        }else{
            System.out.println("String is not palindrom");
        }
    }
}
