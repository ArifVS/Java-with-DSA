// Converting 1D array to 2D array
import java.util.*;
class Solution {
    public int[][] construct2DArray(int[] a, int r, int c) {
        int a1[][] = new int[r][c];
        if(a.length!=r*c){
            return new int[0][0];
        }
        for(int i=0;i<a.length;i++){
            int r1 = i/c;
            int c1 = i%c;
            a1[r1][c1] = a[i];

        }return a1;

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
        int r = sc.nextInt();
        int c = sc.nextInt();
        Solution s = new Solution();
        System.out.print(Arrays.deepToString(s.construct2DArray(a,r,c)));

    }
}
