/**
 * Created by anshu on 13/06/17.
 */
public class SearchInsert {
    public int searchInsert(int[] a, int target) {
        int l = 0;
        int h = a.length-1;
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]==target)
                return mid;
            if(a[mid]<target)
                l=mid+1;
            else h=mid-1;
        }
        return h+1;
    }
}
