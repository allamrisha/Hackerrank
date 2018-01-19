
/*

Given an array A of integers, find the maximum of j - i subjected to the constraint of A[i] <= A[j].

If there is no solution possible, return -1.

Example :

A : [3 5 4 2]

Output : 2 
for the pair (3, 4)


*/

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution {
	// DO NOT MODIFY THE LIST
	public int maximumGap(final List<Integer> A) {
	     int len = A.size();
        if (len == 0) {
            return -1;
        }
        int result = -1;
        for (int i = 0; i < len; i++) {
            for (int j = len - 1; j >= i; j--) {
                if (A.get(i) <= A.get(j)) {
                    result = Math.max(result, j - i);
                }
             }
        }
        return result;
}
}
