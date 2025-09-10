package Graphs;

class Solution {
    public int[] shortestPath(ArrayList<ArrayList<Integer>> adj, int src) {
        int V = adj.size();
        Queue<Integer> q = new LinkedList<>();
        int []dist = new int[V];
        Arrays.fill(dist, -1);

        dist[src] = 0;
        q.offer(src);

        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbor : adj.get(node)){
                if(dist[neighbor] == -1){ 
                    dist[neighbor] = dist[node] + 1;
                    q.offer(neighbor);
                }
            }
        }
        return dist;
    }
}
