
class Solution {

    public static void update(int a[], int n, int updates[], int k)
    {
        for ( int i = 0 ; i < k ; i++ ){
            int f = updates[i]-1;
            for ( int j = f ; j < n ; j++ ){
                a[j]++;
            }
        }
       // System.out.println(a.toString());
    }
    
}
