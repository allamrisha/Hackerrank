***** WAVE ARRAY *****

Given an array of integers, sort the array into a wave like array and return it,
In other words, arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5.....

Example

Given [1, 2, 3, 4]

One possible answer : [2, 1, 4, 3]
Another possible answer : [4, 1, 3, 2]


public class Solution {
	public ArrayList<Integer> wave(ArrayList<Integer> a) {
	   
	   int n =a.size();
	    Collections.sort(a);
	    
	    for(int i=0;i<n-1;i++){
	        if(i%2==0){
	            if(a.get(i)<a.get(i+1)){
	                Integer tmp=a.get(i);
	                a.set(i,a.get(i+1));
	                a.set(i+1,tmp);
	                }
	            }
	        if(i%2!=0){
	            if(a.get(i)>a.get(i+1)){
	                Integer tmp=a.get(i);
	                a.set(i,a.get(i+1));
	                a.set(i+1,tmp);
	                }
	            }
	  }
	    return a;
	}
}
