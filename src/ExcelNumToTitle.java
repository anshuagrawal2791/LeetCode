/**
 * Created by anshu on 17/07/17.
 */
public class ExcelNumToTitle {
    public String convertToTitle(int n) {
        // n--;

        String ans = "";
        while(n>0){
            int a = n%26;
            // int a = n%26;
            if(a==0)
            {
                ans="Z"+ans;
                n/=26;
                n--;
                continue;
            }
            n/=26;
            ans=""+ (char)('a'+a-1)+ans;
        }
        return ans.toUpperCase();
    }
}
