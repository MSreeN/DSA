package learn.dsa.Tree.BST;

import learn.dsa.Tree.TreeNode;

public class DeleteNodeBst {
    public static void main(String[] args) {
        TreeNode node5 = new TreeNode(5);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        TreeNode node7 = new TreeNode(7);
        TreeNode node2 = new TreeNode(2);


        node5.left = node3;
        node5.right = node6;
        node3.left = node2;
        node3.right = node4;
        node6.right = node7;

//        deleteNode(node5, 3);
        secondaryDeleteNode(node5, 3);
        inorderTraversal(node5);
    }


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
