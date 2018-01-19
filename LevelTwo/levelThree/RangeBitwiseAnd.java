package test;



/*
 * "Given a range [m, n] where 0 <= m <= n <= 2147483647, return the bitwise AND of all numbers in this range, inclusive. 
	For example, given the range [5, 7], you should return 4."
		8  4  2  1
	---------------
	4 | 0  1  0  0
	5 | 0  1  0  1
	6 | 0  1  1  0
	7 | 0  1  1  1
	8 |	1  0  0  0
	9 | 1  0  0  1
	10| 1  0  1  0
	
	Dry Run : 		Bit Wise AND :
	 [4,6]				4
	 [5,9]				1
	 [6,10]				2
	 
	Algorithm: 
	1. Bitwise And can be operated using & operator in Java
	2. To achieve bitwise and for a range of numbers, iterate through the numbers
	3. The bigger number can be used in while loop condition 
	4. The bitwise And of a number by itself is the same number
 * 
 */
public class RangeBitwiseAnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int res=rangeBitwiseAnd(5,9);
			System.out.println(res);
	}	

	public static int rangeBitwiseAnd(int m, int n) {
        while(n>m) {
        	n= n & n-1;
        	System.out.println(n);
        }
	     return m & n;
	    }
}
