package Dynamic_Programming;

class Solution {
    public int amt(int[] arr,int i,int []dp){
        if(i>=arr.length) return 0;
        if(dp[i]!=-1) return dp[i];
        int take = arr[i] + amt(arr,i+2,dp);
        int skip = amt(arr,i+1,dp);
        return dp[i] = Math.max(take,skip);
    }
    public int rob(int[] nums) {
        int n =nums.length;
        int dp[] = new int[n];
        Arrays.fill(dp,-1);
        return amt(nums,0,dp);
    }
}