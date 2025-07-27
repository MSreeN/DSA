package learn.dsa.LinkedList;

public class DllNode {
    public int val;
    public DllNode prev;
    public DllNode next;

    public DllNode(int val){this.val = val;}

    public DllNode nextNode(DllNode node){
        this.next = node;
        return node;
    }
}
