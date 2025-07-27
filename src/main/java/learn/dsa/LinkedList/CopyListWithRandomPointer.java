package learn.dsa.LinkedList;

//A linked list of length n is given such that each node contains an additional random pointer, which could point to any node in the list, or null.
//
//Construct a deep copy of the list. The deep copy should consist of exactly n brand new nodes, where each new node has its value set to the value of its corresponding original node. Both the next and random pointer of the new nodes should point to new nodes in the copied list such that the pointers in the original list and copied list represent the same list state. None of the pointers in the new list should point to nodes in the original list.
//
//For example, if there are two nodes X and Y in the original list, where X.random --> Y, then for the corresponding two nodes x and y in the copied list, x.random --> y.

//https://leetcode.com/problems/copy-list-with-random-pointer/description/

class Node {
    public int val;
    public Node random;
    public Node next;

    public Node(int val) {
        this.val = val;
    }

    public Node nextNode(Node node) {
        this.next = node;
        return node;
    }
}


public class CopyListWithRandomPointer {

    public static void main(String[] args) {
        Node node7 = new Node(7);
        Node node13 = new Node(12);
        Node node11 = new Node(11);
        Node node10 = new Node(10);
        Node node1 = new Node(1);
        node7.next = node13;
        node13.next = node11;
        node13.random = node7;
        node11.next = node10;
        node11.random = node1;
        node10.next = node1;
        node10.random = node11;
        node1.random = node7;
        Node resultHead = deepCopy(node7);
    }

    public static Node deepCopy(Node head){
        Node originalHead = head;

        while (originalHead != null) {
            Node newNode = new Node(originalHead.val);
            newNode.next = originalHead.next;
            originalHead.next = newNode;
            originalHead = originalHead.next.next;
        }

        originalHead = head;

        while (originalHead != null) {
            if(originalHead.random != null) {
                originalHead.next.random = originalHead.random.next;
            }else{
                originalHead.next.random = null;
            }
            originalHead = originalHead.next.next;
        }

        Node dummyNode = new Node(-1);
        originalHead = head;
        Node res = dummyNode;

        while (originalHead != null) {
            res.next = originalHead.next;
            res = res.next;
            originalHead.next = res.next;

            originalHead = originalHead.next;
        }

        return dummyNode.next;

    }
}
