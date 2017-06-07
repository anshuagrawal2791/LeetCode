import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 08/06/17.
 */
public class GenerateParantheses {
    HashSet<String> finalList = new HashSet<>();
    public List<String> generateParenthesis(int n) {
        add(0,0,"",n);
        return new ArrayList<String>(finalList);
    }
    void add(int i,int closed,String pre, int n){
        // System.out.println(pre);
        if(i==(2*n)){
            finalList.add(pre);
            return;
        }
        int open = i-closed;
        if(closed<open){
            if(closed<n)
                add(i+1,closed+1,pre+")",n);
            if(open<n){
                add(i+1,closed,pre+"(",n);
            }
        }else if(closed==open&&open<n){
            add(i+1,closed,pre+"(",n);
        }
    }
}
