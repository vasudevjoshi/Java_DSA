package Graphs;

class Solution {
    public boolean canFinish(int numCourses, int[][] edges) {
        int []indegree = new int[numCourses];
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for(int i = 0; i < numCourses; i++){
            adj.add(new ArrayList<>());
        }

        for(int i = 0; i < edges.length; i++ ){
            int a = edges[i][0];
            int b = edges[i][1];
            adj.get(b).add(a);
        }

   
        for(int i = 0; i < adj.size(); i++){
            for(int v: adj.get(i)){
                indegree[v]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++){
            if(indegree[i] == 0) q.offer(i);
        }

        while(!q.isEmpty()){
            int node = q.poll();
            for(int neighbor: adj.get(node)){
                indegree[neighbor]--;
                if(indegree[neighbor] == 0){
                    q.offer(neighbor);
                }
            }
        }
        for(int i = 0;i<indegree.length;i++)
            if(indegree[i] !=0) return false;
        return true;
    }
}
