import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];
        int[] res = new int[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            int prod = 1;
            for(int j=0; j<arr.length;j++){
                if(i!=j){
                    prod = prod*arr[j];
                }
            }
            res[i] = prod;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(res[i]+" ");
        }
    }
}
