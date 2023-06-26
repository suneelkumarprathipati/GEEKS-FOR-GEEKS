class Solution{
    static int nCr(int n, int r)
    {
        if( n==0 || n == r) return 1;
        int [] dp = new int[r+1];
        int mod = 1000000007;
        dp[0] = 1;
        for(int i=1; i<=n; i++){
            for(int j=Math.min(r, i);j>0 ; j--){
                dp[j] = dp[j] + dp[j-1];
                dp[j] = dp[j]%mod;
            }
        }
        return dp[r];
    }
}
