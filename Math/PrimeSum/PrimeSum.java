/*
Prime Sum

Given an even number ( greater than 2 ), return two prime numbers whose sum will be equal to given number.


Example:


Input : 4
Output: 2 + 2 = 4

If there are more than one solutions possible, return the lexicographically smaller solution.

If [a, b] is one solution with a <= b,
and [c,d] is another solution with c <= d, then

[a, b] < [c, d] 

If a < c OR a==c AND b < d. 
*/

public class Solution {
    public ArrayList<Integer> primesum(int a) {
        
        ArrayList<Integer> res=new ArrayList<Integer> ();
        if(a<2)
            return res;
        int first=2;
        
        int sec=a-first;
        
        while(first<=sec){
            sec=a-first;
            if(isPrime(sec) && isPrime(first)){
                res.add(first);
                res.add(sec);
                return res;
            }
            first++;
        }
        return res;
    }
    
    public boolean isPrime(int n){
        if(n==2)
            return true;
        if(n%2==0)
            return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
                return false;
        }
        return true;
    }
}