
// Sliding Window
import java.util.*;
class Main{
    public static int sub(int[] a){
    int sw = 0;
    int max = Integer.MIN_VALUE;
    int k = 3;
    for(int i=0;i<k;i++){
        sw = sw+a[i];
    }
    for(int i=k;i<a.length;i++){
        sw = sw-a[i-k]+a[i];
        max = Math.max(max,sw);
    }
    return max;
}

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.print(sub(a));
    }
    
}
