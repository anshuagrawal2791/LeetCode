/**
 * Created by anshu on 29/06/17.
 */
public class SingleNumber2 {
    public int singleNumber(int[] nums) {
        int a =0;
        int b=0;
        for(int c:nums){
            int x=(a&~b&~c) |( ~a&b&c);
            b=(~a&~b&c)|( ~a&b&~c);
            a=x;
        }
        return a|b;
    }
}
