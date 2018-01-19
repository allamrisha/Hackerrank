
/*
Trailing Zeroes
Given an integer n, return the number of trailing zeroes in n!.

Note: Your solution should be in logarithmic time complexity.

Example :

n = 5
n! = 120 
Number of trailing zeros = 1
So, return 1
*/

public class Solution {
	public int trailingZeroes(int a) {
	    int count,res=0;
	    while(a>0){
	        count=a/5;
	        res+=count;
	        a=count;
	    }
	    return res;
	}
	
}
