/**
 * Created by anshu on 08/06/17.
 */
public class LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
            return "";
        String pre = strs[0];
        int n=strs.length;
        for(int i=1;i<n;i++){
            while(strs[i].indexOf(pre)!=0)
                pre = pre.substring(0,pre.length()-1);
        }
        return pre;
    }
}
