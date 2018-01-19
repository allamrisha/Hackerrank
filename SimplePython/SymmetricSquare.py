# A list is symmetric if the first row is the same as the first column,
# the second row is the same as the second column and so on. Write a
# procedure, symmetric, which takes a list as input, and returns the
# boolean True if the list is symmetric and False if it is not.
import math
def symmetric(input):
    # Your code here
    n=len(input)
   
    for ele in input:
        if len(ele)!=len(input):
            return False
    if(n==0):
        return True
    count=0
    i=0
    #to go through rows & columns
    while(i<n):
        j=0
        while(j<n):
            if input[i][j]==input[j][i]:
                count=count+1
            j+=1
        i+=1
    #print count
    if count==n*n:
        return True
    else:
        return False

print symmetric([[1, 2, 3],
                [2, 3, 4],
                [3, 4, 1]])
#>>> True

print symmetric([["cat", "dog", "fish"],
                ["dog", "dog", "fish"],
               ["fish", "fish", "cat"]])
#>>> True

print symmetric([["cat", "dog", "fish"],
                ["dog", "dog", "dog"],
                ["fish","fish","cat"]])
#>>> False

print symmetric([[1, 2],
                [2, 1]])
#>>> True

print symmetric([[1, 2, 3, 4],
                [2, 3, 4, 5],
                [3, 4, 5, 6]])
#>>> False

#print symmetric([[1,2,3],
#                 [2,3,1]])
#>>> False