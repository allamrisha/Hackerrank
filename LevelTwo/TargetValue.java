package logic;

public class TargetValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] input={5,7,7,8,8,10};
		TargetValue obj=new TargetValue();
		int[] result=obj.range(input,8);
		 for(int i=0;i<result.length;i++)
	        	System.out.println(result[i]);
	}

	private int[] range(int[] input, int target) {
		// TODO Auto-generated method stub
		if(input == null || input.length==0)
			return null;
		int[] arr=new int[2];
		arr[0]=-1;
		arr[1]=-1;
		binarySearch(input,0,input.length-1,arr,target);
		return arr;
	}

	private void binarySearch(int[] input, int left, int right, int[] arr, int target) {
		// TODO Auto-generated method stub
		
		if(right<left)
			return;
		if(input[left]==input[right] && input[left]==target)
		{
			arr[0]=left;
			arr[1]=right;
			return;
		}
		int mid=left+(right-left)/2;
		if(input[mid]<target)
			binarySearch(input,mid+1,right,arr,target);
		else if(input[mid]>target)
			binarySearch(input,left,mid-1,arr,target);
		else {
			arr[0]=mid;
			arr[1]=mid;
			int tmp=mid;
			while(tmp>left && input[tmp]==input[tmp-1]) {
				tmp--;
				arr[0]=tmp;
			}
			while(tmp<right && input[tmp]==input[tmp+1]) {
				tmp++;
				arr[1]=tmp;
			}
			return;
		}
	}
}
