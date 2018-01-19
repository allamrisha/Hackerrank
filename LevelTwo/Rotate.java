package logic;

public class Rotate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6};
		int numRotations=3,n=arr.length;
		for(int i=0;i<numRotations;i++) {
			int tmp=arr[0],j;
			for(j=0;j<n-1;j++)
				arr[j]=arr[j+1];
			arr[j]=tmp;
		}
		for(int l=0;l<n;l++) {
			System.out.println(arr[l]);
		}

	}

}
