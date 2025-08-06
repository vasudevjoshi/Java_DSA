package Graphs;

class Solution {
    public boolean dfs(int src, ArrayList<ArrayList<Integer>> list,boolean []visited,
      boolean []pathVisited){
          visited[src] = true;
          pathVisited[src]= true;
            for(int neighbour: list.get(src)){
                if(pathVisited[neighbour]) return true;
                if(visited[neighbour]) continue;
                else{
                    if(dfs(neighbour,list,visited,pathVisited)) 
                    return true;
                    
                }
            }
            
          pathVisited[src]= false;
          return false;
      }
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean []visited = new boolean[V];
        boolean []pathVisited = new boolean[V];
        
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i<V;i++){
            list.add(new ArrayList<>());
        }
       for(int i = 0; i < edges.length; i++){
    int a = edges[i][0];
    int b = edges[i][1];
    list.get(a).add(b);
}

        for(int i = 0;i<V;i++){
            if(!visited[i] && dfs(i,list,visited,pathVisited))
                return true;
        }
        return false;
    }
}
