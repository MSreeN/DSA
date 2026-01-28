package learn.dsa.Tree;

import learn.dsa.streams.Employee;

import java.util.stream.IntStream;

public class LevelOrderPrintNodes {
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
        root.left.right = node5;
        root.left.left = node15;
        node15.left = node8;
        TreeNode node6 = new TreeNode(6);
        treeNode2.left = node6;
    }

    public static void levelOrder(TreeNode root) {
        if (root != null) {
            
        }
    }
}
