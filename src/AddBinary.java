/**
 * Created by anshu on 18/06/17.
 */
public class AddBinary {

        public String addBinary(String a, String b) {
            int al = a.length();
            int bl = b.length();
            String small = (al<bl)?a:b;
            String big = (small.equals(a))?b:a;
            int n = big.length();
            int diff = big.length()-small.length();
            for(int i=0;i<diff;i++)
                small="0"+small;

            char res[] = new char[n+1];
            int carry=0;
            for(int i=n-1;i>=0;i--){
                int x1 = small.charAt(i)-'0';
                int x2 = big.charAt(i)-'0';
                int x = x1+x2+carry;
                res[i+1]=Integer.toString(x%2).charAt(0);
                carry = x/2;
                // System.out.println(x1+" "+x2+" "+x+" "+carry);
            }
            if(carry>0){
                res[0]='1';
                return new String(res);
            }
            // System.out.println("here");
            char resb[] = new char[n];
            System.arraycopy( res, 1, resb, 0, n );
            return new String(resb);

        }

}
