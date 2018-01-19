package test;

/*
 * 1.Any Number o which is power of 2 in binary format has an utmost of one 1.
	100...00
	2. Algorithm:
		a. Right Shift a bit in binary format from the number 
		b. Left shift a bit from the previous number
		c. Compare the value with original number and calculate difference
			i. if the difference is not zero, then return false
			ii. Right Shift the original number in a loop until the numberis greater than 2
			to iterate over all bits in the number
 */
public class PowerOfTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean res=isPowerOfTwo(8);
			System.out.println(res);
	}	

	public static boolean isPowerOfTwo(int n) {
	    if(n<=0) 
	        return false;
	 
	    while(n>2){
	        int t = n>>1;
	        int c = t<<1;
	 
	        if(n-c != 0)
	            return false;
	 
	        n = n>>1;
	    }
	 
	    return true;
	}
}
