
/*

Excel Column Title

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

*/


class Solution:
    # @param A : integer
    # @return a strings
    def convertToTitle(self, A):
        res=""
        
        while A>0:
            A-=1
            tmp=A%26;
            A/=26;
            res+=unichr(ord('A')+tmp)
            
        return res[::-1]
