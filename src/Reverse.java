/**
 * Created by anshu on 06/06/17.
 */
public class Reverse {
    public int reverse(int x) {
        if (x<0){
            return reverse(-x,true);
        }
        else
            return reverse(x,false);
    }
    int reverse(int x, boolean wasNegative){
        double y=0;
        int z;
        z=x;
        while(z>0){
            System.out.println(y+"//"+z);
            if(y>Integer.MAX_VALUE||((10*y)+(z%10)>Integer.MAX_VALUE)){

                return 0;
            }
            y=(y*10)+(z%10);
            z/=10;

        }
        if(wasNegative){
            return (int)(-y);
        }
        else
            return (int)y;

    }
}
