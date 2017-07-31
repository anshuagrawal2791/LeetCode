/**
 * Created by anshu on 26/07/17.
 */
public class BSTtoGreaterTree {
    /**
     * Definition for a binary tree node.
     * public class TreeNode {
     *     int val;
     *     TreeNode left;
     *     TreeNode right;
     *     TreeNode(int x) { val = x; }
     * }
     */
    public class Solution {
        TreeNode cur;
        TreeNode cur2;
        int sum=0;
        public TreeNode convertBST(TreeNode root) {
            if(root==null)
                return root;
            return check3(root);
        }
//     TreeNode check(TreeNode root){
//         // if(root==null)
//         //     return root;
//         // root.val += sum(root.right);
//         // root.right=check(root.right);
//         // root.left=check(root.left);
//         // return root;
//         if(root==null)
//             return root;
//         if(root.left==null&&root.right==null){
//             root.val+=cur;
//             cur=root.val;
//             return root;
//         }
//         if(root.right!=null){
//             root.right=check(root.right);
//             root.val+=cur;
//             cur=root.val;
//         }
//         if(root.left!=null){
//             root.left.val+=root.val;
//             cur=root.left.val;
//             root.left=check(root.left);

//         }

//         return root;
//     }
//     TreeNode check2(TreeNode root){

//         if(root==null)
//             return root;
//         // cur=root;
//         check2(root.right);
//         // cur=root;
//         root.val+=(cur!=null)?cur.val:0;
//         cur=null;
//         if(root.left!=null)
//             root.left.val+=root.val;
//         check2(root.left);
//         cur=root;

        //         return root;
//     }
        TreeNode check3(TreeNode root){
            if(root==null)
                return root;
            check3(root.right);
            root.val+=sum;
            sum=root.val;
            check3(root.left);
            // sum+=root.val;
            return root;
        }
        int sum(TreeNode root){
            if(root==null)
                return 0;
            return root.val+sum(root.left)+sum(root.right);
        }
    }
}
