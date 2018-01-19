package test;

import java.util.ArrayList;

public class PossiblePermutations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {6,7,5};
		System.out.println(permutate(arr));
	}

	private static ArrayList<ArrayList<Integer>>   permutate(int[] arr) {
		ArrayList<ArrayList<Integer>> result=new ArrayList<ArrayList<Integer>>();
        //start from an empty list
		result.add(new ArrayList<Integer>());
		for(int i=0;i<arr.length;i++) {
            //create a list of lists in current iteration using the array arr
			ArrayList<ArrayList<Integer>> current=new ArrayList<ArrayList<Integer>>();
			//Generate the inner lists in the result list
			for(ArrayList<Integer> tmpList:result) {
                // # of locations to insert is largest index + 1
				for(int index=0;index<tmpList.size()+1;index++) {
                    // + add num[i] to different locations
					tmpList.add(index,arr[i]);
					ArrayList<Integer> temp=new ArrayList<Integer>(tmpList);
					current.add(temp);
					tmpList.remove(index);
					
				}
			}
            result = new ArrayList<ArrayList<Integer>>(current);
		}
		return result;
	
	}

}
