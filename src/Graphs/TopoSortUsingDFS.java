package Graphs;

import java.util.ArrayList;
import java.util.Stack;

public class TopoSortUsingDFS {
	public static void dfs(int src,ArrayList<ArrayList<Integer>> adj,
		    boolean[]visited,Stack<Integer> stack){
		        visited[src] =true;
		        for( int neighbor: adj.get(src)){
		            if(!visited[neighbor]) 
		                dfs(neighbor,adj,visited,stack);
		        }
		        stack.push(src);
		    }
		    public static ArrayList<Integer> topoSort(int V, int[][] edges) {
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
		        boolean[] visited = new boolean[V];
		        Stack<Integer> stack = new Stack<>();
		        for(int i = 0;i<V;i++){
		            if(!visited[i])
		            dfs(i,adj,visited,stack);
		        }
		        while(!stack.isEmpty()){
		            list.add(stack.pop());
		        }
		        return list;
		    }
}
