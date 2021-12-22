package com.javatutorial;
import java.io.DataInputStream;

public class Main {

    int Add() throws Exception
    {
        int a, b;

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("Enter the Num a : ");
        a = Integer.parseInt(dis.readLine());

        System.out.println("Enter the Num b : ");
        b = Integer.parseInt(dis.readLine());

        return (a+b);
    }

    public static void main(String[] args) throws Exception
    {
        // write your code here
        int c= Add;
    }
}
