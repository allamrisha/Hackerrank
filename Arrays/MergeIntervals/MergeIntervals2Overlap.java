
/*

Merge Intervals

Given a set of non-overlapping intervals, insert a new interval into the intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.

Example 1:

Given intervals [1,3],[6,9] insert and merge [2,5] would result in [1,5],[6,9].

Example 2:

Given [1,2],[3,5],[6,7],[8,10],[12,16], insert and merge [4,9] would result in [1,2],[3,10],[12,16].

This is because the new interval [4,9] overlaps with [3,5],[6,7],[8,10].

Make sure the returned intervals are also sorted.

*/

/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    public ArrayList<Interval> merge(ArrayList<Interval> intervals) {


        ArrayList<Interval> result=new ArrayList<>();
        
        Collections.sort(intervals, new Comparator<Interval>(){

            @Override
            public int compare(Interval o1, Interval o2) {
                if (o1.start != o2.start) {
                    return o1.start - o2.start;
                } else {
                    return o1.end - o2.end;
                }
            }
        });
        
        for(int i=0;i<intervals.size()-1;i++)
        {   
            Interval interval=intervals.get(i);
            Interval newInterval=intervals.get(i+1);
            if(interval.end<newInterval.start)
                result.add(interval);
            /*
            else if(newInterval.end<interval.start){
                result.add(newInterval);
                result.addAll(intervals.subList(i,intervals.size()));
                return result;
            }
            */
            else{
                //continue merging intervals until True
                interval.start=Math.min(interval.start,newInterval.start);
                interval.end=Math.max(interval.end,newInterval.end);
                intervals.remove(i+1);
                i--;
                //result.add(newInterval);
            }
            
        }
        result.add(intervals.get(intervals.size() - 1));
        return result;
        
    }
}
