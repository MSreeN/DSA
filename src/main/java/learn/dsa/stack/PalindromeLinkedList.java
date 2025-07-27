package learn.dsa.stack;

import learn.dsa.LinkedList.DllNode;

import java.util.LinkedList;
import java.util.Queue;

public class PalindromeLinkedList {
    public static void main(String[] args) {
    DllNode dllNode = new DllNode(3);
    DllNode dllNode1 = new DllNode(1);
    DllNode dllNode2 = new DllNode(6);
    DllNode dllNode3 = new DllNode(2);
//    DllNode dllNode4 = new DllNode(5);
    dllNode.next = dllNode1;
    dllNode1.next = dllNode2;
    dllNode2.next = dllNode3;
        dllNode3.nextNode(new DllNode(8)).nextNode(new DllNode(2)).nextNode(new DllNode(6))
                .nextNode(new DllNode(7)).nextNode(new DllNode(3));
//    dllNode3.next = dllNode4;
    palindromeLL(dllNode);
    }

    public static void palindromeLL(DllNode head){

        Queue<Integer> q = new LinkedList<>();

        //finding middle of linkedlist
        DllNode fp = head;
        DllNode sp = head;
        while(fp != null && fp.next != null){
            fp = fp.next.next;
            sp = sp.next;
        }

       DllNode secondHed = reverseLinkedList(sp);
        boolean result = isPalindrome(head, secondHed);
        System.out.println(result);
    }

    public static DllNode reverseLinkedList(DllNode head){
        DllNode prev = null;
        DllNode curr = head;
        DllNode next = head;

        while(curr != null){
            next = curr.next;
            curr.next  = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public static boolean isPalindrome(DllNode head1, DllNode head2){
        boolean isPalindrome = true;

        while(head2 != null){
            if(head1.val != head2.val) return false;
            head1 = head1.next;
            head2 = head2.next;
        }


        return isPalindrome;
    }

}
