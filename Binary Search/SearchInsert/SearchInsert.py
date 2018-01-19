
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


class Solution:
    # @param A : list of integers
    # @param B : integer
    # @return an integer
    def searchInsert(self, A, B):
        
        length = len(A)
        if length == 0:
            return 0
        start = 0
        end = length - 1
        while start <= end:
            mid = start + (end - start)/2
            if B == A[mid]:
                return mid
            elif A[mid] > B:
                end = mid -1
            else:
                start = mid +1
        return start

        