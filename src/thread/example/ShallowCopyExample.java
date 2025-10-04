package thread.example;

class Address1 {
    String city;
    Address1(String city) { this.city = city; }
}

class Employee1 implements Cloneable {
    String name;
    Address1 address;

    Employee1(String name, Address1 address) {
        this.name = name;
        this.address = address;
    }

    void display(){
        System.out.println("Name:-"+name+" their Address:- "+address.city);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // shallow copy
    }
}

public class ShallowCopyExample {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address1 addr = new Address1("Delhi");
        Employee1 e1 = new Employee1("John", addr);
        Employee1 e2 = (Employee1) e1.clone();

        e2.name="Avinash";
        e2.address.city = "Mumbai"; // modifies original too
        e1.address.city="Pune";
        e1.display();
        e2.display();
        System.out.println(e1.name+" "+e1.address.city); // Mumbai
        System.out.println(e2.name+" "+e2.address.city); // Mumbai
    }
}
