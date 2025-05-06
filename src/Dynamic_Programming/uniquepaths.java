package Dynamic_Programming;

public class uniquepaths {
	class Solution {
	    public int uniquePaths(int m, int n) {
	        int[][] dp = new int[m][n];
	        for (int i = 0; i < m; i++)
	            for (int j = 0; j < n; j++)
	                dp[i][j] = -1;
	        return path(0, 0, m, n, dp);
	    }

	    private int path(int row, int col, int m, int n, int[][] dp) {
	        if (row >= m || col >= n) return 0;  // either out of bounds
	        if (row == m - 1 && col == n - 1) return 1;  // reached destination
	        if (dp[row][col] != -1) return dp[row][col];  // memoization check

	        int rightways = path(row, col + 1, m, n, dp);
	        int downways = path(row + 1, col, m, n, dp);

	        dp[row][col] = rightways + downways;  // store result

	        return dp[row][col];
	    }
	}

}
