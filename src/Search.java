/**
 * Created by anshu on 09/06/17.
 */
public class Search {
    public int search(int[] a, int target) {
        int n = a.length;
        if(n==0)
            return -1;
        int l=0;
        int h=n-1;
        while(l<h){
            int mid = (l+h)/2;
            if(a[mid]>a[h])
                l=mid+1;
            else h=mid;
        }
        System.out.println(l+"");
        // return 0;
        int rot = l;
        l=0;
        h=n-1;
        // l=(target<a[h])?rot:0;
        // h=(target>a[l])?rot:n-1;
        if(target<=a[h]){
            l=rot;
        }else
            h=rot-1;
        while(l<=h){
            int actmid=(l+h)/2;
            // int actmid=(mid+rot)%n;
            if(target==a[actmid])
                return actmid;
            if(target>a[actmid]){
                l=actmid+1;
            }else{
                h=actmid-1;
            }
        }
        return -1;
    }
}
