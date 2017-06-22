import java.util.Arrays;

/**
 * Created by anshu on 23/06/17.
 */
public class InterleavedStrings {
    int cache[][];
    public boolean isInterleave(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();
        int c = s3.length();
        if(a+b!=c)
            return false;
        cache = new int[a+1][b+1];
        for(int x[]:cache)
            Arrays.fill(x,-1);

        return (check(s1,s2,s3,s1.length()-1,s2.length()-1,s3.length()-1)==0)?false:true;
    }
    int check(String s1,String s2,String s3,int i,int j,int k){
        // System.out.println(i+" "+j+" "+k);
        if(cache[i+1][j+1]!=-1)
            return cache[i+1][j+1];
        if(i+1+j+1!=k+1)
            return cache[i+1][j+1]=0;
        if(k<0){
            if(i<0&&j<0)
                return  cache[i+1][j+1]=1;
            return  cache[i+1][j+1]=0;
        }
        if(i<0&&j<0)
            return  cache[i+1][j+1]=0;
        if(i>=0&&j>=0&&s3.charAt(k)==s1.charAt(i)&&s3.charAt(k)==s2.charAt(j)){
            return  cache[i+1][j+1]=(check(s1,s2,s3,i-1,j,k-1)==1||check(s1,s2,s3,i,j-1,k-1)==1)?1:0;
        }
        if(i>=0&&s3.charAt(k)==s1.charAt(i))
            return cache[i+1][j+1]=check(s1,s2,s3,i-1,j,k-1);
        if(j>=0&&s3.charAt(k)==s2.charAt(j))
            return  cache[i+1][j+1]=check(s1,s2,s3,i,j-1,k-1);
        return  cache[i+1][j+1]=0;
    }
}
