package thread.example;

class Address {
    String city;

    Address(String city) {
        this.city = city;
    }
}

class Employee implements Cloneable {
    String name;
    Address address;

    Employee(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    // Deep copy
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Employee cloned = (Employee) super.clone();
        cloned.address = new Address(this.address.city); // new object for Address
        return cloned;
    }
}

public class DeepCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address addr = new Address("Delhi");
        Employee e1 = new Employee("Avinash", addr);

        // Deep copy
        Employee e2 = (Employee) e1.clone();

        // Change address city in copied object
        e2.address.city = "Mumbai";

        System.out.println("e1 address city: " + e1.address.city); // Delhi
        System.out.println("e2 address city: " + e2.address.city); // Mumbai
    }
}
