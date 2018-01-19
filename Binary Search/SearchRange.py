
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

class Solution:
    # @param A : tuple of integers
    # @param B : integer
    # @return a list of integers
    def searchRange(self, A, B):
        
        strt=-1
        stop=-1
        
        #first occurence of B in A
        end=len(A)-1
        begin=0
        
        while begin<=end:
            mid=(begin+end)/2
            if A[mid]>B:
                end=mid-1
            elif A[mid]<B:
                begin=mid+1
            else:
                end=mid-1
                strt=mid
                
        if strt== -1:
            return [-1,-1]
        
        end=len(A)-1
        begin=0
        
        while begin<=end:
            mid=(begin+end)/2
            if A[mid]>B:
                end=mid-1
            elif A[mid]<B:
                begin=mid+1
            else:
                begin=mid+1
                stop=mid
        
        return [strt,stop]  
        
