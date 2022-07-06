public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	
	public static void dfsTraversal(){
	    int V=7;
	    boolean[] vis = new boolean[V+1];
	    ArrayList<Integer> storeDFS = new ArrayList<>();
	    
	    for (int i=1;i<=V ;i++ ){
	        if(vis[i]==false){
	            dfs(i,adj,vis,storeDFS);
	        }
	    } 
	}
	
	public static void dfs(int node,ArrayList<ArrayList<Integer>> adj, boolean[] vis, ArrayList<Integer> storeDFS){
	    vis[node]=true;
	    storeDFS.add(node);
	    
	    for(Integer i:adj.get(node)){
	        if(vis[i]==false){
	            dfs(i,adj,vis,storeDFS);
	        }
	    }
	}
}
