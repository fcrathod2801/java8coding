package thread.example;

import java.util.Date;

final class Emp{
    private final String name;
    private final Date joiningDate;

    Emp(String name, Date joiningDate) {
        this.name = name;
        this.joiningDate = joiningDate;
    }
    public Date getJoiningDate(){
        return joiningDate;
    }
}
public class ImmutableClass {
    public static void main(String ar[]){
        Date date=new Date();

        Emp e1=new Emp("Avinash",date);
        System.out.println("Original :"+e1.getJoiningDate());
        date.setTime(0);
        System.out.println("Modiffied :"+e1.getJoiningDate());

    }
}
