package learn.dsa.Sorting.model;

import java.util.Comparator;

public record Employee(int id, String name, String salary) implements Comparable<Employee> {

    @Override
    public int compareTo(Employee o1) {
        return o1.id() - this.id();
    }
}
