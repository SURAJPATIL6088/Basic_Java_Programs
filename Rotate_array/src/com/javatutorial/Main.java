package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args)throws Exception
    {
	// write your code here
        DataInputStream dis = new DataInputStream(System.in);

        int n, r, i;
        System.out.println("Enter the size of the array : ");
        n = Integer.parseInt(dis.readLine());

        int arr[] = new int[n];

        System.out.println("Enter the elements in array ");
        for( i =0; i<n; i++)
        {
            arr[i] = Integer.parseInt(dis.readLine());
        }

            int l;
            l = arr[n-1];
            for( i =n -2; i>=0; i--)
            {
                arr[i+1] = arr[i];
            }
            arr[0] = l;

        for( i =0; i<n; i++)
        {
            System.out.print(arr[i]+ " ");
        }
    }
}
