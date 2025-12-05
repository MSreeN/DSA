package learn.dsa.Tree;

public class ChildrenSumProperty {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node11 = new TreeNode(1);
        TreeNode node22 = new TreeNode(2);
        root.left = node1;
        root.right = node2;
        node2.left = node11;
        node2.right = node22;
        check(root);
    }

    public static int check(TreeNode root){
        int childSum=0;
        if(root == null) return 0;
        else{
            if(root.left == null && root.right == null) childSum = root.value;
            else{
                childSum += check(root.left);
                childSum += check(root.right);
            }
        }
        return childSum;
    }


}
