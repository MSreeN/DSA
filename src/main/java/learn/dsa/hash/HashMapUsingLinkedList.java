package learn.dsa.hash;

import java.util.ArrayList;
import java.util.List;

public class HashMapUsingLinkedList {
    public static void main(String[] args) {
        int size =11;
        List<CustomLinkedList> list = new ArrayList<>(11);
        myHash(list, size);
        insert(list, 5, 15);
        insert(list, 18, 22);
        System.out.println(search(list, 5));
        System.out.println(search(list, 18));
    }

    static void myHash(List<CustomLinkedList> list, int size){
        for (int i = 0; i < size; i++) {
            list.add(i, new CustomLinkedList());
        }
    }

    public static void insert(List<CustomLinkedList> list, int key, int value){
        int index = key % 11;
        CustomLinkedList innerCustom = list.get(index);
        while(innerCustom.next != null){
            innerCustom = innerCustom.next;
        }
        innerCustom.next = new CustomLinkedList(key, value);
    }

    public static int search(List<CustomLinkedList> list, int key){
        int index = key % 11;
        CustomLinkedList innerCustom = list.get(index);
        while(innerCustom.key != key && innerCustom.next != null){
            innerCustom = innerCustom.next;
        }
        if(innerCustom.key != key) return -1;
        return innerCustom.value;
    }
}

 class CustomLinkedList{
    int key;
    int value;
    CustomLinkedList next;

    CustomLinkedList(int key, int value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
    CustomLinkedList(){}

}
