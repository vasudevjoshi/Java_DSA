package Dynamic_Programming;
//leetcode 279
class Solution {
    public boolean isPrefectSquare(int n){
        int sqrt = (int)(Math.sqrt(n));
        return sqrt*sqrt ==n;
    }
    //  public int minSquares(int n,int []dp) {
    //     if(isPrefectSquare(n))return 1;
    //     if(dp[n]!=-1) return dp[n];
    //     int min =Integer.MAX_VALUE;
    //     for(int i=1;i*i<=n;i++){
    //         int count = minSquares(i*i,dp) + minSquares(n - i*i,dp);
    //         min = Math.min(count,min);
    //     }
    //     return dp[n] =min;
    // }

    // Tabulation:
    
    public int numSquares(int n) {
        int []dp = new int[n+1];
        // Arrays.fill(dp,-1);
        // return minSquares(n,dp);
        for(int i =1;i<=n;i++){
            if(isPrefectSquare(i)) dp[i] =1;
            else{
                int min = Integer.MAX_VALUE;
                for(int j = 1;j*j<=i;j++){
                    int count = dp[j*j] + dp[i -j*j];
                    min = Math.min(min,count);
                }
                dp[i] = min;
            }
        }
        return dp[n];
    }
}
