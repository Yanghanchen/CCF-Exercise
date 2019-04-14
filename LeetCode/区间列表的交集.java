/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
class Solution {
    public Interval[] intervalIntersection(Interval[] A, Interval[] B) {
        if(A==null&&A.length==0||B==null||B.length==0){
            return new Interval[0];
        }
        ArrayList<Interval> list=new ArrayList<>();
        int i=0,j=0;
        while(i<A.length&&j<B.length){
            if(A[i].end < B[j].start){
                i++;
                continue;
            }
            if(A[i].start > B[j].end){
                j++;
                continue;
            }
            if(A[i].start <= B[j].start && B[j].start <= A[i].end && A[i].end <= B[j].end){
                list.add(new Interval(B[j].start,A[i].end));
                A[i].start = B[j].start;
                B[j].start = A[i].end+1;
                i++;
                continue;
            }
            if(A[i].start <= B[j].start && B[j].start <= B[j].end && B[j].end <= A[i].end){
                list.add(new Interval(B[j].start,B[j].end));
                A[i].start = B[j].end+1;
                j++;
                continue;
            }
            if(B[j].start <= A[i].start && A[i].start <= B[j].end && B[j].end <= A[i].end){
                list.add(new Interval(A[i].start,B[j].end));
                B[j].start = A[i].start;
                A[i].start = B[j].end+1;
                j++;
                continue;
            }
            if(B[j].start <= A[i].start && A[i].start <= A[i].end && A[i].end <= B[j].end){
                list.add(new Interval(A[i].start,A[i].end));
                B[j].start = A[i].end+1;
                i++;
                continue;
            }
        }
        return list.toArray(new Interval[list.size()]);
    }
}