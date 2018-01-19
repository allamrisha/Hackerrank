
/*

Rearrange Array

Rearrange a given array so that Arr[i] becomes Arr[Arr[i]] with O(1) extra space.

Example:

Input : [1, 0]
Return : [0, 1]

*/


public class Solution {
	public void arrange(ArrayList<Integer> a) {
	    
	    int n=a.size();
	    
	    for(int i=0;i<n;i++){
	        int b=a.get(i);
	        int c=a.get(b);
	        
	        if(c>=n)
	            c=a.get(b)%n;
	            
	        int en= b+c*n;
	        a.set(i,en);
	    }
	    
	   for(int i=0;i<n;i++){
	       a.set(i,a.get(i)/n);
	   }
	}
}
