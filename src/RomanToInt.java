/**
 * Created by anshu on 08/06/17.
 */
public class RomanToInt {
    public int romanToInt(String s) {
        int nums[] = new int[]{1,4,5,9,10,40,50,90,100,400,500,900,1000};
        String roms[] = new String[]{"I","IV","V","IX","X","XL","L","XC","C","CD","D","CM","M"};
        int n = s.length();
        int ans=0;
        for(int i=12,j=0;i>=0&&j<n;){
            if(roms[i].equals(s.substring(j,j+1))){
                j++;
                ans+=nums[i];
            }
            else if(j<n-1){
                if(roms[i].equals(s.substring(j,j+2)))
                {j+=2;
                    ans+=nums[i];}
                else i--;
            }else
            {
                i--;
            }
        }
        return ans;

    }
}
