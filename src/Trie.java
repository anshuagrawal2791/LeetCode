import java.util.HashMap;

/**
 * Created by anshu on 30/07/17.
 */
    public class Trie {

        /** Initialize your data structure here. */
        static class Node{
            HashMap<Character, Node> map;
            boolean isEnd;
            public Node(){
                map = new HashMap<>();
                isEnd=false;
            }
        }

        Node root;
        public Trie() {
            root = new Node();
        }

        /** Inserts a word into the trie. */
        public void insert(String word) {
            Node x = root;
            int i=0;
            for(i=0;i<word.length();i++){
                if(x.map.containsKey(word.charAt(i))){
                    x=x.map.get(word.charAt(i));
                }else{
                    Node y = new Node();
                    x.map.put(word.charAt(i),y);
                    x=y;
                }
                // if(i==word.length()-1){
                //     x.isEnd=true;
                // }
            }
            x.isEnd=true;
        }

        /** Returns if the word is in the trie. */
        public boolean search(String word) {
            int i;
            Node x = root;
            for(i=0;i<word.length();i++){
                if(!x.map.containsKey(word.charAt(i))){
                    return false;
                }
                x=x.map.get(word.charAt(i));
            }
            if(x.isEnd)
                return true;
            return false;
        }

        /** Returns if there is any word in the trie that starts with the given prefix. */
        public boolean startsWith(String prefix) {
            int i;
            Node x = root;
            for(i=0;i<prefix.length();i++){
                if(!x.map.containsKey(prefix.charAt(i))){
                    return false;
                }
                x=x.map.get(prefix.charAt(i));
            }
            return true;
        }
    }

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */

