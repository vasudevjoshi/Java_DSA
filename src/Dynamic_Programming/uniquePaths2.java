package Dynamic_Programming;

class Solution {
    private int path(int row, int col, int m, int n, int[][] dp,int [][]grid) {
        if (row >= m || col >= n) return 0;  // either out of bounds
       if(grid[row][col] == 1) return dp[row][col] = 0;
        if (row == m - 1 && col == n - 1) return 1;  // reached destination
        if (dp[row][col] != -1) return dp[row][col];  // memoization check

        
        int rightways = path(row, col + 1, m, n, dp,grid);
        int downways = path(row + 1, col, m, n, dp,grid);

        dp[row][col] = rightways + downways;  // store result

        return dp[row][col];
    }
    public int uniquePathsWithObstacles(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
                int[][] dp = new int[m][n];
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                dp[i][j] = -1;
        return path(0, 0, m, n, dp,grid);
    }
}