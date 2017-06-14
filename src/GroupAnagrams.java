import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by anshu on 14/06/17.
 */
public class GroupAnagrams {
    List<List<String>> finalList = new ArrayList<>();
    class word{
        int index;
        String word;
        public word(int index,String word){
            this.index = index;
            this.word = word;
        }
        public String toString(){
            return index+" "+word+" ";
        }

    }
    public List<List<String>> groupAnagrams(String[] strs) {
        // String[] words = new String[strs.length];
        // int[] indices = new int[strs.length];
        word[] words = new word[strs.length];
        for(int i=0;i<strs.length;i++){
            words[i]= new word(i,strs[i]);
        }
        for(int i=0;i<strs.length;i++){
            String word = words[i].word;
            char[] arr = word.toCharArray();
            Arrays.sort(arr);
            words[i].word=new String(arr);
        }
        // System.out.println(Arrays.toString(words));
        Arrays.sort(words, new Comparator<word>() {
            @Override
            public int compare(word w1,word w2) {
                return w1.word.compareTo(w2.word);
            }
        });
        // System.out.println(Arrays.toString(words));
        for(int i=0;i<strs.length;){
            String aux = words[i].word;
            List<String> lis = new ArrayList<>();
            lis.add(strs[words[i].index]);
            int j=i+1;
            while(j<strs.length&&words[j].word.equals(aux)){
                lis.add(strs[words[j].index]);
                j++;
            }
            i=j;
            finalList.add(lis);
        }
        return finalList;

    }
}
