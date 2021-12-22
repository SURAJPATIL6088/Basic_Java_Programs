package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception{
	// write your code here
        int n;
        int a[];

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("how many values you want to be insert :");
        n = Integer.parseInt(dis.readLine());

        a = new int [n];

        for ( int i =0; i<n; i++)
        {
            System.out.println("Enter "+ (i +1 ) +" value" +": ");
            a[i] = Integer.parseInt(dis.readLine());
        }

        System.out.println("Values are : ");
        for ( int i =0; i<n; i++)
        {
            System.out.print(a[i]+ " ");

        }
    }
}
