
/* ROTATED ARRAY

Suppose a sorted array A is rotated at some pivot unknown to you beforehand.

(i.e., 0 1 2 4 5 6 7 might become 4 5 6 7 0 1 2).

Find the minimum element.

The array will not contain duplicates.
*/

class Solution:
    # @param A : tuple of integers
    # @return an integer
    def findMin(self, A):
        min=A[0]
        minIndex=0
        for i in range(1,len(A)):
            if A[i]<min:
                min=A[i]
                minIndex=i
        return min
            
