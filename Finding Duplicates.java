//Finding Duplicates in an array
import java.util.*;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==nums[i+1]) return true;
            }return false;
        }
    }
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[]  = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        Solution s = new Solution();
        System.out.print(s.containsDuplicate(a));
    }
}
