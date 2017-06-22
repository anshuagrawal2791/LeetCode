import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * Created by anshu on 23/06/17.
 */
public class RestoreIPs {
    HashSet<String> finalList = new HashSet<>();
    public List<String> restoreIpAddresses(String s) {
        if((s.length()/4)>3)
            return new ArrayList<String>();

        checkIP(s.length()-1,3,"",s);
        return new ArrayList<String>(finalList);

    }
    void checkIP(int i,int dots,String postfix,String s){
        System.out.println(i+" "+dots+" "+postfix+" "+s);
        String y = s.substring(0,i+1);
        if(dots==0&&!y.equals("")&&Integer.parseInt(y)<=255){
            if(y.length()>1&&y.charAt(0)=='0')
                return;
            finalList.add(y+postfix);
            return;
        }
        if(i<0||dots<0||((i+1)/(dots+1)>3))
            return;

        for(int k=2;k>=0;k--){
            System.out.println("      "+i+" "+k);
            if(i-k>=0){
                String x = s.substring(i-k,i+1);
                if(Integer.parseInt(x)<=255){
                    if(x.length()>1&&x.charAt(0)=='0')
                        continue;
                    String po = "."+x+postfix;
                    checkIP(i-k-1,dots-1,po,s);

                }
            }
        }
    }
}
