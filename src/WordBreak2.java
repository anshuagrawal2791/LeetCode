import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 29/06/17.
 */
public class WordBreak2 {
    HashMap<String,List<String>> visited = new HashMap<>();
    HashSet<String> dict;
    // List<String> finalList = new ArrayList<>();
    public List<String> wordBreak(String s, List<String> wordDict) {
        dict = new HashSet<>(wordDict);
        return put(s,"");
        // return finalList;
    }
    List<String> put(String s, String prefix){
        // System.out.println(visited.toString());
        // System.out.println(s+" "+visited.toString());
        List<String> toReturn = new ArrayList<>();
        if(visited.containsKey(s)){
            // System.out.println("returned: "+s);
            return visited.get(s);
        }
        if(dict.contains(s)){
            // visited.add(s);
            // String x = prefix+s;
            // finalList.add(x);
            toReturn.add(s);

        }
        for(int i=1;i<s.length();i++)
        {
            String aux = s.substring(0,i);
            if(dict.contains(aux)){
                String y = prefix+aux+" ";
                for(String p:put(s.substring(i),y)){
                    toReturn.add(aux+" "+p);
                }
            }
            // System.out.println("//////"+toReturn.toString());
        }
        visited.put(s,toReturn);
        return toReturn;
    }
}
