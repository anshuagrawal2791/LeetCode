import java.util.HashMap;
import java.util.HashSet;

/**
 * Created by anshu on 29/06/17.
 */
public class MinPartitionsIntoPalins {
    HashMap<String, Integer> map = new HashMap<>();
    HashSet<String> pals = new HashSet<>();
    public int minCut(String s) {
        return part(s);
    }
    int part(String s){
        if(map.containsKey(s))
            return map.get(s);
        if(isPal(s))
            return 0;
        int min = Integer.MAX_VALUE;
        for(int i=1;i<s.length();i++){
            int x = part(s.substring(0,i))+part(s.substring(i))+1;
            min = Math.min(x,min);
        }
        map.put(s,min);
        return min;
    }
    boolean isPal(String s){
        // int n = s.length();
        // if(n==1)
        // return true;
        // return s.substring(0,n/2).equals(s.substring((n+1)/2).reverse());


        StringBuilder input1 = new StringBuilder();
        input1.append(s);
        input1=input1.reverse();
        return s.equals(input1.toString());
        // if(s.equals(input1.toString())){
        // pals.add(s);
        // return true;
        // }
        // return false;
    }
}
