/*
Power Of Two Integers

Given a positive integer which fits in a 32 bit signed integer, find if it can be expressed as A^P where P > 1 and A > 0. A and P both should be integers.

Example

Input : 4
Output : True  
as 2^2 = 4. 

*/
public class Solution {
    public boolean isPower(int a) {
        if(a<2)
            return true;
        double val;
        for(int i=1;i<=Math.sqrt(a);i++){
            val=Math.log(a)/Math.log(i);
            if(val-(int)val<0.00000001)
                return true;
                
        }
        return false;
    }
}