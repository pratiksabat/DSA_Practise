/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		int[] arr = {3,1,2};
		 ArrayList<Integer> ds = new ArrayList<Integer>();
	    printSubsetWithSumK(arr,0,5,ds);
	}
	
	public static void printSubsetWithSumK(int[] arr, int idx, int sum, ArrayList<Integer> ds){
	    if(idx>=arr.length){
	        int s=0;
	        for(int i=0;i<ds.size();i++){
	            s+=ds.get(i);
	        }
	        if(s==sum){
	        System.out.println(ds);
	        }
	        return;	            
	        

	    }
	    ds.add(arr[idx]);
	    printSubsetWithSumK(arr,idx+1,sum,ds);
	    ds.remove(ds.size()-1);
	    printSubsetWithSumK(arr,idx+1,sum,ds);
	}
}
