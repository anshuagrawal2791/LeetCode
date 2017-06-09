/**
 * Created by anshu on 09/06/17.
 */
public class SearchRange {
    public int[] searchRange(int[] a, int target) {
        int n = a.length;

        int l = 0;
        int h=n-1;
        int first;
        boolean flag=true;
        while(l<=h){
            int mid = (l+h)/2;
            if(a[mid]==target)
            {
                first=mid;
                int left = leftrange(a,l,first,target);
                int right = rightrange(a,first,h,target);
                if(a[right]==target)
                    return new int[]{left,right};
                else return new int[]{left,right-1};

            }
            if(target>a[mid]){
                l=mid+1;
            }else
                h=mid-1;
        }

        return new int[]{-1,-1};

    }
    int leftrange(int a[],int l,int h,int target){
        while(l<h){
            int mid =(l+h)/2;
            if(a[mid]==target)
                h=mid;
            else l=mid+1;
        }
        return l;
    }
    int rightrange(int a[],int l,int h,int target){
        while(l<h){
            int mid =(l+h)/2;
            if(a[mid]==target)
                l=mid+1;
            else h=mid;
        }
        return l;

    }
}
