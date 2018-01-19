
***** WAVE ARRAY *****

Given an array of integers, sort the array into a wave like array and return it,
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]


class Solution:
    # @param A : list of integers
    # @return a list of integers
    def wave(self, A):
        B=A
        l=len(A)
        B.sort()
        for i in range(l-1):
            if(i%2==0):
                if(B[i]<B[i+1]):
                    B[i],B[i+1]=B[i+1],B[i]
            if(i%2!=0):
                if(B[i]>B[i+1]):
                    B[i],B[i+1]=B[i+1],B[i]
                    
        return B
