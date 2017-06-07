import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by anshu on 08/06/17.
 */
public class LetterCombinationOfPhoneNumber {
    HashMap<Character,char[]> map;
    List<String> finalList = new ArrayList<>();
    public List<String> letterCombinations(String digits) {
        map = new HashMap<>();
        map.put('2',new char[]{'a','b','c'});
        map.put('3',new char[]{'d','e','f'});
        map.put('4',new char[]{'g','h','i'});
        map.put('5',new char[]{'j','k','l'});
        map.put('6',new char[]{'m','n','o'});
        map.put('7',new char[]{'p','q','r','s'});
        map.put('8',new char[]{'t','u','v'});
        map.put('9',new char[]{'w','x','y','z'});
        if(!digits.equals(""))
            combine(digits.toCharArray(),0,digits.length(),"");


        return finalList;
    }
    void combine(char[] a,int i,int n,String pre){
        if(i==n){
            finalList.add(pre);
            return;
        }
        char s = a[i];
        char[] values = map.get(s);
        for(int j=0;j<values.length;j++){
            String l = pre+values[j];
            combine(a,i+1,n,l);
        }
    }
}
