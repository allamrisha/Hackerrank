package logic;

import java.util.ArrayList;

public class SpiralMatrix {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] input= {{1,2,3},{8,9,4},{7,6,5}};
		System.out.println(generateSpiral(input));
	}
	public static ArrayList<Integer> generateSpiral(int[][] input) {
		// TODO Auto-generated method stub
		int left=0,right=input[0].length-1,top=0,bottom=input.length-1;
		ArrayList<Integer> result=new ArrayList<>();
		while(true) {
			if(top>bottom || left>right)
				break;
			//top row
			for(int i=left;i<=right;i++) {
				result.add(input[top][i]);
			}
			top++;
			//rightmost column
			for(int i=top;i<=bottom;i++) {
				result.add(input[i][right]);
			}
			right--;
			//bottom most row
			for(int i=right;i>=left;i--) {
				result.add(input[bottom][i]);
			}
			bottom--;	
			//leftmost column
			for(int i=bottom;i>=top;i--) {
				result.add(input[i][left]);
			}
			left++;
		}
		return result;
	}

}
