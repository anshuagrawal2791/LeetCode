import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 26/07/17.
 */
public class FindAnagramsInString {
    public class Solution {
        public List<Integer> findAnagrams(String s, String p) {
            int n = s.length();
            int m = p.length();
            if(n==0||n<m)
                return new ArrayList<Integer>();
            int need[] = new int[26];
            int have[] = new int[26];
            for(int i=0;i<m;i++){
                need[p.charAt(i)-'a']++;
            }
            int i=0;
            int j=0;
            for(j=0;j<m;j++)
                have[s.charAt(j)-'a']++;
            ArrayList<Integer> li = new ArrayList<>();
            while(i<=n-m){
                if(isValid(need,have)){
                    li.add(i);
                }
                have[s.charAt(i)-'a']--;
                i++;
                if(j<s.length())
                    have[s.charAt(j)-'a']++;
                j++;
            }

            return li;
        }
        boolean isValid(int a[],int b[]){
            for(int i=0;i<26;i++)
                if(a[i]!=b[i])
                    return false;

            return true;
        }
    }
}
