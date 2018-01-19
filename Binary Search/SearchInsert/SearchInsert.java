
/*
Search Insert Position

Given a sorted array and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.

You may assume no duplicates in the array.

Here are few examples.

[1,3,5,6], 5 → 2
[1,3,5,6], 2 → 1
[1,3,5,6], 7 → 4
[1,3,5,6], 0 → 0

*/

public class Solution {
	public int searchInsert(ArrayList<Integer> a, int b) {
	    
	    int strt=-1,stop=-1;
	    
	    int len=a.size();
	    int begin=0;
	    int end=len-1;
	  
	    
	    if(len==1){
	        if(a.get(0)<b)  
	            return 1;
	        else
	            return 0;
	    }
	    
	    
	       while(begin<end){
	       int mid=(begin+end)/2;
	       
	        if(b<a.get(mid))
	            end=mid;
	        else if(b>a.get(mid))
	            begin=mid+1;
	        else{
	           return mid;
	        }
	    }
	        
	   if(begin==len-1)
	        return begin+1;
	   else
	        return begin;
	    //return (begin+1)?(begin==len-1):begin;
	}
}
