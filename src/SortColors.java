/**
 * Created by anshu on 18/06/17.
 */
public class SortColors {
    public void sortColors(int[] nums) {
        int a[] = new int[3];
        for(int i=0;i<nums.length;i++)
            a[nums[i]]++;
        int counter=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<a[i];j++)
                nums[counter++]=i;
        }
    }
}
