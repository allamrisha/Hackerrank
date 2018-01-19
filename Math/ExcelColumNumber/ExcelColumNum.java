
/*
Excel Column Number


Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 

*/

public class Solution {
	public int titleToNumber(String a) {
	    int BASE=26;
	    int START=1,result=0;
	    for(int i=0;i<a.length();i++){
	        char c=a.charAt(i);
	        result=(result*BASE)+(c-'A'+START);
	    }
	    return result;
	}
}
