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
    public List<Interval> merge(List<Interval> intervals) {
        if (intervals.size() <= 1){
            return intervals;
        }
        
        List<Interval> ret = new ArrayList<Interval>();
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval o1, Interval o2){
                return o1.start - o2.start; 
            }
        });
        Interval cur = intervals.get(0);
        for (Interval interval : intervals){
            if (cur.end >= interval.start){
                cur.end = Math.max(cur.end, interval.end);
            }else{
                ret.add(cur);
                cur = interval; 
            }
        }
        ret.add(cur);
        return ret; 
    }
}