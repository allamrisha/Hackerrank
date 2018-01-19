package logic;

import java.util.HashMap;
import java.util.Scanner;

public class SumTarget {
        public static void main(String[] args){
                Scanner s=new Scanner(System.in);
                System.out.print("enter target number");
                int target=s.nextInt();
                System.out.print("enter size of array");
                int size=s.nextInt();
                int[] nums=new int[size];
                System.out.print("enter array of numbers");
                for (int i = 0; i < nums.length; i++) {
                        nums[i]=s.nextInt();
                }
                int[] res=twoSum(nums,target);
                System.out.print("Result numbers:");
                for (int i = 0; i < res.length; i++) {
                        System.out.println(res[i]);
                }        
        }
        public static int[] twoSum(int[] nums, int target) {
            if(nums==null || nums.length<2)
                return new int[]{0,0};
            
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
            for(int i=0; i<nums.length; i++){
                if(map.containsKey(nums[i])){
                        return new int[]{nums[i],target-nums[i]};
                    //return new int[]{map.get(nums[i]), i};
                }else{
                    map.put(target-nums[i], i);
                    //System.out.println(nums[i]);    
                }
            }
         
            return new int[]{0,0};
        }
}			