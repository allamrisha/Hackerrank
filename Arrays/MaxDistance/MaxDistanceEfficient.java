
/*

Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

If there is no solution possible, return -1.

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)


*/


import java.awt.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> a) {
	    if(a.size()==1)
	        return 0;
	    if(a.size()==0)
	        return -1;
	    
	    List<Point> copyToSort=new ArrayList<>();
	    
	    for(int i=0;i<a.size();i++){
	        copyToSort.add(new Point(a.get(i),i));
	    }
	    
	    Collections.sort(copyToSort,new Comparator<Point>(){
	        
	        public int compare(Point p1,Point p2){
	            return p1.x-p2.x;
	        }
	    });
	       
	   int len= copyToSort.size();
	   int maxIndx=copyToSort.get(copyToSort.size()-1).y;
	   
	   int ans=0;
	   for(int i=len-2;i>=0;i--){
	       ans=Math.max(ans,maxIndx-copyToSort.get(i).y);
	       maxIndx=Math.max(maxIndx,copyToSort.get(i).y);
	   }
	   return ans;
	}
}
