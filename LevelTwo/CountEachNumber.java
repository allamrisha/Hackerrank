
import java.util.*;
public class CountEachNumber {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,1,5,6,3,2,6};
		HashMap<Integer,Integer> countMap=countNumbers(arr);
		System.out.println(countMap);
		
		findRepeatedElement(arr);
	}

	private static void findRepeatedElement(int[] arr) {
		// TODO Auto-generated method stub
		HashSet<Integer> set=new HashSet<Integer>();
		for(int tmp:arr) {
			if(set.contains(tmp))
				System.out.println(tmp);
			else {
				set.add(tmp);
			}
		}
	}
	private static HashMap<Integer,Integer> countNumbers(int[] arr) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> hm=new HashMap();
		for(int i=0;i<arr.length;i++) {
			int tmp=arr[i];
			if(hm.containsKey(tmp))
				hm.put(tmp, hm.get(tmp)+1);
			else
				hm.put(tmp, 1);
		}
		
		return hm;
	}

}
