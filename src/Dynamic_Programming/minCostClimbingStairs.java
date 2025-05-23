package Dynamic_Programming;

public class minCostClimbingStairs {
	// recursive code: 
	/* Approach: 
	 * 	here we start from the last and last but one and then go on finding the minimum the sum of the current step and using value of the step from one jump or two jump through 
	 * recursion. Once upon reaching the base case we return the value of the cost
	 * */
	 public int minCost(int []cost,int idx){
	        if(idx == 0 || idx  == 1) return cost[idx];
	        return cost[idx] + Math.min(minCost(cost,idx - 1),minCost(cost,idx - 2));
	    }
	    public int minCostClimbingStairs(int[] cost) {
	        int n = cost.length;
	        return Math.min(minCost(cost,n-1),minCost(cost,n-2));
	    }
	    // TC : tle error and O(2^N) and SC: O(N); recursive space;
	    
	  // recursive and memoziation code: 
	    /* Approach: 
	     * While for the first call of recursive we store the results in the dp array, so whenever we need the answer for the
	     * particular value we take the value from the dp array.
	     * */
	    public int minCost(int []cost,int idx,int []dp){
	        if(idx == 0 || idx  == 1) return cost[idx];
	        if(dp[idx] != -1) return dp[idx];
	        return dp[idx] = cost[idx] + Math.min(minCost(cost,idx - 1,dp),minCost(cost,idx - 2,dp));
	    }
	    public int minCostClimbingStairs(int[] cost) {
	        int n = cost.length;
	        int dp[] = new int[cost.length];
	        Arrays.fill(dp,-1);
	        return Math.min(minCost(cost,n-1,dp),minCost(cost,n-2,dp));
	    }
	    // TC: O(N) SC: O(N)
	    
	    // Tabulation Method: 
	    /* Approach: Dp array contains the minimun distance at each step from the starting point. so when we are at any step, we find
	     * the min from the last two steps.
	     * */
		    public int minCostClimbingStairs(int[] cost) {
		        int n = cost.length;
		        int dp[] = new int[cost.length];
		    dp[0] = cost[0];
		    dp[1]  = cost[1];
		    for(int i = 2;i<n;i++)  
		        dp[i] = cost[i]  + Math.min(dp[i-1],dp[i - 2]);
		            return Math.min(dp[n-1],dp[n-2]);
		    }
	    
}

