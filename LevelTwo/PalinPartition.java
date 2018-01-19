package logic;

import java.util.ArrayList;
import java.util.List;

public class PalinPartition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input="aab";
		System.out.println(palindromePartitioning(input));
		System.out.println(partition(input));
		
	}
	//Use Dynamic Programming
	public static List<String> palindromePartitioning(String s) {
		List<String> result = new ArrayList<String>();
		if (s == null)
			return result;
		if (s.length() <= 1) {
			result.add(s);
			return result;
		}
		int length = s.length();
		int[][] table = new int[length][length];
	 
		// l is length, i is index of left boundary, j is index of right boundary
		for (int l = 1; l <= length; l++) {
			for (int ileft = 0; ileft <= length - l; ileft++) {
				int jright = ileft + l - 1;
				if (s.charAt(ileft) == s.charAt(jright)) {
					if (l == 1 || l == 2) {
						table[ileft][jright] = 1;
					} else {
						table[ileft][jright] = table[ileft + 1][jright - 1];
					}
					if (table[ileft][jright] == 1) {
						result.add(s.substring(ileft, jright + 1));
					}
				} else {
					table[ileft][jright] = 0;
				}
			}
		}
	 
		return result;
	}
	
	// Use Depth-first Search
	
	public static ArrayList<ArrayList<String>> partition(String s) {
		ArrayList<ArrayList<String>> result = new ArrayList<ArrayList<String>>();
	 
		if (s == null || s.length() == 0) {
			return result;
		}
	 
		ArrayList<String> partition = new ArrayList<String>();//track each possible partition
		addPalindrome(s, 0, partition, result);
	 
		return result;
	}
	 
	private static void addPalindrome(String s, int start, ArrayList<String> partition,
			ArrayList<ArrayList<String>> result) {
		//stop condition
		if (start == s.length()) {
			ArrayList<String> temp = new ArrayList<String>(partition);
			result.add(temp);
			return;
		}
	 
		for (int i = start + 1; i <= s.length(); i++) {
			String str = s.substring(start, i);
			if (isPalindrome(str)) {
				partition.add(str); 
				addPalindrome(s, i, partition, result);
				partition.remove(partition.size() - 1);
			}
		}
	}
	 
	private static boolean isPalindrome(String str) {
		int left = 0;
		int right = str.length() - 1;
	 
		while (left < right) {
			if (str.charAt(left) != str.charAt(right)) {
				return false;
			}
	 
			left++;
			right--;
		}
	 
		return true;
	}
}
