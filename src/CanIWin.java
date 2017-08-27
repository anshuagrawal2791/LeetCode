import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by anshu on 31/07/17.
 */
public class CanIWin {
    public class Solution {
        HashMap<String,Boolean> cache = new HashMap<>();
        public boolean canIWin(int maxChoosableInteger, int desiredTotal) {
            int a[] = new int[21];
            int n = maxChoosableInteger;

            if(((n)*(n+1)/2)<desiredTotal)
                return false;
            for(int i=1;i<=maxChoosableInteger;i++)
                a[i]++;
            if(desiredTotal<=0)
                return true;
            return canWin(a,0,desiredTotal);
        }
        boolean canWin(int a[],int cur,int max){
            // if(cur>=max)
            //     return true;
            String array = Arrays.toString(a);
            if(cache.containsKey(array))
                return cache.get(array);
            for(int i=1;i<21;i++){
                if(a[i]==1){
                    a[i]=0;
                    if(cur+i>=max||!canWin(a,cur+i,max)){
                        cache.put(array,true);
                        a[i]=1;
                        return true;
                    }
                    a[i]=1;
                }
            }
            cache.put(array,false);
            return false;
        }
    }
}
