package learn.dsa.LinkedList;

import java.util.HashMap;

class LRU<K, V> {
    HashMap<K, Node> map;
    Node head;
    Node tail;

    LRU(int size) {
        this.map = new HashMap<>(size);
        head = null;
        tail = null;
    }

    public static void main(String[] args) {
        LRU<String, Integer> lru = new LRU<>(10);
        lru.put("one", 1);
        lru.put("two", 2);
        lru.put("three", 3);
        lru.get("two");
        lru.get("one");
        lru.get("four");
        lru.delete("two");
    }

    public void put(K key, V value) {
        Node node = new Node(key, value);
        this.map.put(key, node);
        Node temp = this.head;
        if(this.head != null){
        this.head.prev = node;
        }   
        this.head = node;
        node.next = temp;
        this.printNodes(this.head);
    }

    public V delete(K key){
        Node resNode;
        if(this.map.containsKey(key)){
            resNode = this.map.get(key);
            if(resNode.prev != null){
                resNode.prev.next = resNode.next;
            }
            if(resNode.next != null){
                resNode.next.prev = resNode.prev;
            }
        }else{
            System.out.println("Not found");
            return null;
        }
        this.printNodes(this.head);
        return resNode.value;
    }

    public V get(K key) {
        if (this.map.containsKey(key)) {
            Node resNode = this.map.get(key);
            if (resNode.prev != null) {
                resNode.prev.next = resNode.next;
            }
            if (resNode.next != null) {
                resNode.next.prev = resNode.prev;
            }
            resNode.next = this.head;
            this.head.prev = resNode;
            this.head = resNode;
            this.head.prev = null;
            System.out.println("Cache hit: "+resNode.value);
            this.printNodes(this.head);
            return resNode.value;
        } else {
            System.out.println("Cache hit failed for "+key);
            this.printNodes(this.head);
            return null;
        }
    }

    void printNodes(Node head) {
        //iterating through linkedList
        Node duplicateHead = head;
        while (duplicateHead != null) {
            System.out.print(duplicateHead.value + " ");
            duplicateHead = duplicateHead.next;
        }
        System.out.println();
    }

    class Node {
        K key;
        V value;
        Node prev;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }
}

