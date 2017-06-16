import java.util.*;

/**
 * Created by anshu on 16/06/17.
 */
public class MergeInterval {
    class Interval {
             int start;
             int end;
             Interval() { start = 0; end = 0; }
             Interval(int s, int e) { start = s; end = e; }
         }
    public List<Interval> merge(List<Interval> intervals) {
        Collections.sort(intervals, new Comparator<Interval>(){
            @Override
            public int compare(Interval i1, Interval i2){
                int a = i1.start;
                int b = i2.start;
                return a > b ? +1 : a < b ? -1 : 0;
            }
        });
        Stack<Interval> s = new Stack<>();
        for(int i=0;i<intervals.size();i++){
            if(s.isEmpty()){
                s.push(intervals.get(i));
            }else if(intervals.get(i).start>s.peek().end){
                s.push(intervals.get(i));
            }else{
                Interval x = s.pop();
                Interval cur = intervals.get(i);
                Interval toPut = new Interval(x.start,Math.max(cur.end,x.end));
                s.push(toPut);
            }
        }
        // Stack<Interval> aux = new Stack<>();
        // while(!s.isEmpty()){
        //     aux.push(s.pop());
        // }
        return new ArrayList<Interval>(s);
    }
}
