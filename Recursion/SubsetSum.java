//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            int N=sc.nextInt();
			ArrayList<Integer> arr = new ArrayList<>();
			for(int i = 0; i < N ; i++){
			    arr.add(sc.nextInt());
			}
            Solution ob = new Solution();
         
            ArrayList<Integer> ans = ob.subsetSums(arr,N);
            Collections.sort(ans);
            for(int sum : ans){
                System.out.print(sum+" ");
            }
            System.out.println();
        }  
    }
}

// } Driver Code Ends


//User function Template for Java//User function Template for Java
class Solution{
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        List<Integer> ans  = new ArrayList<>();
        ArrayList<Integer> ds = new ArrayList<>();
        findSubsetSums(arr,N,0,ds,0);
        return ds;
    }
    
    public void findSubsetSums(ArrayList<Integer> arr, int N, int idx,ArrayList<Integer> ds, int sum ){
        
        if(idx>=N){
            // System.out.println(ans);
            // for(int )
            ds.add(sum);
            return;
        }
        
        sum+=arr.get(idx);
        findSubsetSums(arr,N,idx+1,ds,sum);
        sum-=arr.get(idx);
        findSubsetSums(arr,N,idx+1,ds,sum);
    }
}