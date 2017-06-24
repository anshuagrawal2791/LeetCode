/**
 * Created by anshu on 24/06/17.
 */
public class SortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n = nums.length;

        return build(nums,0,nums.length-1);
    }
    TreeNode build(int[] a,int start,int end){
        if(end<start)
            return null;
        int mid = (start+end)/2;
        TreeNode node = new TreeNode(a[mid]);
        node.left=build(a,start,mid-1);
        node.right = build(a,mid+1,end);
        return node;
    }
}
