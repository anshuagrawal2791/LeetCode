import java.util.HashMap;
import java.util.HashSet;
import java.util.Stack;

/**
 * Created by anshu on 08/06/17.
 */
public class ValidParantheses {
    public boolean isValid(String s) {
        HashSet<Character> open = new HashSet<>();
        HashSet<Character> close = new HashSet<>();
        HashMap<Character,Character> map = new HashMap<>();
        map.put('(',')');
        map.put('[',']');
        map.put('{','}');
        open.add('(');
        open.add('[');
        open.add('{');
        close.add(')');
        close.add(']');
        close.add('}');
        Stack<Character> stack = new Stack<>();
        for(int i=0;i<s.length();i++){
            if(open.contains(s.charAt(i))){
                stack.push(s.charAt(i));
            }else{
                if(stack.isEmpty())
                    return false;
                else if(map.get(stack.peek())!=s.charAt(i))
                    return false;
                else stack.pop();
            }
        }
        if(stack.isEmpty())
            return true;
        return false;
    }
}
