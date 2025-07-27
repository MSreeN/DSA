package learn.dsa.LinkedList;
//Find the gcd of adjacent nodes and find their gcd and insert that gcd between those nodes
//Input: head = [18,6,10,3]
//Output: [18,6,6,2,10,1,3]
public class InsertGreatestCommonDivisors {
    public static void main(String[] args) {
        DllNode head = new DllNode(18);
        head.next = new DllNode(6);
        head.next.next = new DllNode(10);
        head.next.next.next = new DllNode(3);
        insertGcd(head);
        while(head != null){
            System.out.println(head.val);
            head = head.next;
        }
    }

    public static void insertGcd(DllNode head){
        if( head == null || head.next == null) return;
        DllNode curr = head;
        DllNode temp;
        int nextVal = curr.next.val;
        while(curr.next  != null){
            temp = curr.next;
            int gcd = findGcd(curr.val, curr.next.val);
            curr.next = new DllNode(gcd);
            curr.next.next = temp;
            curr = curr.next.next;
        }
    }

    public static int findGcd(int a, int b){
        int gcd = Integer.MIN_VALUE;
        for(int i = 1; i<=a && i<=b; i++){
            if(a%i ==0 && b%i ==0){
                gcd = i;
            }
        }
        return gcd;
    }
}
