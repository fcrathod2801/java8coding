package thread.example;

import java.util.*;

class EmployeeInfo {
    String name;
    int id;

    EmployeeInfo(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof EmployeeInfo)) return false;
        EmployeeInfo other = (EmployeeInfo) obj;
        return id == other.id && name.equals(other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class TestEqualsHashCode {
    public static void main(String[] args) {
        Set<EmployeeInfo> set = new HashSet<>();
        set.add(new EmployeeInfo("Avinash", 1));
        set.add(new EmployeeInfo("Avinash", 2)); // duplicate logically

        System.out.println("Set size: " + set.size()); // 1 (because equals+hashCode)
    }
}
