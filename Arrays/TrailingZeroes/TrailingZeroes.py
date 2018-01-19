
/*
Trailing Zeroes
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Example :

n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1
*/


class Solution:
    # @param A : integer
    # @return an integer
    def trailingZeroes(self, A):
        res=0
        while(A>0):
            count=A/5
            res+=count
            A=count
        return res
