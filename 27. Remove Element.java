class Solution {
    public int removeElement(int[] a, int t) {
        int i=0;
        for(int j=0;j<a.length;j++){
            if(a[j]!=t){
                a[i] = a[j];
                i++;
            }
        } return i;


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
        int k = s.removeElement(a,t);
        System.out.print(k);
        for(int i=0;i<k;i++){
            System.out.print(a[i]+" ");
        }
    }
}
