package learn.dsa.LinkedList;

public class RotateList {

    public static void main(String[] args) {
        DllNode node1 = new DllNode(1);
//        node1.nextNode(new DllNode(2)).nextNode(new DllNode(3)).nextNode(new DllNode(4))
//                .nextNode(new DllNode(5));
        node1.nextNode(new DllNode(2));
        rotate(node1, 1);
    }

    public static DllNode rotate(DllNode head, int k){
        if (head == null) return null;
        DllNode tailNode = head;
        DllNode headNode1 = head;
        int length = 1;

        while (tailNode.next != null) {
            length++;
            tailNode = tailNode.next;
        }
        if (length == 0) return null;

        int newTailIndex = k % length;

        for (int i = 1; i < length - newTailIndex - 1; i++) {
            headNode1 = headNode1.next;
        }

        tailNode.next = head;
        head = headNode1.next;
        headNode1.next = null;

        return head;

    }

    public static int findListLength(DllNode head){
        int length = 0;
        if(head == null) return length;

        while (head != null) {
            length++;
            head = head.next;
        }

        return length;
    }
}
