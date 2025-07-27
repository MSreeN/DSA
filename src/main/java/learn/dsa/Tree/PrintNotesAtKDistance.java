package learn.dsa.Tree;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

class PrintNotesAtKDistance {
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
//        printNodes(root, 2);
//        levelOrder(root);
        printNodesSecondary(root);
    }

    public static void printNodes(TreeNode root, int req){
        if(root == null) return;
        if(req == 0) {
            System.out.println(root.value);
            return;
        };
//        Math.max(printNodes(root.left, req - 1), printNodes(root.right, req - 1));
        printNodes(root.left, req - 1);
        printNodes(root.right, req - 1);
    }

    public static void levelOrder(TreeNode node){
        if(node == null) return;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);
        while(!queue.isEmpty()){
            node = queue.poll();
            if(node == null){
                System.out.println();
                queue.add(null);
                continue;
            }
            System.out.print(node.value + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }
//        System.out.println(node.value);
//        levelOrder(node.left);
//        System.out.println(node.value);
//        levelOrder(node.right);
    }

    public static void printNodesSecondary(TreeNode root){
    Queue<TreeNode> queue = new LinkedList<>();
    TreeNode node;
    queue.add(root);
    queue.add(null);
    while(!queue.isEmpty()){
        node = queue.poll();
        if(node != null){
            System.out.print(node.value + " ");
            if(node.left != null) queue.add(node.left);
            if(node.right != null) queue.add(node.right);
        }else{
            System.out.println();
            queue.add(null);
            if(queue.size() == 1) break;
        }
    }
    }
}
