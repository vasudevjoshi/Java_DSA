package Graphs;
import java.util.*;

class Solution {
    public int[] dijkstra(int V, int[][] edges, int S) {
        // Build adjacency list
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < V; i++) adj.add(new ArrayList<>());
        
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new ArrayList<>(Arrays.asList(v, w)));
            adj.get(v).add(new ArrayList<>(Arrays.asList(u, w))); // for undirected graph
        }

        // Min-heap based on distance
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);

        int[] dist = new int[V];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[S] = 0;
        pq.offer(new int[]{S, 0});

        while (!pq.isEmpty()) {
            int[] pair = pq.poll();
            int u = pair[0];
            int d = pair[1];

            if (d > dist[u]) continue; // Skip outdated entry

            for (ArrayList<Integer> neighbour : adj.get(u)) {
                int v = neighbour.get(0);
                int w = neighbour.get(1);

                if (dist[u] + w < dist[v]) {
                    dist[v] = dist[u] + w;
                    pq.offer(new int[]{v, dist[v]});
                }
            }
        }

        return dist;
    }
}
