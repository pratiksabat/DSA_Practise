import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int n = 7;
        ArrayList<ArrayList<Integer> > adj = new ArrayList<ArrayList<Integer> >();
		
		for (int i = 0; i < n; i++) 
			adj.add(new ArrayList<Integer>());
			
		adj.get(0).add(1);
		adj.get(1).add(0);

		adj.get(1).add(2);
		adj.get(2).add(1);

		adj.get(2).add(3);
		adj.get(3).add(2);

		adj.get(4).add(3);
		adj.get(3).add(4);

		adj.get(4).add(5);
		adj.get(5).add(4);

		adj.get(4).add(6);
		adj.get(6).add(4);

		adj.get(1).add(6);
		adj.get(6).add(1);
		
		if(checkBiparitite(n,adj)) System.out.println("Biparitite graph");
		else System.out.println("Not Biparitite graph");
	}
	
	public static boolean checkBiparitite(int V,ArrayList<ArrayList<Integer>> adj){
	   int[] colors = new int[V];
	   for (int i=0;i<V;i++){
	       colors[i]=-1;
	   }
	   for(int i=0;i<V;i++){
	    if(colors[i]==-1){
	        if(bfs(i,adj,colors)==false) return false;
	    }   
	   }
	   return true;
	}
	
	public static boolean bfs(int node,ArrayList<ArrayList<Integer>> adj,int[] colors){
	    Queue<Integer> q = new LinkedList<>();
	    q.add(node);
	    colors[node]=1;
	    
	    while(!q.isEmpty()){
        int curr = q.poll();
        for(Integer it:adj.get(curr)){
            if(colors[it]==-1){
                colors[it]=1-colors[curr];
                q.add(it);
            }else if(colors[it]==colors[curr]) return false;
        }
	    }
	    return false;
	}
}
