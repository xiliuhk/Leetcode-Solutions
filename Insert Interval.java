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
    public List<Interval> insert(List<Interval> intervals, Interval newInterval) {
        int i = 0; 
        while (i < intervals.size() && intervals.get(i).end < newInterval.start){
            i++; 
        }
        int start = newInterval.start, end = newInterval.end; 
        while (i < intervals.size() && intervals.get(i).start <= newInterval.end){
            start = Math.min(intervals.get(i).start, start); 
            end = Math.max(intervals.get(i).end, end); 
            intervals.remove(i);
        }
        intervals.add(i, new Interval(start, end)); 
        return intervals; 
    }
}