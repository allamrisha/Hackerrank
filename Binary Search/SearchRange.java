
/*
SearchRange

Given a sorted array of integers, find the starting and ending position of a given target value.

Your algorithm’s runtime complexity must be in the order of O(log n).

If the target is not found in the array, return [-1, -1].

Example:

Given [5, 7, 7, 8, 8, 10]

and target value 8,

return [3, 4]

*/


public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> searchRange(final List<Integer> a, int b) {
	    
	    int strt=-1,stop=-1;
	    
	    int len=a.size();
	    int begin=0;
	    int end=len-1;
	    ArrayList<Integer> res=new ArrayList<>();
	    
	   //find the first occurence of b in a
	   
	    while(begin<=end){
	       int mid=(begin+end)/2;
	       
	       if(b<a.get(mid))
	            end=mid-1;
	        else if(b>a.get(mid))
	            begin=mid+1;
	        else{
	            end=mid-1;
	            strt=mid;
	        }
	    }
	    if(strt==-1){
	        res.add(strt);
	        res.add(stop);
	        return res;
	    }
	    begin=0;
	    end=len-1;
	    
	    while(begin<=end){
	       int mid=(begin+end)/2;
	       
	       if(b<a.get(mid))
	            end=mid-1;
	        else if(b>a.get(mid))
	            begin=mid+1;
	        else{
	            begin=mid+1;
	            stop=mid;
	        }
	    }
	    
	    res.add(strt);
	    res.add(stop);
	    return res;
	    
	    
	}
}
