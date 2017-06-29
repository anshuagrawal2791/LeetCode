import java.util.Stack;

/**
 * Created by anshu on 29/06/17.
 */
public class TrapWater {
    public int trap(int[] height) {
        Stack<Integer> s = new Stack<>();
        int i=0;
        int total=0;
        while(i<height.length){
            if(s.isEmpty()||height[i]<=height[s.peek()])
                s.push(i++);
            else{
                int pre = s.pop();

                int water = 0;
                if(!s.isEmpty())
                    water=(Math.min(height[i],height[s.peek()])-height[pre])*(i-s.peek()-1);
                total+=water;
            }
        }
        return total;
    }
}
