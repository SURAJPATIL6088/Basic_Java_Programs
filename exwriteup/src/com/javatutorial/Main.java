package com.javatutorial;

public class Main {

    public static void main(String[] args) {
	// write your code here

        /*  1)

import java.util.*;

public class Main
{
    public static void main(String args[])
    {
        //Create an empty Vector of even numbers
        Vector <Integer> evenVector = new Vector <Integer> ();

        //Add elements in the vector
        evenVector.add(2);
        evenVector.add(4);
        evenVector.add(6);
        evenVector.add(8);
        evenVector.add(10);
        evenVector.add(12);
        evenVector.add(14);
        evenVector.add(16);

        //Display the vector
        System.out.println("Vector evenVector contents: " +evenVector);

        //delete the first occurence of an element 4 using remove method
        System.out.println("\nFirst occurence of element 4 removed: "+evenVector.remove((Integer)4));

        //Display the vector
        System.out.println("\nVector contents after remove operation: " +evenVector);

        //Remove the element at index 4 & display the vector

 System.out.println("\nRemove element at index 4: " +evenVector.remove(4));
        System.out.println("\nVector contents after remove: " +evenVector);

        //hashcode for the vector
        System.out.println("\nHash code of the vector = "+evenVector.hashCode());

        //Get the element at index 1
        System.out.println("\nElement at index 1 is = "+evenVector.get(1));
    }
}
         */

        /*   2)

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

         */
    }
}
