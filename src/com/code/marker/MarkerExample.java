package com.code.marker;

interface Secured {}

class ConfidentialData implements Secured{
    public void display(){
        System.out.println("Display Method..!");
    }
}

class SecurityManager {
    public static void checkAccess(Object obj) {
        if (obj instanceof Secured) {
            System.out.println("Access granted to secured data.");
        } else {
            System.out.println("Access denied!");
        }
    }
}

public class MarkerExample {
    public static void main(String[] args) {
        ConfidentialData data = new ConfidentialData();
        SecurityManager.checkAccess(data); // Access granted
   data.display();
    }
}
