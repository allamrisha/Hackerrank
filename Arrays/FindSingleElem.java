package Arrays;

public class FindSingleElem {
    
    static int findSingle(int ar[], int ar_size)
    {
        // Do XOR of all elements and return
        int res = ar[0];
        for (int i = 0; i < ar_size; i++)
            res = res ^ ar[i];
     
        return res;
    }
 
    // Driver function to test the above function
    public static void main (String[] args)
    {
        int ar[] = {2, 3,3, 5,5, 4, 5, 4, 3, 4};
        int n = ar.length;
        System.out.println("Element occurring once is " +
                              findSingle(ar, n) + " ");
    }

}
