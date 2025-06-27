//Sub Arrya's
import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++){
            a[i] = sc.nextInt();
        }
        for(int i=0;i<a.length;i++){
            for(int j=i;j<a.length+1;j++){
                for(int k=i;k<j;k++){
                    System.out.print(a[k]+" ");
                }System.out.println();
            }
        }
    }
}

// Output:
// 5
//   1 2 3 4 5

//   1 
//   1 2 
//   1 2 3
//   1 2 3 4
//   1 2 3 4 5

//   2 
//   2 3
//   2 3 4 5
//   ......
  
