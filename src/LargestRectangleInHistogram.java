import java.util.Stack;

/**
 * Created by anshu on 20/06/17.
 */
public class LargestRectangleInHistogram {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> s = new Stack<>();
        int max = Integer.MIN_VALUE;
        int i;
        for(i=0;i<heights.length;){
            //  System.out.println(s.toString()+" "+ max);

            if(s.isEmpty()||heights[s.peek()]<heights[i])
                s.push(i++);
            else{
                int l = s.pop();
                int area = heights[l]*((s.isEmpty())?i:i-s.peek()-1);
                max=Math.max(area,max);
            }
        }
        while(!s.isEmpty()){
            int l = s.pop();
            int area= heights[l]*((s.isEmpty())?i:i-s.peek()-1);
            max=Math.max(area,max);
        }
        return (max!=Integer.MIN_VALUE)?max:0;
    }
}
