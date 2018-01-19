

/*

Write a function to return the compressed version of any string using the Run-length algorithm. This algorithm takes any repeating character and outputs a the number of occurances before the first character of that sequence.

For example: "aaabbcdddd" would result in "3a2bc4d"
*/

public class Solution {
	public static String RunLengthEncoding(String source) {
		// Your code goes here
		
	  StringBuffer dest = new StringBuffer();
		for (int i = 0; i < source.length(); i++) {
            int runLength = 1;
			    while (i + 1 < source.length()
                    && source.charAt(i) == source.charAt(i + 1)) {
                    runLength++;
                    i++;
			    }
		if(runLength>1)
            dest.append(runLength);
        dest.append(source.charAt(i));
		}
		
      return dest.toString();
	   //System.out.println("Compressed: " + compressed); 
	}
}