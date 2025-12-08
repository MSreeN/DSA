package learn.dsa.Sorting;

import learn.dsa.Sorting.model.Employee;

import java.util.*;

public class ArraysSort {

    public static void main(String[] args) {
//        nonPrimitiveSort();
//        primitiveSort();
        sortEmployeeRecord();
    }

    public static void nonPrimitiveSort(){
        int[] arr = {1,6,4,2,7,4,8};
        Arrays.sort(arr);
        for(int a: arr){
            System.out.println(a);
        }
    }

    public static void primitiveSort() {
        Integer[] arr = {5, 6, 8, 2, 4, 8, 4, 3, 7, 5};
//        Arrays.sort(arr, Collections.reverseOrder());
        Arrays.sort(arr, new ArraysSort().new MyComparator());
        for(int a: arr){
            System.out.print(a+" ");
        }
    }

    public static void sortEmployeeRecord(){
        List<Employee>  employeeList= Arrays.asList(
                new Employee(0,"first", "9999"),
                new Employee(3, "khyathi", "3000"),
                new Employee(1, "ram", "5000"),
                new Employee(8, "raj", "900")
        );
        Collections.sort(employeeList);
        employeeList.forEach(System.out::println);
    }

    class MyComparator implements Comparator<Integer>{

        public int compare(Integer o1, Integer o2){
            if(o1 > o2) return -1;
            else if(o1 < o2) return 1;
            else return 0;

        }
    }
}
