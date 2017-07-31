/**
 * Created by anshu on 25/07/17.
 */
public class DecodeString {
    public class Solution {
        public String decodeString(String s) {
            return decode(s);
        }
        String decode(String s){
            // System.out.println(s);
            if(s.equals("")||s.indexOf("[")==-1)
                return s;
            String a="";
            for(int k=0;k<s.length();k++){
                String x = "";
                int i;
                for(i=k;i<s.length();i++){
                    if(Character.isDigit(s.charAt(i)))
                        break;
                    x=x+""+s.charAt(i);
                }
                int num=0;
                if(i<s.length()){
                    // num = s.charAt(i++)-'0';
                    String number="";
                    while(i<s.length()&&Character.isDigit(s.charAt(i)))
                        number=number+""+s.charAt(i++);
                    num=Integer.parseInt(number);
                }
                int l=-1;
                String y="";
                int j;
                for(j=i+1;j<s.length();j++){

                    if(s.charAt(j)=='[')
                        l--;
                    else if(s.charAt(j)==']')
                        l++;
                    if(l!=0)
                        y=y+""+s.charAt(j);
                    else
                        break;
                }
                a = a+x;
                String decoded = decode(y);
                for(int times=0;times<num;times++)
                    a=a+decoded;
                k=j;
            }
            return a;

        }
    }
}
