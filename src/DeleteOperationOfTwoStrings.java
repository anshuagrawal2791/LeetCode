import java.util.Arrays;

/**
 * Created by anshu on 27/07/17.
 */
public class DeleteOperationOfTwoStrings {
    public class Solution {
        int cache[][];
        public int minDistance(String word1, String word2) {
            cache = new int[word1.length()+1][word2.length()+1];
            for(int a[]:cache)
                Arrays.fill(a,-1);
            int l = lcs(word1.length()-1,word2.length()-1,word1,word2);
            return word1.length()+word2.length()-(2*l);
        }
        int lcs(int i,int j,String s1,String s2){
            if(i<0||j<0)
                return 0;
            if(cache[i][j]!=-1)
                return cache[i][j];
            if(s1.charAt(i)==s2.charAt(j))
                return cache[i][j]=1+lcs(i-1,j-1,s1,s2);
            else return cache[i][j]=Math.max(lcs(i-1,j,s1,s2),lcs(i,j-1,s1,s2));

        }
    }
}
