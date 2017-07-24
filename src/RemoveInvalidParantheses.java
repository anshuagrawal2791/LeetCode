import java.util.*;

/**
 * Created by anshu on 23/07/17.
 */
public class RemoveInvalidParantheses {
    public class Solution {
        public List<String> removeInvalidParentheses(String s) {
            Queue<String> q = new LinkedList<>();
            HashSet<String> visited = new HashSet<>();
            q.add(s);
            visited.add(s);
            int length = s.length();
            HashSet<String> results = new HashSet<>();
            boolean reached=false;
            while(!q.isEmpty()){
                String cur = q.poll();
                if(!reached){
                    if(isValid(cur)){
                        reached=true;
                        length=cur.length();
                        results.add(cur);
                    }else{
                        for(int i=0;i<cur.length();i++){
                            char x = cur.charAt(i);
                            if(x!='('&&x!=')')
                                continue;
                            else{
                                String toAdd = cur.substring(0,i)+cur.substring(i+1);
                                if(!visited.contains(toAdd)){
                                    q.add(toAdd);
                                    visited.add(toAdd);
                                }
                            }
                        }
                    }
                }
                else{
                    if(isValid(cur))
                        results.add(cur);
                }
            }
            return new ArrayList<String>(results);
        }
        boolean isValid(String a){
            int count =0;
            for(int i=0;i<a.length();i++)
            {
                if(a.charAt(i)=='(')
                    count++;
                else if(a.charAt(i)==')')
                    count--;
                if(count<0)
                    return false;
            }
            if(count==0)
                return true;
            else
                return false;
        }
    }
}
