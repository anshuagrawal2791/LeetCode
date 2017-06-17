import java.util.Arrays;

/**
 * Created by anshu on 18/06/17.
 */
public class EditDistance {

        int cache[][];
        public int minDistance(String word1, String word2) {
            cache = new int[word1.length()][word2.length()];
            for(int a[]: cache){
                Arrays.fill(a,-1);
            }
            return min(word1,word2,word1.length()-1,word2.length()-1);
        }
        int min(String w1, String w2, int i, int j){
            if(i<0&&j<0)
                return 0;
            if(i<0)
                return j+1;
            if(j<0)
                return i+1;
            if(cache[i][j]!=-1)
                return cache[i][j];
            if(w1.charAt(i)==w2.charAt(j))
                return cache[i][j]=min(w1,w2,i-1,j-1);
            return cache[i][j]=1+Math.min(Math.min(min(w1,w2,i-1,j),min(w1,w2,i,j-1)),min(w1,w2,i-1,j-1));
        }

}
