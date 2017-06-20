/**
 * Created by anshu on 20/06/17.
 */
public class NumberDecoding {
    public int numDecodings(String s) {
        int n = s.length();
        int a[] = new int[n];
        if(n==0)
            return 0;
        if(n==1)
            return (s.charAt(0)!='0')?1:0;
        a[n-1]=(s.charAt(n-1)!='0')?1:0;

        int l = Integer.parseInt(s.substring(n-2));
        a[n-2]=(s.charAt(n-2)!='0')?a[n-1]:0;
        if(s.charAt(n-2)!='0'){
            if(l<=26)
            {
                a[n-2]+=1;
            }
        }
        for(int i=n-3;i>=0;i--){
            a[i]=(s.charAt(i)!='0')?a[i+1]:0;
            if(s.charAt(i)!='0'){
                int l2 = Integer.parseInt(s.substring(i,i+2));
                if(l2<=26)
                    a[i]+=a[i+2];
            }

        }
        // System.out.println(Arrays.toString(a));

        return a[0];

    }
}
