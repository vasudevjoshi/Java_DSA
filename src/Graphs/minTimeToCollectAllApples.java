package Graphs;

class Solution {
    public int dfs(int src,int parent, List<List<Integer>> list,List<Boolean> hasApple){
        int totalTime = 0;
        for(int neighbour: list.get(src)){
            if(neighbour == parent) continue;
            int timeTakenByChild = dfs(neighbour,src,list,hasApple);
            if(timeTakenByChild > 0 || hasApple.get(neighbour))
                totalTime += timeTakenByChild + 2;
        }
        return totalTime;
    }
    public int minTime(int n, int[][] edges, List<Boolean> hasApple) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i = 0;i<n;i++){
            list.add(new ArrayList<>());
        }
        for(int i = 0;i<edges.length;i++){
            int a = edges[i][0];
            int b = edges[i][1];
            list.get(a).add(b);
            list.get(b).add(a);
        }
        return dfs(0,-1,list,hasApple);
    }
}