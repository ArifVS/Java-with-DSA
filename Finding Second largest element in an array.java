// Finding Second largest element
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MIN_VALUE;
        if(a[0]>a[1]){
            max = a[0];
            min = a[1];
        }else{
            min = a[0];
            max = a[1];
        }for(int i=2;i<a.length;i++){
            if(a[i]>max){
                min = max;
                max = a[i];
            }else if(a[i]>min){
                min = a[i];
            }
        }System.out.print("First Largerst element is:"+max+"Second largest element is:"+min);
    }
}
