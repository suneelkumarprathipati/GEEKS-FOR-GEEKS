class Solution {
    int[] kLargest(int[] arr, int n, int k) {
        int[] ret = new int[k];
        Arrays.sort(arr);
        for ( int i = 0 ; i < k ; i++ ){
            ret[i] = arr[n-1-i] ;
        }
        return ret;
    }
}
