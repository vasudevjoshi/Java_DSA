class Solution {
    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
        int []indegree = new int[V];
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < V; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++ ){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(a).add(b);
        }

   
        for(int i = 0; i < adj.size(); i++){
            for(int v: adj.get(i)){
                indegree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < V; i++){
            if(indegree[i] == 0) q.offer(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();
            list.add(node);
            for(int neighbor: adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.offer(neighbor);
                }
            }
        }
        return list;
    }
}
