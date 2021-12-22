package com.javatutorial;
import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        // create a vector with initial capacity = 2
        Vector<String> fruits_vec = new Vector<String>(2);

        //add elements to the vector
        fruits_vec.addElement("Grapes");
        fruits_vec.addElement("Melon");
        fruits_vec.addElement("Kiwi");
        fruits_vec.addElement("Apple");

        //print current size and capacity of the vector
        System.out.println("Vector Size: "+fruits_vec.size());
        System.out.println("Default Vector capacity increment: "+fruits_vec.capacity());

        //add more elements to the vector
        fruits_vec.addElement("Orange");
        fruits_vec.addElement("Mango");
        fruits_vec.addElement("Fig");

        //print current size and capacity again
        System.out.println("Vector Size after addition: "+fruits_vec.size());
        System.out.println("Vector Capacity after increment: "+fruits_vec.capacity());

        //print vector elements
        Enumeration fruits_enum = fruits_vec.elements();
        System.out.println("\nVector Elements are:");

        while(fruits_enum.hasMoreElements())
            System.out.print(fruits_enum.nextElement() + " ");
    }
}
