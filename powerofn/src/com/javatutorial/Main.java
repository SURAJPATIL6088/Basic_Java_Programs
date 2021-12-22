package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    public static void main(String[] args) throws Exception
    {
        int index, base, i;

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the Base Value : ");
        base = Integer.parseInt(dis.readLine());

        System.out.println("Enter the Base Value : ");
        index = Integer.parseInt(dis.readLine());

        int p = 1;
        for( i =1; i<=index; i++)
        {
            p = p * base;
        }
        System.out.println("Power of " + base + " raise to " + index + " is :" + p );
    }
}
