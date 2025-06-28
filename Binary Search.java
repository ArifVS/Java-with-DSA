//Binary Search
import java.util.*;

class binarySearch{
    static int search(int a[], int sea){
        int h = a.length-1;
        int l = 0;
        int mid=0;
        while(l<=h){
            mid = (h+l)/2;
            if(sea==a[mid]){
                return a[mid];
            }else if(sea<mid){
                h = mid-1;
                l = l;
                
            }else{
                l=mid+1;
                h = h;
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
        System.out.print("Enter the element to search:");
        int sea = sc.nextInt();
        binarySearch b = new binarySearch();
        System.out.print(b.search(a,sea));
    }
}
