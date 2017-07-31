import java.util.Stack;

/**
 * Created by anshu on 30/07/17.
 */
public class LongestValidParantheses {
    public class Solution {
        public int longestValidParentheses(String s) {
            Stack<Integer> stack = new Stack<>();
            for(int i=0;i<s.length();i++){
                if(stack.isEmpty()){
                    stack.push(i);
                }
                else if(s.charAt(i)=='('){
                    stack.push(i);
                }
                else if(s.charAt(i)==')'){
                    if(s.charAt(stack.peek())=='(')
                        stack.pop();
                    else stack.push(i);
                }
            }
            if(stack.size()==s.length())
                return 0;
            int y = s.length();
            int x=-1;
            int max =0;
            // System.out.println(stack.toString());
            while(!stack.isEmpty()){
                x=stack.pop();
                max=Math.max(max,y-x-1);
                y=x;
            }
            x=-1;
            max=Math.max(max,y-x-1);
            // if(y!=0){
            //     max=Math.max()
            // }
            return max;
        }
    }
}
