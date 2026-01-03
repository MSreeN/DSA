package learn.dsa.Tree.BST;

import learn.dsa.Tree.TreeNode;

public class FloorBST {
    static int floor = -1;
    public static void main(String[] args) {
        TreeNode node15 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node5 = new TreeNode(5);
        TreeNode node20 = new TreeNode(20);
        TreeNode node18 = new TreeNode(18);
        TreeNode node16 = new TreeNode(16);
        TreeNode node80 = new TreeNode(80);
        TreeNode node9 = new TreeNode(3);


        node15.left = node5;
        node5.left = node3;
        node5.right = node9;
        node15.right = node20;
        node20.left = node18;
        node18.left = node16;
        node20.right = node80;

        int res = findFloor(node15, 0);
        System.out.println(res);
    }

    public static Integer findFloor(TreeNode root, int val){
        if(root == null) return null;
        if(root.value == val) floor = root.value;
        if(root.value < val){
            floor = root.value;
            findFloor(root.right, val);
        }
        if(root.value > val){
            findFloor(root.left, val);
        }
        return floor;
    }
}
