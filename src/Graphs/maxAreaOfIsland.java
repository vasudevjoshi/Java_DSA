package Graphs;

class Solution {
    class Pair {
        int row;
        int col;

        Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public int maxAreaOfIsland(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1) {
                    int tempcount = bfs(i, j, visited, grid);
                    count = Math.max(count,tempcount);
                }
            }
        }
        return count;
    }

    private int bfs(int i, int j, boolean[][] visited, int[][] grid) {
        Queue<Pair> q = new LinkedList<>();
        visited[i][j] = true;
        q.add(new Pair(i, j));
        int count= 0;
        count++; // incremented count since the first visited one supposed to be included here
        while (q.size() > 0) {
            Pair front = q.remove();
            int row = front.row;
            int col = front.col;
            // top
            if (row > 0) {
                if (grid[row - 1][col] == 1 && visited[row - 1][col] == false) {
                    q.add(new Pair(row - 1, col));
                    visited[row - 1][col] = true;
                    count++;
                }
            } // down
            if (row + 1 < grid.length) {
                if (grid[row + 1][col] == 1 && visited[row + 1][col] == false) {
                    q.add(new Pair(row + 1, col));
                    visited[row + 1][col] = true;
                    count++;
                }
            } // left
            if (col > 0) {
                if (grid[row][col - 1] == 1 && visited[row][col - 1] == false) {
                    q.add(new Pair(row, col - 1));
                    visited[row][col - 1] = true;
                     count++;
                }
            } //right
            if (col + 1 < grid[0].length) {
                if (grid[row][col + 1] == 1 && visited[row][col + 1] == false) {
                    q.add(new Pair(row, col + 1));
                    visited[row][col + 1] = true;
                     count++;
                }
            }
        }
        return count;
    }

}
