
*****PASCAL TRIANGLE *****

Given numRows, generate the first numRows of Pascal’s triangle.

Pascal’s triangle : To generate A[C] in row R, sum up A’[C] and A’[C-1] from previous row R - 1.

Example:

Given numRows = 5,

Return

[
     [1],
     [1,1],
     [1,2,1],
     [1,3,3,1],
     [1,4,6,4,1]
]


public class Solution {
	public ArrayList<ArrayList<Integer>> generate(int a) {
	    
	    ArrayList<ArrayList<Integer>> res=new ArrayList<>();
	    if(a<1){
	        return res;
	    }
	    
	    ArrayList<Integer> row=new ArrayList<>();
	    row.add(1);
	    res.add(row);
	    
	    for(int i=1;i<a;i++){
	        ArrayList<Integer> rowList=new ArrayList<>();
	        rowList.add(1);
	        int currRowSize=res.get(i-1).size();
	        for(int j=1;j<currRowSize;j++){
	            rowList.add(res.get(i-1).get(j)+res.get(i-1).get(j-1));
	        }
	        rowList.add(1);
	        res.add(rowList);
	    }
	    return res;
	}
}
