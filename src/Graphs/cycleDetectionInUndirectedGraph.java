package Graphs;

class Solution {
    public boolean checkIfCycle(int src, ArrayList<ArrayList<Integer>> list,boolean[] visited){
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{src, -1});
        visited[src] = true;
        while(!q.isEmpty()){
            int []pair = q.poll();
            int node = pair[0];
            int parent = pair[1];
            for(int neighbour: list.get(node)){
                if(parent ==neighbour) continue;
                if(visited[neighbour]) return true;
                else{
                    q.offer(new int[]{neighbour,node});
                    visited[neighbour] = true;
                }
            }
   
        }
        return false;
    }
    public boolean checkIfCycledfs(int src,int parent, ArrayList<ArrayList<Integer>> list,boolean[] visited){
        visited[src] =true;
        for(int neighbour: list.get(src)){
            if(parent == neighbour) continue;
            if(visited[neighbour]) return true;
            else
                if(checkIfCycledfs(neighbour,src,list,visited))
                    return true;
        }
        return false;
    }
    
    public boolean isCycle(int V, int[][] edges) {
        // Code here
        boolean []visited = new boolean[V];
        ArrayList<ArrayList<Integer>> list = new ArrayList<>();
        for(int i = 0;i<V;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<edges.length;i++){
            int a = edges[i][0];
            int b  = edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        for(int i = 0;i<V;i++){
            // if(!visited[i] && checkIfCycle(i,list,visited))
            //     return true;
            if(!visited[i] && checkIfCycledfs(i,-1,list,visited))
                 return true;
        }
        return false;
    }
}
