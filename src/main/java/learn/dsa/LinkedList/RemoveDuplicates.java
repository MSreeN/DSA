package learn.dsa.LinkedList;

public class RemoveDuplicates {
    public static void main(String[] args) {
        DllNode head = new DllNode(1);
        head.next = new DllNode(1);
        head.next.next = new DllNode(2);
//        if (head == null || head.next == null) return head;
        DllNode curr = head;
        while (curr.next != null) {
            if (curr.val == curr.next.val) curr.next = curr.next.next;
            curr = curr.next;
        }
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
//        return head;
    }
}
