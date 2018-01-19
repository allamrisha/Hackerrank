
***** ADD one to Number *****

Given a non-negative number represented as an array of digits,

add 1 to the number ( increment the number represented by the digits ).

The digits are stored such that the most significant digit is at the head of the list.

Example:

If the vector has [1, 2, 3]

the returned vector should be [1, 2, 4]

as 123 + 1 = 124.

class Solution:
    # @param A : list of integers
    # @return a list of integers
    def plusOne(self, A):
        res = []
        added = False
       
        while A and A[0]==0:
            A = A[1:]

        if not A: return [1]
        
        for i in range(1,len(A)+1):
            
            if A[-i]==9 and not added:
                res.append(0)
                if i==len(A):
                    res.append(1)
                    added=True
            elif A[-i]!=9 and not added:
                res.append(A[-i]+1)
                added=True
            else:
                res.append(A[-i])
        return res[::-1]
