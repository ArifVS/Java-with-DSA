import java.util.*;
class Solution {
    public void reverseString(char[] c) {
        int left=0;
        int right = c.length-1;
        while(left<right){
            char temp = c[left];
            c[left] = c[right];
            c[right] = temp;
            left++;
            right--;
        }for(int i=0;i<c.length-1;i++){
            System.out.print(c[i]);
        }
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char[] c = s.toCharArray();
        Solution ss = new Solution();
        ss.reverseString(c);
        

    }
}
