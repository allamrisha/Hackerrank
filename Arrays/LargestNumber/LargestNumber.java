
/*
Largest Number

Given a list of non negative integers, arrange them such that they form the largest number.

For example:

Given [3, 30, 34, 5, 9], the largest formed number is 9534330.

Note: The result may be very large, so you need to return a string instead of an integer.

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution  implements Comparator<String>{
	// DO NOT MODIFY THE LIST
	public String largestNumber(final List<Integer> a) {
	    List<String> copy=new ArrayList<String>();
	    
	    for(Integer num:a){
	        String x=num.toString();
	        copy.add(x);
	    }
	    Collections.sort(copy,this);
	    
	    StringBuilder res=new StringBuilder();
	    int sum=0;
	    for(int i=copy.size()-1;i>=0;i--){
	        res.append(copy.get(i));
	        sum+=Integer.parseInt(copy.get(i));
	    }
	    
	    return (sum==0)?"0":res.toString();
	}
	public int compare(String a, String b){
	    String first=a+b;
	    String sec=b+a;
	    return first.compareTo(sec);
	    //return a.compareTo(b);
	}
}