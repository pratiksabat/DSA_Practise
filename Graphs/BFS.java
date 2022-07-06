import java.util.*;
public class Main
{
	public static void main(String[] args) {
	adjList();
	}

    public static void adjList(){
        System.out.println("GRAPH- Adjacency List");
       ArrayList < ArrayList < Integer >> adj = new ArrayList < > ();
        for (int i = 0; i < 5; i++) {
            adj.add(new ArrayList < > ());
        }
        adj.get(0).add(1);
        adj.get(1).add(0);
        adj.get(0).add(2);
        adj.get(2).add(0);
        adj.get(0).add(3);
        adj.get(3).add(0);
        adj.get(2).add(4);
        adj.get(4).add(2);

      
        for (int i=0;i<adj.size() ;i++ ){
            System.out.println(i+"-->"+adj.get(i));
        }
          ArrayList < Integer > ans = bfsTraversal(1,5, adj);
        
        System.out.println("BFS");
         for (int i=0;i<ans.size() ;i++ ){
            System.out.println(ans.get(i));
        }
        
    }
 
    public static ArrayList<Integer> bfsTraversal(int v, int componenets, ArrayList<ArrayList<Integer>> graph ){
        ArrayList<Integer> path = new ArrayList<>();
        boolean[] vis = new boolean[componenets+1];
        Queue<Integer> q = new LinkedList<Integer>();
        
        q.add(0);
        vis[0] = true;
    
        for(int i=1;i<=v;i++){
            if(vis[i]==false){
                
                q.add(i);
                vis[i]=true;
                
                while(!q.isEmpty()){
                    Integer traversed = q.poll();
                    path.add(traversed);
                    
                    for(Integer j:graph.get(traversed)){
                        if(vis[j]==false){
                            q.add(j);
                            vis[j]=true;
                        }
                    }
                }
            }
        }
        
        return path;
    }
}
