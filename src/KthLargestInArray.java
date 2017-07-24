/**
 * Created by anshu on 20/07/17.
 */
public class KthLargestInArray {
    public class Solution {
        public int findKthLargest(int[] nums, int k) {
            int n = nums.length;
            k=n-k+1;
            return quickSelect(nums,0,n-1,k);
        }
        int quickSelect(int a[],int l,int r,int k){

            int pos = partition(a,l,r);
            int rank = pos-l+1;
            // System.out.println(pos+" "+rank);
            if(rank==k)
                return a[pos];
            else if(rank>k){
                return quickSelect(a,l,pos-1,k);
            }
            else
                return quickSelect(a,pos+1,r,k-rank);


        }

        int partition(int a[],int l,int r){
            int i=l;
            for(int j=l;j<r;j++){
                if(a[j]<=a[r]){
                    swap(a,i,j);
                    i++;
                }
            }
            swap(a,i,r);
            return i;
        }
        void swap(int a[],int i,int j){
            int temp = a[i];
            a[i]=a[j];
            a[j]=temp;
        }
    }
}
