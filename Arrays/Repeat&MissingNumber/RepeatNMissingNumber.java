*********Repeat and Missing Number Array*****

you are given a read only array of n integers from 1 to n.

Each integer appears exactly once except A which appears twice and B which is missing.

Return A and B.

Note: Your algorithm should have a linear runtime complexity. Could you implement it without using extra memory?

Note that in your output A should precede B.

Example:

Input:[3 1 2 5 3] 

Output:[3, 4] 

A = 3, B = 4


public class Solution {
	// DO NOT MODIFY THE LIST
	public ArrayList<Integer> repeatedNumber(final List<Integer> a) {
	
	    List<Integer> B = new ArrayList<Integer>(a);
	    ArrayList<Integer> result=new ArrayList<Integer>();
        int len = B.size();
        
        int repeated = -1;
        int indexOfMissing = -1;
        for (int i = 0; i < len; i++) {
            // until B[i] stores the right number (i.e. i + 1)
            // or we meet the duplicated number
            while (B.get(i) != i + 1)  {
                int num = B.get(i);
                if (num == B.get(B.get(i) -1)) {
                    // met with duplicated number
                    repeated = B.get(num - 1);
                    indexOfMissing = i;
                    break;
                }
                // swap B[i] with B[num - 1]
                int temp = B.get(i);
                B.set(i, B.get(num - 1));
                B.set(num - 1, temp);
            }
        }
        
        result.add(repeatedd);
        result.add(indexOfMissing + 1);
        return result;
    }
}


