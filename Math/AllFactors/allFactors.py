
*********ALL FACTORS*****

Given a number N, find all factors of N.

Example:

N = 6 
factors = {1, 2, 3, 6}

Make sure the returned array is sorted.

class Solution:
    # @param A : integer
    # @return a list of integers
    def allFactors(self, A):
        if A == 1:
            return [A]
        res = [1,A]
        sqrtA = int(A**0.5)
        for i in range(2,sqrtA):
            if A%i == 0:
                res.append(i)
                res.append(A/i)
        if A%sqrtA == 0:
            res.append(sqrtA)
            if sqrtA**2 != A:
                res.append(A/sqrtA)
        res.sort()
        return res

      
       
                
