package logic;

import java.util.ArrayList;
import java.util.Scanner;
public class PascalTriangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter num of rows in Pascal Triangle");
		int n=scan.nextInt();
		System.out.println(generatePascalTriangle(n));
	}
	public static ArrayList<ArrayList<Integer>> generatePascalTriangle(int n) {
		// TODO Auto-generated method stub
		ArrayList<ArrayList<Integer>> finList=new ArrayList<ArrayList<Integer>>();
		for(int irow=0;irow<n;irow++) {
			ArrayList<Integer> currRow=new ArrayList<Integer>();
			for(int jCol=0;jCol<=irow;jCol++) {
				if(jCol==0)
					currRow.add(1);
				else if(jCol<irow) {
					int num=finList.get(irow-1).get(jCol-1)+finList.get(irow-1).get(jCol);
					currRow.add(num);
				}
				else if(jCol==irow) {
					currRow.add(1);
				}
			}
			finList.add(currRow);
		}
		return finList;
	}
}
