package learn.dsa.Tree;

import java.util.ArrayList;
import java.util.List;

public class SideViewOfTree {
    static int level=0;
    static ArrayList<Integer> res = new ArrayList<>();
    static int maxLevel=0;
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

        leftView(root, 1);
        System.out.println("-------------");
        for(int i: rightSideView(root)){
            System.out.println(i);
        }
    }

    public static void leftView(TreeNode root, int level){
        if(root==null)return;
        if (maxLevel < level) {
            System.out.println(root.value);
            maxLevel=level;
        }
        leftView(root.left, level+1);
        leftView(root.right, level+1);
    }

    public static List<Integer> rightSideView(TreeNode root) {
        if (root == null) return null;
        if (level != res.size()) {
            res.add(root.value);
        }
        level++;
        rightSideView(root.right);
        rightSideView(root.left);
        return res;
    }

}
