package learn.dsa.LinkedList;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AddTwoNumbers {


    public static void main(String[] args) {
        DllNode head1 =  new DllNode(9);
        head1.nextNode(new DllNode(9)).nextNode(new DllNode(9)).nextNode(new DllNode(9)
        ).nextNode(new DllNode(9)).nextNode(new DllNode(9)).nextNode(new DllNode(9));
        DllNode head2 =
                new DllNode(9);
        head2.nextNode(new DllNode(9)).nextNode(new DllNode(9)).nextNode(new DllNode(9));
        DllNode resultHead = new AddTwoNumbers().addNumbersRecursively(head1, head2);
        while (resultHead != null) {
            System.out.println(resultHead.val);
            resultHead = resultHead.next;
        }
    }

        public DllNode addNumbersRecursively(DllNode head1, DllNode head2){
            int carry = 0;
            int currentVal = 0;
            DllNode temp = new DllNode(-1);
            DllNode curr = temp;
//            while ((head1 != null && head1.next != null) || (head2 != null && head2.next != null)){
//                carry = addNumbersRecursively(head1.next != null ? head1.next: head1,
//                        head2.next != null ? head2.next: head2);
//            }
//            if(head1 != null && head2 != null){
//                System.out.println(head1.val + head2.val + carry);
//            }
//            if((head1 != null && head1.next != null) || (head2 != null && head2.next != null)) {
//                carry = addNumbersRecursively(head1.next != null ? head1.next : head1,
//                        head2.next != null ? head2.next : head2);
//            }
//            currentVal = head1.val + head2.val + carry;
//            carry = currentVal / 10;
//            System.out.println(currentVal % 10);
//            return carry;

            while(head1 != null || head2 != null){
                int newNodeValue = 0;
                if(head1 != null && head2 != null){
                    newNodeValue = (head1.val + head2.val + carry) % 10;
                    carry = (head1.val + head2.val + carry) / 10;
                }
                else if(head1 == null && head2 != null){
                    newNodeValue = (head2.val + carry) % 10;
                    carry = (head2.val + carry) / 10;
                }
                else if(head1 != null && head2 == null){
                    newNodeValue = (head1.val + carry) % 10;
                    carry = (head1.val + carry) / 10;
                }

                curr.next = new DllNode(newNodeValue);
                curr = curr.next;
                if(head1 != null) {
                    head1 = head1.next;
                }
                if(head2 != null) {
                    head2 = head2.next;
                }
            }
            curr.next = new DllNode(carry);
            return temp.next;
        }
}
