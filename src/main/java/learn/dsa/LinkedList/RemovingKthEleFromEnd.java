package learn.dsa.LinkedList;

public class RemovingKthEleFromEnd {
    public static void main(String[] args) {
        int n = 2;
        DllNode head = new DllNode(1);
        head.next = new DllNode(2);


        DllNode newLink = new DllNode(999);
        newLink.next = head;
        DllNode first = newLink;
        DllNode second = head;
        for (int i = 1; i < n; i++) {
            second = second.next;
        }

        while (second.next != null) {
            second = second.next;
            first = first.next;
        }
        if (first.next.next == null) first.next = null;
        else first.next = first.next.next;


        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }
}
