package logic;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class MergeIntervals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Interval e=new Interval(1,3);
		Interval e2=new Interval(2,6);
		Interval e3=new Interval(8,10);
		Interval e4=new Interval(15,18);
		
		List<Interval> intervals=new ArrayList<>();
		intervals.add(e);
		intervals.add(e2);
		intervals.add(e3);
		intervals.add(e4);
		
		List<Interval> result=merge(intervals);
		for(int i=0;i<result.size();i++)
			
			System.out.println("["+result.get(i).start +" , "+result.get(i).end+"]");
	}
	
	public static List<Interval> merge(List<Interval> intervals) {
	    List<Interval> result = new ArrayList<Interval>();
	 
	    if(intervals==null||intervals.size()==0)
	        return result;
	    
	    Collections.sort(intervals, new Comparator<Interval>(){
	        public int compare(Interval i1, Interval i2){
	            if(i1.start!=i2.start)
	                return i1.start-i2.start;
	            else
	                return i1.end-i2.end;
	        }
	    });
	 
	    Interval pre = intervals.get(0);
	    for(int i=0; i<intervals.size(); i++){
	        Interval curr = intervals.get(i);
	        if(curr.start>pre.end){
	            result.add(pre);
	            pre = curr;
	        }else{
	            Interval merged = new Interval(pre.start, Math.max(pre.end, curr.end));
	            pre = merged;
	        }
	    }
	    result.add(pre);
	    return result;
	}

}
