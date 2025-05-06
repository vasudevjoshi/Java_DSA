package Dynamic_Programming;

public class fibonacci {
	// recursive code: 
	 public int fib(int n) {
	        if(n<=1) return n;
	        return fib(n-1) + fib(n-2);
	    }
	 // TC: O(2^N) reason for each call, the function runs twice like 1,2,4,...2^N 
	 // SC: O(N) reason : recursive call stack;
	 
	 // recursive +  memoziation code
	  public int fibo(int n,int dp[]) {
	        if(n<=1) return n;
	        if(dp[n]!=0) return dp[n];
	        int ans = fibo(n-1,dp) + fibo(n- 2,dp);
	        dp[n] = ans;
	        return ans;
	    }
	    public int fib(int n){
	        int dp[] = new int[n+1];
	        return fibo(n,dp);
	    }
	}

/*	approach: Instead of calling each time the recursive code we will store the results in the array called the dp. Once the call 
 * runs and fills the array. after the second call from the starting function, the values are taken from the dp array.
 * */

	// tabulation method: Iterative dp
		public int fib(int n){
		    // int dp[] = new int[n+1];
		    // return fibo(n,dp);
		    if(n<=1) return n;
		    int dp[] = new int[n+1];
		    dp[0] = 0;
		    dp[1] = 1;
		    for(int i= 2;i<=n;i++){
		        dp[i]  = dp[i - 1] + dp[i - 2];
		    }
		    return dp[n];
			}
	 
	}
}
