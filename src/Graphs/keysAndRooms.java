package Graphs;

class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> adj) {
        int size = adj.size();
        boolean[] visit = new boolean[size];
        visit[0] = true;
        bfs(0,adj,visit);
        for(boolean ele: visit){
            if(!ele)        
                return false;
            }
            return true;
    }
    private void bfs(int start, List<List<Integer>> adj,boolean[] visit){
        Queue<Integer> q = new ArrayDeque<>();
        q.add(start);
        while(q.size()>0){
            int front = q.remove();
            for(int ele: adj.get(front)){
                if(!visit[ele]){
                    q.add(ele);
                    visit[ele] = true;
                }
            }
        }
    }
}
