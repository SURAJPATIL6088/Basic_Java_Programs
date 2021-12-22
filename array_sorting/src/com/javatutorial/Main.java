package com.javatutorial;
import java.io.DataInputStream;
public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here
        DataInputStream dis = new DataInputStream(System.in);

        int n, i, j, x;
        System.out.println("Enter the Size of the array ");
        n = Integer.parseInt(dis.readLine());

        int arr[] = new int[n];

        System.out.println("Enter Element in the Array : ");
        for(i =0; i<n; i++)
        {
            arr[i] = Integer.parseInt(dis.readLine());
        }
        for(i =0; i <= n-2; i++)
        {
            for( j= i + 1; j< n; j++)
            {
                if( arr[i] > arr[j])
                {
                    x = arr[i];
                    arr[i] = arr[j];
                    arr[j] = x;
                }
            }
        }

        System.out.println("Values in Ascending Order : ");
        for(i =0; i<n; i++)
        {
           System.out.print(arr[i] + " ");
        }
    }
}
