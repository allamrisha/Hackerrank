******** Rotate Matrix *******

You are given an n x n 2D matrix representing an image.

Rotate the image by 90 degrees (clockwise).

You need to do this in place.

Note that if you end up using an additional array, you will only receive partial score.

Example:

If the array is

[
    [1, 2],
    [3, 4]
]

Then the rotated array becomes:

[
    [3, 1],
    [4, 2]
]


// Rotation is done in 2 steps - Transpose and Reverse 

public class Solution {
	public void rotate(ArrayList<ArrayList<Integer>> a) {
	    
	    int n=a.size();
	    for(int i=0;i<n;i++){
	        for(int j=i;j<n;j++){
	            Integer tmp=a.get(i).get(j);
	            a.get(i).set(j,a.get(j).get(i));
	            a.get(j).set(i,tmp);
	            
	        }
	    }
	   // Collections.reverse(a); would result in anti clockwise rotation
	    for (int i = 0; i < n/2 ; i++) {
            for (int j = 0; j < n; j++) {
                int tmp = a.get(j).get(i);
                a.get(j).set(i, a.get(j).get(n - i - 1));
                a.get(j).set(n - i - 1, tmp);
              
            }
     }
	}
}
