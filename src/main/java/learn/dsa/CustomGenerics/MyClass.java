package learn.dsa.CustomGenerics;

import java.util.ArrayList;
import java.util.List;

class MyClass <T extends Number>{

    T name;

    MyClass(T name){
        this.name = name;
    }

    public T getName(){
        return name;
    }

    public <Z> Z getAge(Z age){
        return age;
    }

    public void wildCard(List<T> city){
//        city.add(46);
    }
}

class Main{
    public static void main(String[] args) {
        MyClass<Integer> myClass = new MyClass<>(1);
        String age = myClass.getAge("22");
        System.out.println(myClass.getName());
    }
}
