package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here
        int arr[] = new int[10];
        int x, i;

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the 10 Values ");
        for( i=0; i<10; i++)
        {
            arr[i]= Integer.parseInt(dis.readLine());
        }

        x = arr[0];
        for(i =0; i<10; i++)
        {
            if(arr[i] >x)
            {
                x = arr[i];
            }
        }

        System.out.println("Values from array : ");
        for( i=0; i<10; i++)
        {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        System.out.print("Maximum Number is "+x);
    }
}
