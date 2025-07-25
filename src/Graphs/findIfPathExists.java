package Graphs;

class Solution {
    public boolean validPath(int n, int[][] edges, int start, int end) {
        List<List<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] edge : edges) {
            int a = edge[0];
            int b = edge[1];
            adj.get(a).add(b);
            adj.get(b).add(a);
        }

        boolean[] visited = new boolean[n];
        bfs(adj, start, end, visited);
        return visited[end];
    }

    private void bfs(List<List<Integer>> adj, int start, int end, boolean[] visit) {
        Queue<Integer> q = new ArrayDeque<>();
        visit[start] = true;
        q.add(start);
        while (!q.isEmpty()) {
            int front = q.remove();
            if (front == end) return; // early exit if path is found
            for (int neighbor : adj.get(front)) {
                if (!visit[neighbor]) {
                    q.add(neighbor);
                    visit[neighbor] = true;
                }
            }
        }
    }
}
