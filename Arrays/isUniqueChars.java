package Arrays;


import java.util.*;
public class isUniqueChars {
	
	public static void main(String[] args){
		boolean res;
		for (int i = 0; i < args.length; i++) {
			res=isUnique3(args[i]);
			System.out.println(res);
		}
	}
	
	static boolean isUnique(String str){
		boolean[] char_set=new boolean[256];
		for (int i = 0; i < str.length(); i++) {
			int val=str.charAt(i);
			if(char_set[val])
				return false;
			char_set[val]=true;
		}
		return true;	
	}
	
	static boolean isUnique3(String str){
		char tmpArray[]=str.toCharArray();
		Arrays.sort(tmpArray);
		for (int i = 0; i < tmpArray.length-1; i++) {
			if(tmpArray[i]==tmpArray[i+1])
				return false;
		}
		return true;
	}
	
	static boolean isUnique2(String str){
		int checker = 0;
		 for (int i = 0; i < str.length(); ++i) {
			 int val = str.charAt(i) - 97;
			 if ((checker & (1 << val)) > 0) 
				 return false;
		 checker |= (1 << val);
		 }
		 return true;
	}

}
