import java.util.*;
public class Main
{
	public static void main(String[] args) {
	adjMatrix();
	adjList();
	}
	
	public static void adjMatrix(){
	    System.out.println("GRAPH- Using adjacency matrix");
		int m=3,n=3;
		int[][] adjacencyMatrix = new int[m+1][n+1];
		// Eg:- 1-2, there is a edge between 1 & 2, 2 & 1 for un-directed graph
		
		adjacencyMatrix[1][2]=1;
		adjacencyMatrix[2][1]=1;
		
		adjacencyMatrix[1][3]=1;
		adjacencyMatrix[3][1]=1;
		
		adjacencyMatrix[2][3]=1;
		adjacencyMatrix[3][2]=1;
		
		for(int i=0;i<adjacencyMatrix.length;i++){
		    System.out.println(Arrays.toString(adjacencyMatrix[i]));
		}
	}

    public static void adjList(){
        System.out.println("GRAPH- Adjacency List");
        int n=3;
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        
        for (int i=0;i<=n ;i++ )
            graph.add(new ArrayList<>());
        
        graph.get(1).add(2);
        graph.get(2).add(1);
        
        graph.get(1).add(3);
        graph.get(3).add(1);
        
        graph.get(3).add(2);
        graph.get(2).add(3);
        
        for (int i=0;i<=n ;i++ ){
            System.out.println(i+"-->"+graph.get(i));
        }
    }
}
