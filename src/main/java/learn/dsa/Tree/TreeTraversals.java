package learn.dsa.Tree;

import java.util.HashMap;

public class TreeTraversals {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(10);
        root.left = new TreeNode(20);
        TreeNode treeNode = new TreeNode(30);
        root.right = treeNode;
        TreeNode treeNode1 = new TreeNode(40);
        treeNode.left = treeNode1;
        TreeNode treeNode2 = new TreeNode(50);
        treeNode.right = treeNode2;

        inorderTraversal(root);
//        preorderTraversal(root);
//        postOrderTraversal(root);
    }

    public static void inorderTraversal(TreeNode root){
//        TreeNode root1 = root;
//        while(root1.left.left != null){
//            root1 = root1.left;
//        }
        if(root != null) {
            inorderTraversal(root.left);
//        if(root != null){
            System.out.println(root.value);
//        }
            inorderTraversal(root.right);
        }
    }


    public static void preorderTraversal(TreeNode root){
        if(root != null){
            System.out.println(root.value);
            preorderTraversal(root.left);
            preorderTraversal(root.right);
        }
    }


    public static void postOrderTraversal(TreeNode root){
        if(root != null){
            postOrderTraversal(root.left);
            postOrderTraversal(root.right);
            System.out.println(root.value);
        }

    }
}
