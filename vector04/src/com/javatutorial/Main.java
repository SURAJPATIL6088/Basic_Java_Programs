package com.javatutorial;
import java.util.*;

public class Main
{
    public static void main(String arg[])
    {
        //Create an empty vector
        Vector<Integer> oddVector = new Vector<>();

        //Add elements to the vector
        oddVector.add(1);
        oddVector.add(11);
        oddVector.add(7);
        oddVector.add(3);
        oddVector.add(5);

        //print the vector elements
        System.out.println("Vector elements: "+oddVector);

        //sort vector using Collections.sort method
        Collections.sort(oddVector);

        //print sorted vector
        System.out.println("Vector elements after sorting: "+oddVector);
    }
}
