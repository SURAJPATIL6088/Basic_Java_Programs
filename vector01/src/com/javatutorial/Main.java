package com.javatutorial;

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        //Create a vector
        Vector<String> vec = new Vector<String>(6);

        //Adding elements using add() method of List
        vec.add("Tiger");
        vec.add("Lion");
        vec.add("Dog");
        vec.add("Elephant");
//Adding elements using addElement() method of Vector
        vec.addElement("Rat");
        vec.addElement("Cat");
        vec.addElement("Deer");

        System.out.println("Elements are: "+vec);

        System.out.println("\nCapacity of vector :" + vec.capacity());
        System.out.println("\nSize of vector :" + vec.size());
    }
}