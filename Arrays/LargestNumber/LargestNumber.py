
/*
Largest Number

Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

*/

class Solution:
    # @param A : tuple of integers
    # @return a strings
    def largestNumber(self, A):
        
        copy=map(str,A)
        copy.sort(cmp_ele,reverse=True)
        return ''.join(copy).lstrip('0') or '0'
        
def cmp_ele(a,b):
    if int(a+b)>int(b+a):
        return 1
    elif int(a+b)==int(b+a):
        return 0
    else:
        return -1
