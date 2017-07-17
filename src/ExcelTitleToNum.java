/**
 * Created by anshu on 17/07/17.
 */
public class ExcelTitleToNum {
    public int titleToNumber(String s) {
        double ans =0;
        int n = s.length();
        for(int i=0;i<s.length();i++){
            if(i==0){
                ans+=26*((Math.pow(26,n-i-1)-1)/25);
            }

            int a = s.charAt(i)-'A';
            // System.out.println(a+"");
            // if(i==0)
            ans+=Math.pow(26,n-i-1)*(a);
            // System.out.println(ans+"ans");
        }
        return (int)ans+1;
    }
}
