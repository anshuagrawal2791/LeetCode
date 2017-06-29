import java.util.ArrayList;
import java.util.List;

/**
 * Created by anshu on 29/06/17.
 */
public class PartitionIntoPalins {
    List<List<String>> finalList = new ArrayList<>();
    public List<List<String>> partition(String s) {
        part(s,new ArrayList<String>());
        return finalList;
    }
    void part(String a,List<String> li){
        if(isPal(a)){
            List<String> li2 = new ArrayList<String>(li);
            li2.add(a);
            finalList.add(li2);
        }
        for(int i=1;i<a.length();i++)
        {
            String b = a.substring(0,i);
            if(isPal(b))
            {
                List<String> li2 = new ArrayList<String>(li);
                li2.add(b);
                part(a.substring(i),li2);
            }
        }
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
    }
}
