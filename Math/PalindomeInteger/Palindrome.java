
/*
Palindrome Integer

Determine whether an integer is a palindrome. Do this without extra space.

A palindrome integer is an integer x for which reverse(x) = x where reverse(x) is x with its digit reversed.
Negative numbers are not palindromic.

Example :

Input : 12121
Output : True

Input : 123
Output : False

*/

public class Solution {
	public boolean isPalindrome(int a) {
	    
	    if(a<0)
	        return false;
	    int res=0,b=a;
	    while(a!=0){
	       res=(res*10)+(a%10);
	       a/=10;
	    }
	    
	    return res==b?true:false;
	    /*
	    if(res==a)
	        return true;
	    else
	        return false;
	        */
	}
}
