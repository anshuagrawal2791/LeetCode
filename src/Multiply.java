/**
 * Created by anshu on 14/06/17.
 */
public class Multiply {
    public String multiply(String num1, String num2) {
        int l1=num1.length();
        int l2 = num2.length();
        if(l1==0&&l2==0)
            return "0";
        int i1=0;
        int i2=0;
        int a[] =new int [l1+l2];
        for(int i=l1-1;i>=0;i--){
            i2=0;
            int carry=0;
            int n1= num1.charAt(i)-'0';
            for(int j=l2-1;j>=0;j--){
                int n2= num2.charAt(j)-'0';
                int sum=n1*n2 + a[i1+i2]+carry;
                carry=sum/10;
                sum%=10;
                a[i1+i2]=sum;
                i2++;

            }
            if(carry>0)
                a[i1+i2]+=carry;

            i1++;
            //   System.out.println(Arrays.toString(a));
        }
        int i = a.length-1;
        for(i=a.length-1;i>=0&&a[i]==0;i--);
        if(i==-1)
            return "0";
        String s="";
        for(int j=i;j>=0;j--)
            s+=a[j]+"";
        return s;

    }
}
