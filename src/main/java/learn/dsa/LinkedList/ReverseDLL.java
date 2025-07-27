package learn.dsa.LinkedList;

public class ReverseDLL {
    public static void main(String[] args) {
        DllNode head = new DllNode(10);
        DllNode second = new DllNode(20);
        head.next =second;
        second.prev = head;
        second.next = new DllNode(30);
        second.next.prev = second;
        second.next.next = new DllNode(40);
        second.next.next.prev = second.next;
        DllNode node = head;
        while(node != null){
            System.out.println(node.val);
            node = node.next;
        }
        System.out.println("------------");
//        reverse(head);
        DllNode headAfterReversal = reverseSingleLinkedList(head);
        DllNode node2 = head;
        while (headAfterReversal != null){
            System.out.println(headAfterReversal.val);
            headAfterReversal = headAfterReversal.next;
        }
        System.out.println("---------------------");
    }

    private static void reverse(DllNode head){
        while(head != null){
         DllNode prev = head.prev;
         head.prev = head.next;
         head.next = head.prev;
         head = head.next;
        }
    }

    private static DllNode reverseSingleLinkedList(DllNode head) {
        DllNode prev = null;
        DllNode curr = head;
        DllNode next = curr;

        while(curr != null){
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
