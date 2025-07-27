package learn.dsa.Tree;

public class MaximumInBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        TreeNode treeNode = new TreeNode(30);
        root.right = treeNode;
        TreeNode treeNode1 = new TreeNode(40);
        treeNode.left = treeNode1;
        TreeNode treeNode2 = new TreeNode(50);
//        treeNode.right = treeNode2;
        TreeNode node5 = new TreeNode(5);
        TreeNode node15 = new TreeNode(15);
        TreeNode node8 = new TreeNode(8);
        root.left.right = node5;
        root.left.left = node15;
        node15.left = node8;
        System.out.println(max(root));
    }

    public static int max(TreeNode node){
        if(node == null) return 0;
        else{
        return Math.max(Math.max(max(node.left), max(node.right)), node.value);
        }
//        return max;
    }
}
