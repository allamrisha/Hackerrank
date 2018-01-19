
*****Max Sum Contiguous Subarray****

Find the contiguous subarray within an array (containing at least one number) which has the largest sum.

For example:

Given the array [-2,1,-3,4,-1,2,1,-5,4],

the contiguous subarray [4,-1,2,1] has the largest sum = 6.

For this problem, return the maximum sum.

class Solution:
    # @param A : tuple of integers
    # @return an integer
    def maxSubArray(self, A):
        maxTemp=A[0]
        res=A[0]
        for x in A[1:]:
            maxTemp=max(x,maxTemp+x)
            res=max(maxTemp,res)
        
        return res
