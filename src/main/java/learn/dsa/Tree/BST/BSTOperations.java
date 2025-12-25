package learn.dsa.Tree.BST;

import learn.dsa.Tree.TreeNode;

public class BSTOperations {
    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node20 = new TreeNode(20);
        TreeNode node18 = new TreeNode(18);
        TreeNode node16 = new TreeNode(16);
        TreeNode node80 = new TreeNode(80);


        node15.left=node5;
        node5.left=node3;
        node15.right=node20;
        node20.left=node18;
        node18.left=node16;
        node20.right=node18;

//        deleteNode(node5, 3);
        secondaryDeleteNode(node5, 3);
        inorderTraversal(node5);
    }

//    public boolean search(TreeNode root, int val){
//        if(root==null) return false;
//        else{
//            if(root.value == val) return true;
//            else if(root.value < val) return search(root.right, val);
//            else if(root.value > val) return search(root.left, val);
//        }
//    }


    public static TreeNode secondaryDeleteNode(TreeNode root, int num){
        if(root == null) return null;
        if(num > root.value){
           root.right = secondaryDeleteNode(root.right, num);
        }
        if(num < root.value){
            root.left = secondaryDeleteNode(root.left, num);
        }
        if(root.value == num){
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                TreeNode leftNode = root.left;
                TreeNode rightNode = root.right;
                while(leftNode.right != null){
                    leftNode = leftNode.right;
                }
                leftNode.right = rightNode;
                return root.left;
            }
        }
        return root;
    }

    public static void inorderTraversal(TreeNode root){
        if(root == null) return;
        inorderTraversal(root.left);
        System.out.println(root.value + " ");
        inorderTraversal(root.right);
    }



    public static TreeNode deleteNode(TreeNode root, int x){
        if(root == null) return null;
        if(root.value > x){
             root.left = deleteNode(root.left, x);
        }
        else if(root.value < x){
            root.right = deleteNode(root.right, x);
        }
        else{
            if(root.left == null) return root.right;
            else if(root.right == null) return root.left;
            else{
                TreeNode toBeRoot = helper(root);
                return toBeRoot;
            }
        }
        return root;
    }

    public static TreeNode helper(TreeNode root){
        TreeNode rightNode = root.right;
        TreeNode leftNode = root.left;
        while(leftNode != null && leftNode.right != null){
            leftNode = leftNode.right;
        }
        leftNode.right = rightNode;
        return root.left;
    }
}
