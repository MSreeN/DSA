package learn.dsa.Tree;

public class CheckForBalancedTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        TreeNode treeNode = new TreeNode(30);
        root.right = treeNode;
        TreeNode treeNode1 = new TreeNode(40);
        treeNode.left = treeNode1;
        TreeNode treeNode2 = new TreeNode(50);
        treeNode.right = treeNode2;
        TreeNode node5 = new TreeNode(5);
        TreeNode node15 = new TreeNode(15);
        TreeNode node8 = new TreeNode(8);
        node8.left = new TreeNode(50);
        root.left.right = node5;
        root.left.left = node15;
        node15.left = node8;
        int res = checkBST(root);
        if(res > 1) {
            System.out.println("false");
        }else{
            System.out.println(true);
        }
    }

    public static int check(TreeNode node){
        int leftHeight = 1;
        int rightHeight = 1;
        if(node == null) return  0;
        else{
             leftHeight += check(node.left);
             if(leftHeight > 1) return -1;
             rightHeight += check(node.right);
             if(rightHeight > 1) return -1;
//            return Math.max(leftHeight, rightHeight);
            int remaining  = Math.abs(leftHeight - rightHeight);
//            return remaining;
            if(remaining > 1) return -1;
            else return Math.max(leftHeight, rightHeight);
        }
    }

    public static int checkBST(TreeNode root){
        int leftHeight = 1;
        int rightHeight = 1;
        int remaining;
        if(root == null) return 0;
        else{
            leftHeight += checkBST(root.left);
            if(leftHeight > 1) return -1;

            rightHeight += checkBST(root.right);
            if(rightHeight > 1) return -1;

            remaining = Math.abs(leftHeight - rightHeight);

            if(remaining > 1) return -1;
            else if (remaining == 0 ) return 0;

            else return Math.max(leftHeight, rightHeight);
        }
    }
}
