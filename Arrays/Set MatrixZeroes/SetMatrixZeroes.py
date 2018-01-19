
*********Set Matrix Zeros******

Given an m x n matrix of 0s and 1s, if an element is 0, set its entire row and column to 0.

Do it in place.

Example

Given array A as

1 0 1
1 1 1 
1 1 1

On returning, the array A should be :

0 0 0
1 0 1
1 0 1


class Solution:
    # @param A : list of list of integers
    # @return the same list modified
    def setZeroes(self, A):
        m=len(A)
        n=len(A[0])
        row=[1]*m
        col=[1]*n
        
        for i in range(m):
            for j in range(n):
                if(A[i][j]==0):
                    row[i]=0
                    col[j]=0
                    
        for i in range(m):
            if(row[i]==0):
                A[i]=[0]*n
        
        for j in range(n):
            if(col[j]==0):
                for i in range(m):
                    A[i][j]=0
                    
        return A
