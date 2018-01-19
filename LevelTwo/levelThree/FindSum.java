package test;

import java.util.HashMap;

/*
 * Algorithm: Traverse through each element in the array and check if there is any other element whose is equal
 * to the sum
 * Time Complexity : O(n2) 
 */


public class FindSum {
	
	public static void main(String args[])
    {
        int[] arr = { 1, 5, 7, -1, 5 };
        int sum = 6;
        getPairsCount(arr, sum);
        //getPairsCount2(5, sum,arr);

    }
	
    // Prints if there exists a pair in arr[0..n-1] whose  sum is equal
    // to 'sum'
    public static void getPairsCount(int[] arr, int sum)
    {
 
        int count = 0;// Initialize a counter
 
        // Consider all possible pairs and check their sums
        for (int i = 0; i < arr.length; i++)
            for (int j = i + 1; j < arr.length; j++)
                if ((arr[i] + arr[j]) == sum)
                    count++;
       // System.out.printf("Count of pairs is %d",count);
        System.out.println(count>0?true:false);
    }     
}
    
   
