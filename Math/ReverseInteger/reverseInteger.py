
/*
Reverse digits of an integer.

Example1:

x = 123,

return 321
Example2:

x = -123,

return -321

Return 0 if the result overflows and does not fit in a 32 bit signed integer

*/

class Solution:
    # @param A : integer
    # @return an integer
    def reverse(self, A):
        
        if A<0: 
              return -int(str(-A)[::-1]) if -int(str(-A)[::-1]) > -2147483647 else 0
            
        else:
            return int(str(A)[::-1]) if int(str(A)[::-1]) < 2147483647 else 0

        
            
