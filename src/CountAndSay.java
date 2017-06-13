/**
 * Created by anshu on 13/06/17.
 */
public class CountAndSay {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            String newS = "";
            // System.out.println(s);
            for(int j=0;j<s.length();){
                char cur=s.charAt(j);
                int count=1;
                //
                int l=j+1;
                for(;l<s.length()&&s.charAt(l)==cur;l++)
                {
                    count++;

                }
                // System.out.println(count+"count");
                j=l;
                newS+=count+"";
                newS+=cur+"";
            }
            s= newS;
        }
        return s;
    }
}
