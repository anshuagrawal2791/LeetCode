import java.util.ArrayList;
import java.util.TreeSet;

/**
 * Created by anshu on 16/06/17.
 */
public class KthPermutation {
    TreeSet<String> set = new TreeSet<>();
    public String getPermutation(int n, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=1;i<=n;i++)
            list.add(i);
        k--;
        n--;
        ArrayList<Character> res = new ArrayList<>();
        while(n>=0){
            int index = k/fact(n);
            int aux=list.get(index);
            list.remove(index);
            res.add(Integer.toString(aux).charAt(0));
            k%=fact(n);
            n--;
        }
        // res.add(Integer.toString(list.get(0)).charAt(0));
        // System.out.println(res.toString());
        StringBuilder builder = new StringBuilder(res.size());
        for(Character ch: res)
        {
            builder.append(ch);
        }
        return builder.toString();
        // return "new String(res)";
    }
    int fact(int n){
        if(n==0)
            return 1;
        else return n*fact(n-1);
    }
    void permute(char a[], int i, int n){
        if(i==n){
            set.add(new String(a));
        }else{
            for(int k=i;k<=n;k++){
                // permute(a,i,k);
                char temp = a[i];
                a[i]=a[k];
                a[k]=temp;
                permute(a,i+1,n);
                temp = a[i];
                a[i]=a[k];
                a[k]=temp;

            }
        }
    }
}
