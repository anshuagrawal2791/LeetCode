import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Created by anshu on 29/06/17.
 */
public class LadderLength {
    class node{
        int level;
        String val;
        public node(int x,String val){
            this.val=val;level=x;
        }
        public String toString(){
            return "level: "+level+" val: "+val;
        }

    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        node start = new node(1,beginWord);
        HashSet<String> visited = new HashSet<>();
        HashSet<String> dict = new HashSet<>(wordList);
        Queue<node> q = new LinkedList<>();
        q.add(start);
        visited.add(beginWord);
        int wordlen = beginWord.length();
        while(!q.isEmpty()){
            // System.out.println(q.toString());
            node cur = q.poll();
            if(cur.val.equals(endWord)){
                return cur.level;
            }
            for(int i=0;i<wordlen;i++){
                for(char ch = 'a'; ch <= 'z'; ++ch)// fills alphabet array with the alphabet
                {
                    String newString = cur.val.substring(0,i)+ch+cur.val.substring(i+1);
                    if(!visited.contains(newString)&&dict.contains(newString))
                    {
                        q.add(new node(cur.level+1,newString));
                        visited.add(newString);
                    }
                }
            }
        }
        return 0;
    }
}
