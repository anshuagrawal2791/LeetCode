import java.util.Arrays;

/**
 * Created by anshu on 27/08/17.
 */
public class WildcardMatching {
    class Solution {
        int [][] cache;
        public boolean isMatch(String s, String p) {

            cache = new int[p.length()+1][s.length()+1];
            for(int a[]:cache)
                Arrays.fill(a,-1);
            return (check(p,s,0,0,p.length(),s.length())==1)?true:false;
        }
        int check(String p,String s,int i,int j,int m,int n){
            if(i==m&&j==n)
                return cache[i][j]=1;
            if(i==m)
                return cache[i][j]=0;
            if(j==n){
                int x = i;
                while(x<m&&p.charAt(x)=='*')
                    x++;
                if(x==m)
                    return cache[i][j]=1;
                return cache[i][j]=0;
            }
            if(cache[i][j]!=-1)
                return cache[i][j];
            if(p.charAt(i)=='?'||p.charAt(i)==s.charAt(j))
                return cache[i][j]=check(p,s,i+1,j+1,m,n);
            if(p.charAt(i)=='*'){
                if(i==m-1)
                    return cache[i][j]=1;
                int y = i;
                while(y<m&&p.charAt(y)=='*')
                    y++;
                if(y==m)
                    return cache[i][j]=1;
                int z=j;
                for(;z<n;z++){
                    if(check(p,s,y,z,m,n)==1)
                        return cache[i][j]=1;

                }
                return cache[i][j]=0;
            }
            return cache[i][j]=0;
        }
    }
}
