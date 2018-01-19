
/*
Given a number N, find all prime numbers upto N ( N included ).

Example:

if N = 7,

all primes till 7 = {2, 3, 5, 7}

Make sure the returned array is sorted.
*/


class Solution:
    # @param A : integer
    # @return a list of integers
    def sieve(self, A):
        num=0
        res=[]
        for i in range(1,A+1):
            count=0
            for num in range(i,0,-1):
                if i%num==0:
                    count+=1
            if count==2:
                res.append(i)
                
        return res
                
            
