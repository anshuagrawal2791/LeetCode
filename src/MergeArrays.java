/**
 * Created by anshu on 20/06/17.
 */
public class MergeArrays {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int nums3[] = new int[m+n];
        int counter =m+n-1;
        m--;
        n--;
        while(m>=0&&n>=0){
            if(nums1[m]>nums2[n]){
                nums3[counter--]=nums1[m--];
            }else{
                nums3[counter--]=nums2[n--];
            }
        }
        while(m>=0){
            nums3[counter--]=nums1[m--];

        }
        while(n>=0)
            nums3[counter--]=nums2[n--];
        // System.out.println(Arrays.toString(nums3));
        for(int i=0;i<nums3.length;i++)
            nums1[i]=nums3[i];
    }
}
