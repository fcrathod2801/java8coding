package com.code.marker;

import java.io.*;

class Employee implements Serializable {
    int id;
    String name;
    double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
}

public class SerializationDemo {
    public static void main(String[] args) throws FileNotFoundException {
        Employee employee1 = new Employee(101, "Avinash Rathod", 10000);
        Employee employee2 = new Employee(102, "Ramesh Rathod ", 15000);
        Employee employee3 = new Employee(103, "Usha Rathod   ", 20000);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("employee.txt"))) {
            oos.writeObject(employee1);
            oos.writeObject(employee2);
            oos.writeObject(employee3);
            System.out.println("Object has been serialized to employee.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            try (ObjectInputStream ois = new ObjectInputStream(
                    new FileInputStream("employee.txt"))) {
                System.out.println("\tID:\t\t\tName:\t\t\t\t\tSalary:");
                System.out.println("----------------------------------------------");
                while (true) {
                    try {
                        Employee emp = (Employee) ois.readObject();
                        System.out.println("\t"+ emp.id+ "\t\t\t" + emp.name+"\t\t\t" + emp.salary);
                    }catch(Exception e){
                        break;
                    }
                }

        }
     catch(Exception e){
        e.printStackTrace();
    }
    }
}