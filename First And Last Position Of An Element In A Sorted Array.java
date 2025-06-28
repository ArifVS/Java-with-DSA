// 
import java.util.*;
class Solution {
    public int[] searchRange(int[] a, int t) {
        int range[]  = {-1,-1};
        int l=0,h=a.length-1,mid=0;
        while(l<=h){
            mid = (l+h)/2;
            if(a[mid]==t){
                range[0] = mid;
                h = mid-1;
            }else if(a[mid]<t){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }l=0;
        h=a.length-1;
        mid=0;
        while(l<=h){
            mid =(l+h)/2;
            if(a[mid]==t){
                range[1]=mid;
                l = mid+1;
            }else if(a[mid]<t){
                l = mid+1;
            }else{
                h = mid-1;
            }
        }return range; 
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
        System.out.print(Arrays.toString(s.searchRange(a,t)));

    }
}
