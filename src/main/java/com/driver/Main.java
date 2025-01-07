package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();

        // Setting the value of name using the setter
        obj.setName("John");

        // Accessing the value of name using the getter
        System.out.println("The name is: " + obj.getName());
    }
}