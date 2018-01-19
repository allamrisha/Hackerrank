
/*
Given a number N, find all prime numbers upto N ( N included ).

Example:

if N = 7,

all primes till 7 = {2, 3, 5, 7}

Make sure the returned array is sorted.
*/


public class Solution {
	public ArrayList<Integer> sieve(int a) {
	    
	    ArrayList<Integer> res=new ArrayList<Integer>();
        int num=0,j=0;
        for(int i=1;i<=a;i++){
            int count=0;
            for(num=i;num>=1;num--){
                if(i%num==0)
                    count+=1;
            }
            if(count==2){
                res.add(i);
                //j+=1;
            }
	}
	return res;
}
}
