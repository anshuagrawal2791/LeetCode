import java.util.HashSet;

/**
 * Created by anshu on 06/06/17.
 */
public class LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        int i;
        if(n>1)
            i=0;
        else if(n==1) return 1;
        else return 0;
        int j=1;
        int global = 1;
        set.add(s.charAt(i));
        while(i<n&&j<n){
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                global = Math.max(global,j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return global;

    }
}
