package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
	// write your code here
        int r, c;
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter no. of rows : ");
        r = Integer.parseInt(dis.readLine());

        for( int i =0; i<=r; i++)  //
        {
            for( int j =0;j<=i; j++)  //
            {
                System.out.print(" ");
            }
            for(int k = r -i - 1; k>=0; k--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
