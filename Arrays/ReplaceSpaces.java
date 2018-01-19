
package Arrays;

public class ReplaceSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="i am Rashmitha";
		char[] arr = new char[str.length() + 2 * 2 + 1];
		//System.out.print(str.length());
		for (int i = 0; i < str.length(); i++) {
			arr[i] = str.charAt(i);
		}
		System.out.println(replaceSpace(arr,str.length()));
	}
	static char[] replaceSpace(char[] arr,int length){
		int count=0,newLength,i;			
		for (i = 0; i <length; i++) {
			if(arr[i]==' ')
				count++;
		}
		newLength=length+count*2;	
		arr[newLength]='\0';	
		for(i=length-1;i>=0;i--){
			if(arr[i]==' '){
				arr[newLength-1]='0';
				arr[newLength-2]='2';
				arr[newLength-3]='%';
				newLength=newLength-3;
			}
			else{
				arr[newLength-1]=arr[i];
				newLength=newLength-1;
			}
		}
		
		return arr;
	}
}
