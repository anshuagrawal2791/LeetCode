/**
 * Created by anshu on 17/06/17.
 */
public class PlusOne {
    public class Solution {
        public int[] plusOne(int[] digits) {
            int n =digits.length;
            int a[] = new int[n+1];
            int carry=0;
            for(int i=n-1;i>=0;i--){
                if(i==n-1){
                    int x =digits[i]+1;
                    carry=x/10;
                    a[i+1]=x%10;
                }else{
                    int x= digits[i]+carry;
                    a[i+1]=x%10;
                    carry=x/10;
                }
            }
            // System.out.println(Arrays.toString(a));
            if(carry>0){
                a[0]=carry;
                return a;
            }


            int i=0;
            while(a[i]==0)
                i++;
            int b[] = new int[n];
            System.arraycopy( a, i, b, 0, n );
            return b;
        }
    }
}
