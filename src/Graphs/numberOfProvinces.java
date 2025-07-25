package Graphs;

class Solution {
    public int findCircleNum(int[][] adj) {
        int n = adj.length;
        int count = 0;
        boolean[] visit = new boolean[n];
        for (int i = 0; i < n; i++) {
            if (visit[i] == false) {
                bfs(i, adj, visit);
                count++;
            }
        }
        return count;
    }

    private void bfs(int i, int[][] adj, boolean[] visit) {
        Queue<Integer> q = new ArrayDeque<>();
        int n = adj.length;
        visit[i] = true;
        q.add(i);
        while (q.size() > 0) {
            int front = q.remove();
            for (int j = 0; j < n; j++) {
                if (adj[front][j] == 1 && visit[j] == false) {
                    q.add(j);
                    visit[j] = true;
                }
            }
        }
    }

}
