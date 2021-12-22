package com.javatutorial;
import java.io.DataInputStream;
public class Main {

    public static void main(String[] args) throws Exception{

        int a, b, c, ch;
        float ar, s;

        DataInputStream dis = new DataInputStream(System.in);

        System.out.println("1. Area of Circle ");
        System.out.println("2. Area of Rectangle ");
        System.out.println("3. Area of Triangle ");

        System.out.println("Enter the Choice : ");
        ch = Integer.parseInt(dis.readLine());

        switch (ch)
        {
            case 1:


        }
    }
}
