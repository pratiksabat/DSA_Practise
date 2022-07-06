import java.util.*;
public class Main
{
    static class Node{
        int curr;
        int prev;
        
        public Node(int curr,int prev){
            this.curr=curr;
            this.prev=prev;
        }
    }
	public static void main(String[] args) {
		System.out.println("Hello World");
		int V = 5;
            ArrayList<ArrayList<Integer>>adj = new ArrayList<>();
            for(int i = 0; i < V; i++)
                adj.add(i, new ArrayList<Integer>());
                adj.get(0).add(1);
                adj.get(0).add(2);
                adj.get(2).add(3);
                adj.get(1).add(3);
                adj.get(2).add(4);

      
        for (int i=0;i<adj.size() ;i++ ){
            System.out.println(i+"-->"+adj.get(i));
        }
        
        if(solution(V,adj)){
            System.out.println("Cycle");
        }else{
            System.out.println("Not cycle");
        }
	}
	
	public static boolean solution(int V, ArrayList<ArrayList<Integer>> adj){
    boolean[] vis = new boolean[V];
    Arrays.fill(vis,false);
    
    for (int i=1;i<V ;i++ ){
        if(vis[i]==false){
            if(checkCycleBFS(i,adj,vis)){
                return true;
            }
        }
    } 
    return false;
	}
	
	public static boolean checkCycleBFS(int i, ArrayList<ArrayList<Integer>> adj,boolean[] vis){
	    Queue<Node> q = new LinkedList<Node>();
	    q.add(new Node(i,-1));
	    vis[i]=true;
	    
	    while(!q.isEmpty()){
	        int curr = q.peek().curr;
	        int prev = q.peek().prev;
	        q.remove();
	        
	        for(Integer it:adj.get(curr)){
	            if(vis[it]==false){
	                vis[it]=true;
	                q.add(new Node(it,curr));
	            }
	            else if(it!=prev) return true;
	        }
	    }
	    return false;
	}
}
