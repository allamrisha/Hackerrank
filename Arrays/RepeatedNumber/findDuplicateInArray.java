
****** Find Duplicate in Array *******



Given a read only array of n + 1 integers between 1 and n, find one number that repeats in linear time using less than O(n) space and traversing the stream sequentially O(1) times.

Sample Input:

[3 4 1 4 1]

Sample Output:

1

If there are multiple possible answers ( like in the sample case above ), output any one.

If there is no duplicate, output -1

public class Solution {
	// DO NOT MODIFY THE LIST
	public int repeatedNumber(final List<Integer> a) {
	    List<Integer> B = new ArrayList<Integer>(a);
	    ArrayList<Integer> result=new ArrayList<Integer>();
        int len = B.size();
        
        int repeated = -1;
        //int indexOfMissing = -1;
        for (int i = 0; i < len; i++) {
            // until B[i] stores the right number (i.e. i + 1)
            // or we meet the duplicated number
            while (B.get(i) != i + 1)  {
                int num = B.get(i);
                if (num == B.get(B.get(i) -1)) {
                    // met with duplicated number
                    repeated = B.get(num - 1);
                    //indexOfMissing = i;
                    break;
                }
                // swap B[i] with B[num - 1]
                int temp = B.get(i);
                B.set(i, B.get(num - 1));
                B.set(num - 1, temp);
            }
        }
        
        //result.add(repeated);
        //result.add(indexOfMissing + 1);
        return repeated;
	}
}
