/**
 * Created by anshu on 06/06/17.
 */
public class isPalindrome {
    public boolean isPalindrome(int x) {
        if(x<0||(x!=0&&x%10==0))
            return false;
        int rev=0;
        while(rev<x){
            rev=rev*10+x%10;
            x/=10;
        }
        if(rev==x||rev/10==x)
            return true;
        else return false;



    }
}
