package com.javatutorial;
import java.io.DataInputStream;

public class Main {
    public static void main(String[] args) throws Exception
    {
	// write your code here
        int n, i, f;
        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter Integer Value : ");
        n = Integer.parseInt(dis.readLine());

        f = 1;
        for( i=1; i<=n; i++)
        {
            f *= i;
        }
        System.out.println("Factorial of " + n + " is " + f);
    }
}
