package com.javatutorial;
import java.io.DataInputStream;     // header file

public class Main {

    public static void main(String[] args) throws Exception {

        int a, b, c;
        DataInputStream dis = new DataInputStream(System.in);

	System.out.println("Enter first value : ");
    a = Integer.parseInt(dis.readLine());

    System.out.println("Enter second value : ");
    b = Integer.parseInt(dis.readLine());      // input from keyboard

    c = a + b;
    System.out.println("Addition is : " + c);

    }
}
