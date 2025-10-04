package thread.example;

record Person(String name,int age){

}

public class RecordDemo {
    public static void main(String ar[]){

        Person person=new Person("Avinash",20);
        System.out.println(person);
        System.out.println("Original Value "+person.name());
    }
}
