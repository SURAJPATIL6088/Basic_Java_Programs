package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here
        int n, search;
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the size of the array");
        n = Integer.parseInt(dis.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the Elements in array");
        for(int i =0; i<n; i++)
        {
            arr[i] = Integer.parseInt(dis.readLine());
        }

        System.out.println("Enter the value to be searched in array");
        search = Integer.parseInt(dis.readLine());

        for( int i =0; i<n; i++)
        {
            if(search == arr[i])
            {
                System.out.println("Found at "+"position "+(i+1));
                System.exit(0);
            }
            else
            {
                System.out.println("Not found ");
            }

        }


    }
}
