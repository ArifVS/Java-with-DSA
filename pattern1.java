import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<n;i++){
            for(int j=i;j<=n;j++){
                System.out.print(j+" ");
            }System.out.println();
        }
    }
}


// Output : 
// 1 2 3 4 5
// 2 3 4 5
// 3 4 5 
// 4 5 
// 5

public class Pattern {
    public static void main(String[] args) {
        int n = 4; 

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }                    
            System.out.println(); 
        }
    }
}

// output:
// 1
// 1 2
// 1 2 3 
// 1 2 3 4     
