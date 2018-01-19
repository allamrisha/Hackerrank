*****PASCAL TRIANGLE *****

Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]


class Solution:
    # @param A : integer
    # @return a list of list of integers
    def generate(self, A):
        res=[]
        if A<1:
            return []
            
        row=[1]
        res.append(row)
        
        for i in range(1,A):
            rowList=[1]
            currSize=len(res[i-1])
            for j in range(1,currSize):
                rowList.append(res[i-1][j-1]+res[i-1][j])
            rowList.append(1)
            res.append(rowList)
            
        return res
            
