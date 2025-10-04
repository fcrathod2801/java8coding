package thread.example;

import java.util.*;

class EmployeeNew {
    String name;
    int id;

    EmployeeNew(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Force collision: always return same hash code
    @Override
    public int hashCode() {
        return 1; // all objects go into the same bucket
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EmployeeNew)) return false;
        EmployeeNew other = (EmployeeNew) obj;
        return id == other.id && name.equals(other.name);
    }

    @Override
    public String toString() {
        return "EmployeeNew{name='" + name + "', id=" + id + "}";
    }
}

public class HashCollisionExample {
    public static void main(String[] args) {
        Set<EmployeeNew> set = new HashSet<>();

        EmployeeNew e1 = new EmployeeNew("Avinash", 101);
        EmployeeNew e2 = new EmployeeNew("Ravi", 102);
        EmployeeNew e3 = new EmployeeNew("Neha", 103);
        EmployeeNew e4 = new EmployeeNew("Neha", 103);
        set.add(e1);
        set.add(e2);
        set.add(e3);set.add(e4);

        // All go into the same bucket due to hash collision
        System.out.println("Size of List "+set.size()+"HashSet contents: " + set);
    }
}
