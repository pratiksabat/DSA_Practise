class SOlution{
    	public static boolean checkCycle(int V, ArrayList<ArrayList<Integer>> adj){
	    boolean[] vis = new boolean[V+1];
	    
	    for (int i=1;i<=V ;i++ ){
	        if(vis[i]==false){
	            if(cycleDFS(i,-1,vis,adj)==true) return true;
	        }
	    } 
	    
	    return false;
	}
	
	public static boolean cycleDFS(int i,int par,boolean[] vis, ArrayList<ArrayList<Integer>> adj){
	    vis[i]=true;
	    
	    for(Integer it:adj.get(i)){
	        if(vis[it]==false){
	            if(cycleDFS(it,i,vis,adj)) return true;
	        }else if (it!=par) return true;
	    }
	    return false;
	}
}