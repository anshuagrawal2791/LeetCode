/**
 * Created by anshu on 18/07/17.
 */
public class MinimumWindowSubstring {
    public class Solution {
        public String minWindow(String s, String t) {
            int need[] = new int[58];
            int have[] = new int[58];
            for(int i=0;i<t.length();i++){
                need[t.charAt(i)-'A']++;
            }
            int i=-1,j=0;
            int global=Integer.MAX_VALUE;
            int start = i;
            int end=j;
            // System.out.println(Arrays.toString(need));
            while(i<s.length()&&j<=s.length()){
                // System.out.println(i+"--"+j);
                //     System.out.println(Arrays.toString(have));


                if(isSatisfied(need,have)){
                    // global=Math.min(global,j-1);


                    i++;
                    have[s.charAt(i)-'A']--;
                    if((j-i)<=global){
                        global = j-i;
                        start = i;
                        end=j;
                    }
                }
                else{
                    if(j<s.length()){
                        have[s.charAt(j)-'A']++;
                        j++;
                    }else
                        break;


                }
            }
            //     System.out.println(i+" "+j);
            // System.out.println(Arrays.toString(have));


            if(i==-1){
                return "";
            }
            String a = "";
            for(int ii=start;ii<end;ii++){
                a+=s.charAt(ii);
            }
            return a;
        }
        boolean isSatisfied(int a[],int b[]){
            for(int i=0;i<58;i++){
                if(a[i]>b[i])
                    return false;
            }
            return true;
        }
    }
}
