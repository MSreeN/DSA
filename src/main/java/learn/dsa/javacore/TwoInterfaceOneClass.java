package learn.dsa.javacore;

interface Inter1{
        int count = 0;
    public default void show(){
        System.out.println("From inter1");
    }
}


interface Inter2 extends  Inter1{
    int count = 0;
    public default void show(){
        System.out.println("From inter2");
    }
}

public class TwoInterfaceOneClass implements Inter1, Inter2{
    public static void main(String[] args) {
        new TwoInterfaceOneClass().show();
        System.out.println(Inter1.count);
    }
}
