class Solution {
    public int largestElement(int[] a) {
      int l=0;
      l=a[0];
      for(int i=0;i<a.length;i++){
        if(a[i]>l){
            l=a[i];
        }
      }return l;
    }
}
