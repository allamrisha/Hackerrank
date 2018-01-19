/* ROTATED ARRAY

Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array will not contain duplicates.
*/

public class Solution {
	// DO NOT MODIFY THE LIST
	public int findMin(final List<Integer> a) {
	    int minIndex=0,min=a.get(0);
	    
	    for(int i=0;i<a.size();i++)
	    {
	        if(a.get(i)<min)
	        {
	            min=a.get(i);
	            minIndex=i;
	        }
	    }
	    return min;
	}
}
