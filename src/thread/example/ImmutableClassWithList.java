package thread.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final class Stud{
    public String getName() {
        return name;
    }

    public List<String> getSubject() {
        return subject;
    }

    private final String name;
    private final List<String> subject;

    Stud(String name, List<String> subject) {
        this.name = name;
        this.subject = List.copyOf(subject);
    }

}

public class ImmutableClassWithList {
    public static void main(String ar[]){

        List<String> subject=new ArrayList<>();
        subject.add("Computer Science");
        Stud stud=new Stud("Avinash",subject);
        System.out.println("Original Value --> Name :"+stud.getName()+" Their Subjects :"+stud.getSubject());
        subject.add("Maths");
        System.out.println("Modified Value --> Name :"+stud.getName()+" Their Subjects :"+stud.getSubject());

    }
}
