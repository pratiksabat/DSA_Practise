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
	    printSubSequences(arr,0,ds);	
	}
	
	public static void printSubSequences(int[] arr, int idx, ArrayList<Integer> ds){
	    //base condition
	    if(idx>=arr.length)
	        {
	            System.out.println(ds);
	             return;
	        }
	   
	   // Make a choice i.e TAKE
	   ds.add(arr[idx]);
	   printSubSequences(arr,idx+1,ds);
	   // Not TAKE, so we should restore previous state
	   ds.remove(ds.size()-1);
	   printSubSequences(arr,idx+1,ds);
	}
}
