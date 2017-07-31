import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by anshu on 25/07/17.
 */
public class QueueReconstruction {
    public class Solution {
        class People{
            int h;
            int k;
            public People(int h,int k){
                this.h=h;
                this.k=k;
            }
        }
        public int[][] reconstructQueue(int[][] people) {
            if(people.length==0)
                return new int[0][0];
            ArrayList<People> peeps = new ArrayList<>();
            for(int i=0;i<people.length;i++){
                peeps.add(new People(people[i][0],people[i][1]));
            }
            Collections.sort(peeps,new Comparator<People>(){
                public int compare(People p1,People p2){
                    int a = p1.k;
                    int b=p2.k;
                    if(a<b)
                        return -1;
                    else if(a==b)
                        return 0;
                    return 1;
                }
            });
            Collections.sort(peeps,new Comparator<People>(){
                public int compare(People p1, People p2){
                    int a = p1.h;
                    int b = p2.h;
                    if(a<b)
                        return 1;
                    else if(a==b)
                        return 0;
                    else return -1;
                }
            });

            // int[][] res = new int[peeps.size()][2];
            ArrayList<People> res = new ArrayList<>();
            int max = peeps.get(0).h;
            for(int i=0;i<peeps.size();i++){
                People cur = peeps.get(i);
                // System.out.println(cur.h+" "+cur.k);
                if(cur.h==max||cur.k>=res.size())
                    res.add(cur);
                else
                    res.add(cur.k,cur);
            }
            int a[][] = new int[res.size()][2];
            for(int i=0;i<res.size();i++){
                a[i][0]=res.get(i).h;
                a[i][1]=res.get(i).k;
            }
            return a;
        }
    }
}
