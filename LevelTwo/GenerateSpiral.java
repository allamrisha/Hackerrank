package logic;

import java.util.ArrayList;

public class GenerateSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int[][] input= {{1,2,3},{8,9,4},{7,6,5}};
		int input=4;
		System.out.println(generateSpiral(input));
	}
	public static ArrayList<Integer> generateSpiral(int input) {
		// TODO Auto-generated method stub
		
		int left=0,right=input-1,top=0,bottom=input-1;
		ArrayList<Integer> result=new ArrayList<>();
		int tmp=input,k=1;
		while(k<=tmp*tmp) {
			if(top>bottom || left>right)
				break;
			//top row
			for(int i=left;i<=right;i++) {
				result.add(k);
				k++;
			}
			top++;
			//rightmost column
			for(int i=top;i<=bottom;i++) {
				result.add(k);
				k++;
			}
			right--;
			//bottom most row
			for(int i=right;i>=left;i--) {
				result.add(k);
				k++;
			}
			bottom--;	
			//leftmost column
			for(int i=bottom;i>=top;i--) {
				result.add(k);
				k++;
			}
			left++;
		}
		return result;
	}
}
