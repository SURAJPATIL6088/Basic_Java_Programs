package com.javatutorial;
import java.util.Vector;

public class Main
{
    public static void main(String[] args)
    {
        // Create a Vector of String elements
        Vector<String> color_vector = new Vector<String>();

        // Add elements to Vector
        color_vector.add("Violet");
        color_vector.add("Indigo");
        color_vector.add("Blue");
        color_vector.add("Green");
        color_vector.add("Yellow");
        color_vector.add("Orange");
        color_vector.add("Red");

        //Convert Vector to String Array using toArray method
        String[] colorsArray = color_vector.toArray(new String[color_vector.size()]);

        //print Array Elements
        System.out.println("String Array Elements :");

        for(String val:colorsArray)  // for (int i = 0; i < cv.size(); i++)
        {
            System.out.print(val + " ");
// System.out.print(colorsArray[i] + " ");
        }
    }
}