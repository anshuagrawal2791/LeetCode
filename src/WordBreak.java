import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 29/06/17.
 */
public class WordBreak {
    HashMap<String, Boolean> map = new HashMap<>();
    HashSet<String> dict;
    public boolean wordBreak(String s, List<String> wordDict) {
        dict = new HashSet<>(wordDict);
        return check(s);
    }
    boolean check(String s){
        if(map.containsKey(s))
            return map.get(s);
        if(dict.contains(s)){
            map.put(s,true);
            return true;
        }
        for(int i=1;i<s.length();i++){
            if(dict.contains(s.substring(0,i))){
                if( check(s.substring(i))){
                    map.put(s,true);
                    return true;
                }
            }
        }
        map.put(s,false);
        return false;
    }
}
