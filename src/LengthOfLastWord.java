/**
 * Created by anshu on 16/06/17.
 */
public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        char[] a = s.toCharArray();
        int n = a.length;
        int count=0;
        int i=n-1;
        while(i>=0&&a[i]==' ')
            i--;
        for(;i>=0&&a[i]!=' ';count++,i--);
        return count;
    }
}
