//Binary Search
import java.util.*;
class Solution {
    public int search(int[] a, int t) {
        int h = a.length-1;
        int l = 0;
        int mid = 0;
        while(l<=h){
            mid = (l+h)/2;
            if(t==a[mid]){
                return mid;
            }else if(t<a[mid]){
                h = mid-1;

            }else{
                l = mid+1;
            }
        }return -1;
        
    }
}
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        Solution s = new Solution();
        System.out.print(s.search(a,t));
    }
}
