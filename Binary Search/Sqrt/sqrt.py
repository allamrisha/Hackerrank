
/*
Square Root of Integer

Implement int sqrt(int x).

Compute and return the square root of x.

If x is not a perfect square, return floor(sqrt(x))

Example :

Input : 11
Output : 3
*/

class Solution:
    # @param A : integer
    # @return an integer
    def sqrt(self, A):
        i=0
        j=A/2+1
        
        while i<=j:
            mid=(i+j)/2
            if mid*mid==A:
                return mid
            elif mid*mid<A:
                i=mid+1
            else:
                j=mid-1
        return j
        
