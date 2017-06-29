/**
 * Created by anshu on 29/06/17.
 */
public class IsStringPalindrome {
    public boolean isPalindrome(String s) {
        int n = s.length();
        int i=0;
        int j = n-1;
        while(i<j){
            char a = s.charAt(i);
            char b = s.charAt(j);
            if(!Character.isLetterOrDigit(a))
            {
                i++;

            }else if(!Character.isLetterOrDigit(b)){
                j--;
            }else if(Character.toLowerCase(a)==Character.toLowerCase(b)){
                i++;
                j--;
            }else
                break;
        }
        if(i>=j)
            return true;
        return false;
    }
}
