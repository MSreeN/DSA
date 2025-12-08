package learn.dsa.Tree;

public class ChildrenSumProperty {
    static int childSum = 0;

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
//        check(root);
    }

//    public static boolean check(TreeNode root){
//       if(root==null) return  true;
//    }


}
