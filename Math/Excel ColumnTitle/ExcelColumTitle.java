
/*

Excel Column Title

Given a positive integer, return its corresponding column title as appear in an Excel sheet.

For example:

    1 -> A
    2 -> B
    3 -> C
    ...
    26 -> Z
    27 -> AA
    28 -> AB 

*/

public class Solution {
	public String convertToTitle(int a) {
	    
	    StringBuilder res=new StringBuilder();
	    int tmp;
	    
	    while(a>0){
	        a-=1;
	        tmp=a%26;
	        a/=26;
	        res.insert(0,(char)(tmp+'A'));
	    }
	    return res.toString();
	}
}

