package Dynamic_Programming;

public class Minimumpathsum_tabulation {
	public int minPathSum(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 && j == 0) continue;
                else if (i == 0) arr[i][j] += arr[i][j - 1];  // only from left
                else if (j == 0) arr[i][j] += arr[i - 1][j];  // only from top
                else arr[i][j] += Math.min(arr[i - 1][j], arr[i][j - 1]);  // min from top or left
            }
        }
        
        return arr[m - 1][n - 1];
    }
}
