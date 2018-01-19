package Arrays;

public class Anagrams {
	
	public static void main(String[] args){
		String s="apple",t="papel";
		System.out.print(isAnagram(s,t));
	}	
	static boolean isAnagram(String s,String t){
		if(s.length()!=t.length())
			return false;
		int[] numOfChars=new int[256];
		int numUniqueChars=0,numCompleted=0;	
		char[] tmp=s.toCharArray();
		//iterate over 1st string and increment the count of every character in array
		for (char c : tmp) {
			if(numOfChars[c]==0) 
				numUniqueChars++;		
		numOfChars[c]++;		
		}
		for(int i=0;i<t.length();++i){
			int c=(int)t.charAt(i);
			if(numOfChars[c]==0)
				return false;
			--numOfChars[c];
			if(numOfChars[c]==0){
				++numCompleted;
				if(numCompleted==numUniqueChars){
					return true;
					//return i==t.length()-1; // indicates that both are anagrams iff the second string parsed till the end
				}
			}
		}
		return false;
	}
}
