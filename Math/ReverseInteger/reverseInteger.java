
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

public class Solution {
	public int reverse(int a) {
	    //int tmp=Math.abs(a);
	    long res=0;
	    while(a!=0){
	       res=(res*10)+(a%10);
	       a/=10;
	    }
	    if(res> Integer.MAX_VALUE || res<Integer.MIN_VALUE)
	        return 0;
	    else
	        return (int)res;
	}
}
