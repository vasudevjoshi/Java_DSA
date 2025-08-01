package Graphs;

class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // Code here
        int n = adj.size();
        ArrayList<Integer> list = new ArrayList<>();
        boolean[] visited = new boolean[n];
        for(int i = 0;i<n;i++){
            if(!visited[i])
                dfs(i,adj,visited,list);
        }
        return list;
    }
    public void dfs(int node,ArrayList<ArrayList<Integer>> adj,boolean[] visited,  ArrayList<Integer> list){
        visited[node] = true;
        list.add(node);
        for(int neighbour :adj.get(node)){
            if(!visited[neighbour]) dfs(neighbour,adj,visited,list);
        }
    }
    
}
